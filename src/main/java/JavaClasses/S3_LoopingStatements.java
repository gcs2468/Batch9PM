package JavaClasses;

public class S3_LoopingStatements {

    public static void m1() {

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

    }

    public static void forLoop() {

        for (int i = 1; i <= 10; i++) {

            for(int j = 1; j <= 10; j++) {

                System.out.println("Value of i is :: " + i);
                System.out.println("Value of j is :: " + j);
            }
        }

        System.out.println("outside for loop");
    }

    public static void whileLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.println("Value is :: " + i);
            i++;
        }
        System.out.println("out of while");
    }

    public static void doWhileLoop() {
        int i = 1;
        do {
            System.out.println("Value is :: " + i);
            i++;
        }
        while (i <= 10);
        System.out.println("After do while");
    }

    public static void continueStmt() {

        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 8 || i == 9) {

                System.out.println("In continue");
                continue;
            }
            System.out.println("Iteration number is :: " + i);
        }
        System.out.println("outside for loop");
    }

    public static void breakStmt() {

        for (int i = 1; i <= 10; i++) {

            System.out.println("Before break :: " + i);
            if (i == 5) {
                System.out.println();
                break;
            }
            System.out.println("After break :: " + i);
        }
        System.out.println("outside for loop");
    }

    public static void main(String[] args) {

        forLoop();
        //whileLoop();
        //doWhileLoop();
        //continueStmt();
        //breakStmt();
    }

}
