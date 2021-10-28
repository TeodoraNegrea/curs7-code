package ro.fasttrackit.temacurs7;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Andrei", 26);
        System.out.println(person.hasName());
        System.out.println(person.getAge());
        person.isMarried();


    }
}
