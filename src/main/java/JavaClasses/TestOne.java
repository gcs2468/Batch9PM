package JavaClasses;

import org.testng.Assert;

public class TestOne {

    // variables

    // methods =
    // non static methods

    void m1(){
        System.out.println("I am non static method m1()");
    }

    // static methods

    static void m2(){
        System.out.println("I am static method m2()");
    }

    // parameterised methods

    void m3(String name, int rollNo){
        System.out.println(name);
        System.out.println(rollNo);

        S1_VariablesExample obj = new S1_VariablesExample();
        System.out.println(obj.sName);

        System.out.println(S1_VariablesExample.country);

    }

    // return type of methods


    public static void main(String[] args) {

        TestOne testOne = new TestOne();

        testOne.m1();

        testOne.m3("Java", 10);

        TestOne.m2();

        MethodsTypes.m7();

        S1_VariablesExample obj = new S1_VariablesExample();
        System.out.println(obj.sName);

    }


}
