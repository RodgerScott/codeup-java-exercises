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
        Person person1 = new Person("Geoff");

        System.out.println(person1.getName());

        person1.setName("Steve");

        person1.sayHello();
    }
}
