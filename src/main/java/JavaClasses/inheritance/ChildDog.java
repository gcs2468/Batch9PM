package JavaClasses.inheritance;

public class ChildDog extends Dog {

    /*public void bark(){
        System.out.println("Dog can bark");
    }*/

    void feeding(){
        System.out.println("Child dog can get feeding from parent dog");
    }

    public static void main(String[] args) {

        ChildDog dog = new ChildDog();

        dog.bark();
        dog.feeding();
        dog.eat("ChildDog");
        dog.walk("ChildDog");
        dog.run("ChildDog");

    }

}
