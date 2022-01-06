package introduction.oop;

public interface SeaCreature {
    void swim();
    void sing();
    void crawl();

    default void doSomethingInheritable() {}
}
