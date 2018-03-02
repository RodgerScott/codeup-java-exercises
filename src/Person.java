public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person0 = new Person("Geoff");

        System.out.println(person0.getName());

        person0.setName("Steve");

        person0.sayHello();

// Understanding References:

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//
//        System.out.println(person1.getName().equals(person2.getName()));
        //True
//        System.out.println(person1 == person2);
        //False

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        //True

        Person person1 = new Person("John");
        Person person2 = person1;
        Person person3 = person2;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person3.getName());
    }
}
