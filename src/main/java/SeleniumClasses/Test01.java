package SeleniumClasses;

public class Test01 {

    void m1() {
        System.out.println("Hello");
    }

    static void m2(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        Test01 obj = new Test01();
        obj.m1();

        Test01.m2();

    }

}
