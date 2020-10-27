package JavaClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class S6_ExceptionHandling {

    static void m1() {
        FileInputStream fis = null;
        // Checked Exceptions
        try {
            File file = new File("C:\\Users\\Gomasa\\Desktop\\TestData_Old.xlsx");
            fis = new FileInputStream(file);
            System.out.println("After fileInputStream");
        } catch (FileNotFoundException e){
            System.out.println("In catch block one");
            e.printStackTrace();
        } catch(Exception e1){
            System.out.println("In catch block two");
            e1.printStackTrace();
        } finally {
            // close resources
            System.out.println("In finally block");
            try {
                fis.close();
            }catch (NullPointerException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of method");

    }

    static void m2() throws S7_CustomException {
        try {
            System.out.println(10 / 0); // / by zero
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        S6_ExceptionHandling.m1();
    }


}
