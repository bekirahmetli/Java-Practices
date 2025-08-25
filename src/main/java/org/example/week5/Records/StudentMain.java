package org.example.week5.Records;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Bekir","Ahmetli",454535);
        Student student2 = new Student("Ayşe","Al",665432);
        Student student3 = new Student("Ali","Arı",654531);

        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("----------------------------");
        // Test hashCode and equals methods
        Student student4 = new Student("Bekir", "Ahmetli", 454535); // Same as student
        System.out.println("student hashCode: " + student.hashCode());
        System.out.println("student4 hashCode: " + student4.hashCode());
        System.out.println("Are student and student4 equal? " + student.equals(student4));
        System.out.println("Are student and student2 equal? " + student.equals(student2));
    }
}
