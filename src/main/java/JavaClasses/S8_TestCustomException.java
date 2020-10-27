package JavaClasses;

public class S8_TestCustomException {

    public static void m1(int marks) throws MyCustomException, NullPointerException, ArithmeticException {

        if (marks >= 40) {
            System.out.println("Student is passed with marks :: " + marks);
        }
        else if (marks < 0){

            throw new MyCustomException("Entered marks are not valid");
            //throw new S7_CustomException("Entered marks are not valid");

        } else {
            System.out.println("Student is failed with marks :: " + marks);
        }

    }

    public static void main(String[] args) throws MyCustomException {

        m1(-10);

    }

    String m2(){
        for (int x = 0; x <=20; x++) {
            if (x == 10) {
                break;
                //System.out.println("");
            }
        }
        return "";
        //System.out.println("");
    }

}
