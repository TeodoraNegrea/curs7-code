package ro.fasttrackit.temacurs7;

public class Person {
    private String name;
    private int age;
    private boolean married;


    public Person(String name, int age) {
        this.name = "Andrei";
        this.age = 26;
        this.married = false;
    }

    public String hasName() {
        return name;
    }

    public int getAge() {
        return age;

    }

    public void  isMarried() {
        if (!this.married) {
            System.out.println("This person is not married!");
        } else {
            this.married = false;
        }
    }
}