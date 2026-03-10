# SP26 OOP – Section A

Object-Oriented Programming course materials organized by lecture.

## Lectures

| Package | Lecture | Topics |
|---|---|---|
| `lecture01` | Lecture 1 | Hello World, Scanner |
| `lecture02` | Lecture 2 | Class and Object, Default Package |
| `lecture03` | Lecture 3 | Private, Public, Setter, Getter, Constructors |
| `lecture04_05` | Lectures 4 & 5 | Static, Non-Static, Intro to Final, toString |
| `lecture06` | Lecture 6 | Final Variable Initialization in Constructors, `this` Keyword, Constructor & Method Overloading, Scope & Lifetime of Variables |
| `lecture07` | Lecture 7 | Arrays |
| `lecture08` | Lecture 8 | 2D Arrays |

## Source Structure

```
src/
├── lecture01/          Welcome.java
├── lecture02/          Example.java
├── lecture03/          Car.java, CarTest.java, Shape.java
├── lecture04_05/       Shape2.java (+ Rectangle)
├── lecture06/          Car.java
├── lecture07/          Car.java
└── lecture08/          Car.java, GradeBook.java, GradeBookTest.java,
                        TwoDArrayVariationsPractice.java (+ Student)
```

## How to Compile

```bash
javac -d out src/lecture01/*.java src/lecture02/*.java src/lecture03/*.java src/lecture04_05/*.java src/lecture06/*.java src/lecture07/*.java src/lecture08/*.java
```

## How to Run

```bash
# Example: run Welcome from lecture01
java -cp out lecture01.Welcome
```
