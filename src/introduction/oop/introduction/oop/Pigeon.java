package introduction.oop;

public class Pigeon extends Bird {

    //The Pigeon constructor calls the base class Bird constructor
    //The name and color parameters are passed to the Bird constructor
    public Pigeon(String name, String colour) {
        super(name, colour);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + colour + " pigeon.");
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }

    public void sleep() {
        System.out.println("Im a sleeping pigeon");
    }

}
