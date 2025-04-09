package Actor;

public class Actor extends Person {
    public Actor() {
        System.out.println("no-arg constructor of Actor");
    }

    public void perform() {
        System.out.println("Running perform in Actor");

        Human human1 = new Human();
        Human human2 = new Person();
        Human human3 = new Actor();

        Person person1 = new Person();
        Person person2 = new Actor();

        Actor actor1 = new Actor();
    }
}
