package JavaClasses.inheritance;

public class Cat extends Animal {

    void meow(){
        System.out.println("Cat can say meow");
    }

    public static void main(String[] args) {

        Cat cat = new Cat();

        System.out.println(cat.animal);

        cat.meow();
        cat.eat("Cat");
        cat.walk("Cat");
        cat.run("Cat");
    }








}
