package capsule;

class Runner{
    public static void main(String[] args) {
        Person person = new Person();

        person.age=10;
        person.name="Rishi";
//        person.setAge(10);
//        person.setName("Krishna");
//
//        System.out.println("Name: "+person.getName()+"  Age: "+person.getAge());
        System.out.println("Name: "+person.name+"  Age: "+person.age);
    }
}