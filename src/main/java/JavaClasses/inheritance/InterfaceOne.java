package JavaClasses.inheritance;

public interface InterfaceOne extends ParentInterface {

    void eat(String name);
    void walk(String name);
    void run(String name);

    static void display(){
        System.out.println("I am static method");
    }

    default void display1(){

        System.out.println("I am default method");
    }

}
