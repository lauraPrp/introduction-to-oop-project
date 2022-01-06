package introduction.oop;


public class MainBirds {
    private static Penguin penguin;
    private static Parrot parrot;
    private static Pigeon pigeon;

    public MainBirds() {

    }

    public static void allJump(Penguin p1, Pigeon p2, Parrot p3) {
        p1.jump();
        p2.jump();
        p3.jump();
    }

    public static void allSpin(Penguin p1, Pigeon p2, Parrot p3) {
        p1.spin();
        p2.spin();
        p3.spin();
    }

    public static void allSpeak(Penguin p1, Pigeon p2, Parrot p3) {
        p1.speak();
        p2.speak();
        p3.speak();
    }

    public static void allFly(Penguin p1, Pigeon p2, Parrot p3) {
        p1.fly();
        p2.fly();
        p3.fly();
    }

    public static void allDoCaterpillar(Penguin p1, Pigeon p2, Parrot p3) {
        p1.doTheCaterpillar();
        p2.doTheCaterpillar();
        p3.doTheCaterpillar();
    }
    public static void doWhatSeaAnimalsDo(Penguin p1) {
        p1.doSomethingInheritable();
        p1.swim();

    }
    public static void main(String[] args) {

        penguin = new Penguin("Pingu", "Black & White");
        parrot = new Parrot("Parry", "Red, yellow & green");
        pigeon = new Pigeon("Pippa", "grey");

        allJump(penguin, pigeon, parrot);
        allSpeak(penguin, pigeon, parrot);
        allSpin(penguin, pigeon, parrot);
        allFly(penguin, pigeon, parrot);
        allDoCaterpillar(penguin, pigeon, parrot);
        doWhatSeaAnimalsDo(penguin);
    }

}