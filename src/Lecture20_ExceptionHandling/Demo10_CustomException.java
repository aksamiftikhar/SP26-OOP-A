package Lecture20_ExceptionHandling;

/* ============================================================================
 *  Demo 10  ·  User-Defined Exception Classes  (OPTIONAL section)
 * ============================================================================
 *
 *  This demo accompanies the OPTIONAL section of the lecture. The built-in
 *  exceptions (IllegalArgumentException, IllegalStateException, etc.) are
 *  enough for most situations -- but when an error is meaningful in YOUR
 *  domain, defining your own exception class buys you three things:
 *
 *    1. A meaningful name      InsufficientFundsException reads better than
 *                              a generic IllegalStateException.
 *
 *    2. Targeted catching      Callers can react to YOUR exception
 *                              specifically, without sweeping up unrelated
 *                              runtime exceptions.
 *
 *    3. Domain-specific data   Your exception class can carry extra
 *                              fields -- the requested amount, the
 *                              available balance, the offending product
 *                              code -- that the handler can inspect.
 *
 *  A custom exception is just a normal class that EXTENDS an existing
 *  exception type. You already know how to write a class -- nothing new.
 *  The choice of parent decides whether YOUR exception is checked or
 *  unchecked.
 * ============================================================================ */
public class Demo10_CustomException {

    public static void main(String[] args) {
        BankAccount2 acc = new BankAccount2();
        acc.deposit(200);

        // Case 1 -- a withdraw that fits ----------------------------------
        try {
            acc.withdraw(50);
            System.out.println("Withdrew 50. Balance now: " + acc.getBalance());
        } catch (InsufficientFundsException ex) {
            // not reached
        }

        // Case 2 -- a withdraw that overdraws ------------------------------
        try {
            acc.withdraw(500);
        } catch (InsufficientFundsException ex) {
            // We chose a CUSTOM type, so the catch is precise: only this
            // domain failure is handled here. A generic RuntimeException
            // catch would have caught it too, but it would also catch
            // unrelated NullPointer / Arithmetic / etc. bugs by accident.
            System.out.println("Declined: " + ex.getMessage());

            // Because the exception carries DOMAIN-SPECIFIC fields, the
            // handler can compute a precise response -- here we tell the
            // user exactly how short they are.
            double shortfall = ex.getRequested() - ex.getAvailable();
            System.out.printf("You are short by %.2f.%n", shortfall);
        }
    }
}

/* ────────────────────────────────────────────────────────────────────────
 *  The custom exception itself.
 *
 *  We extend RuntimeException, which makes this an UNCHECKED exception.
 *  This is a deliberate design choice: an attempt to overdraw is the
 *  caller's fault (they should check the balance first), so we treat it
 *  similarly to IllegalArgumentException -- not a checked, declared
 *  failure mode.
 *
 *  If we had instead extended Exception, callers would be FORCED to
 *  declare 'throws InsufficientFundsException' or wrap calls in try/catch.
 * ──────────────────────────────────────────────────────────────────────── */
class InsufficientFundsException extends RuntimeException {

    private final double requested;
    private final double available;

    public InsufficientFundsException(double requested, double available) {
        // Constructor chaining (Lecture 13) at work -- super(...) sends the
        // message string up to RuntimeException's constructor, which itself
        // sends it to Throwable. Throwable stores it, and getMessage()
        // returns it.
        super("requested " + requested + " but only " + available + " available");
        this.requested = requested;
        this.available = available;
    }

    // Plain getters -- standard encapsulation. Handlers use these to decide
    // exactly how to respond to the failure.
    public double getRequested() { return requested; }
    public double getAvailable() { return available; }
}

/* ────────────────────────────────────────────────────────────────────────
 *  A tiny BankAccount2 to drive the demo. (Named with a 2 to avoid
 *  clashing with the BankAccount in Demo 07 if these are compiled together.)
 * ──────────────────────────────────────────────────────────────────────── */
class BankAccount2 {
    private double balance = 0;

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "deposit must be positive, got " + amount);
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        // Throwing INSTEAD of returning false guarantees the caller cannot
        // silently ignore the problem -- and the rich exception object
        // gives them everything they need to recover.
        if (amount > balance) {
            throw new InsufficientFundsException(amount, balance);
        }
        balance -= amount;
    }
}

/*  EXPECTED OUTPUT  ─────────────────────────────────────────────────────────
 *
 *      Withdrew 50. Balance now: 150.0
 *      Declined: requested 500.0 but only 150.0 available
 *      You are short by 350.00.
 *
 *  CHOOSING A PARENT -- Exception or RuntimeException?
 *
 *    extends Exception          --> CHECKED. Use this when the failure is
 *                                   part of your method's contract and
 *                                   callers really must think about it
 *                                   (e.g. file-not-found-style problems).
 *
 *    extends RuntimeException   --> UNCHECKED. Use this for misuse of the
 *                                   API (bad arguments, illegal state).
 *                                   Similar in spirit to
 *                                   IllegalArgumentException.
 *
 *  KEY TAKEAWAY:
 *  Defining a custom exception is the moment exception handling becomes
 *  OBJECT-ORIENTED DESIGN. You are creating a new type that names a
 *  domain concept ("insufficient funds") and packages the data needed
 *  to respond to it. That is exactly the kind of class design we
 *  practiced in Chapter 8 and 9 -- now applied to errors.
 * ─────────────────────────────────────────────────────────────────────── */
