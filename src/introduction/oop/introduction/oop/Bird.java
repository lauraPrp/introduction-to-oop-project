package introduction.oop;

public abstract class Bird implements Dance {
    protected String name;
    protected String colour;

    public Bird(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public abstract void speak();

    public void fly() {
        System.out.println("Hi there! I can fly.");
    }

    public void spin() {
        System.out.println(name + " spin!");
    }

    public void doTheCaterpillar() {
        System.out.println(name + " do the wriggly woo!");
    }

    public void jump() {
        System.out.println(name + " jump in the air!");
    }

    public void doSomethingInheritable() {
        System.out.println(name + " That's inheritance! class wins");
    }
}