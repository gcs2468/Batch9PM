package JavaClasses;

public class S2_ConditionalStatements {

    public static void ifCondition(int marks) {

        if (marks >= 40) {
            System.out.println("Student is passed with marks :: " + marks);
        } else {
            System.out.println("Student is failed with marks :: " + marks);
        }

    }

    static void verifyEvenNumber(int num) {
        if (num % 2 == 0) {
            System.out.println("Given num is even");
        } else {
            System.out.println("Given num is not even");
        }
    }

    public static void elseIl̥fCondition(int m) {

        if (m >= 40 && m <= 60) { // 40 - -60 ; AND
            if(m == 40) {
                System.out.println("Student is passed with boarder marks");
            } else {
                System.out.println("Student is passed with grade C");
            }
        } else if (m >= 61 && m <= 80) {
            System.out.println("Student is passed with grade B");
        } else if (m >= 81 && m <= 100) {
            System.out.println("Student is passed with grade A");
        } else {
            System.out.println("Student is failed");
        }

    }

    public static void switchCase(String week) {

        switch (week) {

            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Tuesday":
                System.out.println("Today is Tuesday");
                break;
            case "Wednsday":
                System.out.println("Today is Wednsday");
                break;
            default:
                System.out.println("The week you given not available");

        }

        System.out.println("outside switch");

    }

    public static void main(String[] args) {

        //ifCondition(40);

        elseIl̥fCondition(40);

        //switchCase("Sunday");
        //verifyEvenNumber(5);

        //m3();
    }


    void m1(){


    }


    static String m2(){

        System.out.println("in m2() method");
        return "Java";
    }

    static int m4(){

        return 5;
    }

    static boolean m5(){

        return false;
    }

    static void m3(){
        String var1 = m2();
        System.out.println(var1); // Java
    }


}
