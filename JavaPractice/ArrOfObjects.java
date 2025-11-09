class Student {
    int roll;
    String name;
}

public class ArrOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shiva";
        s1.roll = 1;
        Student s2 = new Student();
        s2.name = "Harry";
        s2.roll = 2;
        Student s3 = new Student();
        s3.name = "David";
        s3.roll = 3;

        Student[] stud = new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        System.out.println("Students data");
        for (Student student : stud) {
            System.out.println(student.roll + " " + student.name);
        }


    }
}
