package com.actor;

public class Actor extends Person {
    private String actorName;
    private int actorAge;

    public Actor() {
        System.out.println("no-arg constructor of Actor");
    }
    public Actor(int actorAge, String actorName) {
        this.actorAge=actorAge;
        this.actorName=actorName;
        System.out.println("int, String constructor of Actor");
    }
    public Actor(Actor actor){
        this.actorAge=actor.actorAge;
        this.actorName=actor.actorName;
    }

    @Override
    public String toString() {
        return "Actor name: "+actorName+" Actor Age: "+actorAge;
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
