package JavaClasses;

public class MethodsTypes {

    String name = "Chandra";
    static String collage = "Xyz University";

    // To understand return type of methods
    String m5() {
        return name;

    }

    void m6() {
        String myName = m5();
        System.out.println(myName);

        int myRollNo = m3();
        System.out.println(myRollNo);
    }

    int m3(){
        return 10;

    }

    // To understand static and non-static methods
    static void m7(){
        System.out.println("I am static method m7()");

    }

    void m8() {
        System.out.println("I am non-static method m8()");

    }

    // Accessing static and non static variables

    void m1(){
        System.out.println(name);
        System.out.println(collage);
    }

    static void m2(){
        MethodsTypes obj = new MethodsTypes();
        System.out.println(obj.name); // non static variable can be accessed in static method through object of the class
        System.out.println(collage);
    }


    // return type of method

    void m4(){
        System.out.println("");
    }

    int m9(){

        return 10;
    }

    boolean m10(){

        return false;
    }

    long m11(){
        return 10L;
    }

    String m12(){
        System.out.println("m12()");



        return "Java";

    }

    void m13(){
        String name = m12();
        System.out.println(name);
    }


    public static void main(String[] args) {
        MethodsTypes obj = new MethodsTypes();

        obj.m6();
        obj.m13();

        //MethodsTypes.m7();
    }

}



