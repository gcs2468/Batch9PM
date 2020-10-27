package JavaClasses;

public class S4_ArrayExample {

    public static void main(String[] args) throws InterruptedException {

        m1();

        int[] arr1 = new int[5];

        //Thread.sleep(1000);

        /*try {
            // data insertion
            arr1[0] = 10;
            arr1[1] = 20;
            arr1[2] = 30;
            arr1[3] = 40;
            arr1[4] = 50;
            arr1[5] = 60; // ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        catch (NullPointerException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }*/

        // data insertion
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;
        arr1[5] = 60; // ArrayIndexOutOfBoundsException

        for(int i = 0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }


/*
        // multi dimensional array

        int[][] arr2 = new int[2][2];

        arr2[0][0] = 10;
        arr2[0][1] = 20;

        arr2[1][0] = 30;
        arr2[1][1] = 40;

        System.out.println("Array 2 size is :: "+arr2.length);

        for (int r = 0; r < arr2.length; r++ ) {

            for (int c = 0; c < arr2.length; c++ ) {

                System.out.println(arr2[r][c]);

            }
        }*/


    }

    static void m1() throws InterruptedException, ArithmeticException {
        System.out.println(10/0);
        Thread.sleep(1000);
    }

    void m2() throws ArithmeticException {
        System.out.println(10/0);
    }

    static void votingSystem(int age) {

        if(age >= 18){
            System.out.println("Candidate is eligible for voting");
        }else {
            System.out.println("Candidate is not eligible for voting");
        }
    }

}
