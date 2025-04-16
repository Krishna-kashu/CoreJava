package com.actor;

public class ActorRunner{
        public static void main(String[] args) {

            System.out.println("\n**** Human ******");
            Human human = new Human();
            human.breathe();

            System.out.println("\n******** Person *****");
            Person person = new Person();
            person.express();
            person.breathe();

            System.out.println("\n***** Actor ****");
            Actor actor = new Actor();
            actor.perform();
            actor.express();
            actor.breathe();

            Actor actor1=new Actor(30,"Rakshith Shetty");
            Actor actor2=new Actor(actor1);
            System.out.println(actor2);

        }
    }
