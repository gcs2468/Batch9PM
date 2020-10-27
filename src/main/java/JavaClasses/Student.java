package JavaClasses;

public class Student {

    String name;
    int rollno;
    String college;

    String language = "Java";

    Student(){
        //this("Murad", 12, "Oracle");
        System.out.println("Default constructor");

    }

    Student(String name, int rollno, String college){
        this();
        System.out.println("Parameterised constructor");
        this.name = name;
        this.rollno = rollno;
        this.college = college;

    }

    void display(){
        System.out.println(name+"  "+rollno+"  "+college);

    }


    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Chandra", 8, "Oracle");
        s2.display();

        Student s3 = new Student("Mamun", 9, "Oracle");
        s3.display();

        Student s4 = new Student("Rashid", 10, "Oracle");
        s4.display();

        Student s5 = new Student("Rubal", 11, "Oracle");
        s5.display();

    }


}
