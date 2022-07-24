package ClassInstance;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        t1.printTeacher();
        System.out.println();
        t2.printTeacher();
        System.out.println();
        t3.printTeacher();
        System.out.println();

        Course c1 = new Course("Matematik", "MAT");
        Course c2 = new Course("FIZIK", "FZK");
        Course c3 = new Course("KIMYA", "KMY");

        c1.addTeacher(t1);
        System.out.println();
        c2.addTeacher(t2);
        System.out.println();
        c3.addTeacher(t3);
        System.out.println();

        Student s1 = new Student("Furkan", "189", "1. class", c1, c2, c3);
        Student s2 = new Student("Faruk", "39", "2. class", c1, c2, c3);
        Student s3 = new Student("Tuba", "566", "3. class", c1, c2, c3);

        s1.addBulkExamNote(100, 34, 56);
        s1.addBulkExamSozluNote(34, 56, 78);
        s1.avarage();
        System.out.println();
        s2.addBulkExamNote(48, 68, 97);
        s2.addBulkExamSozluNote(13, 75, 99);
        s2.avarage();
        System.out.println();
        s3.addBulkExamNote(34, 43, 65);
        s3.addBulkExamSozluNote(12, 23, 100);
        s3.avarage();

    }
}
