package Lecture18_Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String name;
    private double gpa;
    private int id;

    public Student(String name, double gpa, int id) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
    }

    /**
     * Natural ordering: ascending by GPA.
     * If GPAs are equal, break tie by name alphabetically.
     */
    @Override
    public int compareTo(Student other) {
        int result = Double.compare( other.gpa, this.gpa);
////        if (result == 0)
//            int result = this.name.compareTo(other.name);  // String.compareTo()
        return result;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', gpa=%.2f, id=%d}", name, gpa, id);
    }
    public static void main(String[] args) {

        Student[] roster = {
                new Student("Zaheer",  3.5, 101),
                new Student("Sana",  3.9, 102),
                new Student("Rania", 3.5, 103),
                new Student("Bilal", 2.8, 104)
        };

        // Uses compareTo() automatically — Student's natural ordering
        Arrays.sort(roster);

//        System.out.println("Sorted by GPA (natural order):");
//        for (Student s : roster)
//            System.out.println("  " + s);

//        // Also works with ArrayList via Collections.sort()
        ArrayList<Student> list = new ArrayList<>(Arrays.asList(roster));
        Collections.sort(list);  // same result

        ByIDComparator bid = new  ByIDComparator();
        ByNameComparator bn = new  ByNameComparator();

        Collections.sort(list, bn);
        System.out.println(list);


    }

}
// Strategy 1: Sort by Name A→Z
 class ByNameComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName()); } }

// Strategy 2: Sort by GPA descending (best first)
class ByGPAComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGpa(), o1.getGpa());
    }  // note: o2 first!
}
// Strategy 3: Sort by ID ascending
class ByIDComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}