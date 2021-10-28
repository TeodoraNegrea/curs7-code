package ro.fasttrackit.temacurs7;

import java.util.Scanner;

public class People {
    private String name;
    private int age;
    private boolean married;

    public People(String name, int age, boolean married) {
        Scanner console = new Scanner(System.in);
        this.name = name;
        this.age = age;
        this.married = married;
    }
        public String hasName(){
            return name;
    }
    public int getAge(){
        return age;
    }
    public void isMarried(){
        if(!this.married) {
            System.out.println("This people is married");
        }else {
            System.out.println("This peolple is not married");
        }
    }
}
