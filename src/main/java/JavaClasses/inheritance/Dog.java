package JavaClasses.inheritance;

public class Dog extends Animal {

    public void bark(){
        System.out.println("Dog can bark");
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.bark();
        dog.eat("Dog");
        dog.walk("Dog");
        dog.run("Dog");

    }

}
