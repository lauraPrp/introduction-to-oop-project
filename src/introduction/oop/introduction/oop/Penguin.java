package introduction.oop;

public class Penguin extends Bird implements SeaCreature {

    public Penguin(String name, String colour) {
        super(name, colour);
    }

    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + colour + " penguin.");
    }

    @Override
    public void fly() {
        System.out.println("Whoops, I can't fly. Waddle waddle.");
        swim();
    }


    @Override //inherits from SeaCreature interface
    public void swim() {
        System.out.println("I'm better at swimming");
    }

    @Override
    public void sing() {
        System.out.println("Sorry. I'm not a siren");
    }

    @Override
    public void crawl() {
        System.out.println("That's for crabs");
    }


}