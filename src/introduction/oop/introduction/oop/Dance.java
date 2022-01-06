package introduction.oop;

public interface Dance {
    void spin();

    void doTheCaterpillar();

    default void doSomethingInheritable() {
    }
}
