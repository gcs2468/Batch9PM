package JavaClasses;

public class S1_VariablesExample {


    // instance variables

    String sName = "Chandra";
    int rollNo = 10;

   static String country = "USA";


    void m1() {

        String name = "Java"; // Local Variable
        System.out.println(sName);

    }

    void m2() {

        String name1 = "Selenium";
        //System.out.println(name);
        System.out.println(sName);
        System.out.println(S1_VariablesExample.country);
    }

    static void m3() {

        S1_VariablesExample obj = new S1_VariablesExample();
        System.out.println(obj.sName);

        System.out.println(S1_VariablesExample.country);
    }


    void add() {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }


    public static void main(String[] args) {

        S1_VariablesExample obj = new S1_VariablesExample();

        System.out.println(obj.sName);

        System.out.println(S1_VariablesExample.country);

        obj.m1();
        obj.m2();
        obj.add();

        S1_VariablesExample.m3();

    }


}









