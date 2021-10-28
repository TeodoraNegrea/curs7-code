package ro.fasttrackit.temacurs7;

public class PeopleMain {
    public static void main(String[] args) {
        People people = new People("Mihai", 34, true);
        People people2 = new People("Ionut", 36, false);
        People people3 = new People("Serban", 33, true);
        System.out.println(people.hasName());
        System.out.println(people2.hasName());
        System.out.println(people3.hasName());
        System.out.println(people.getAge());
        System.out.println(people2.getAge());
        System.out.println(people3.getAge());
        people.isMarried();
        people2.isMarried();
        people3.isMarried();






    }
}
