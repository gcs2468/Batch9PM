package JavaClasses.inheritance;

public class AnimalOne extends AbstractExample {

    String animal = "Animal Class";

    public void eat(String name){
        System.out.println(name+" can eat");
    }

    public void walk(String name){

        System.out.println(name+" can walk");
    }

    public void run(String name){
        System.out.println(name+" can run");
    }


}
