package Two;

public class Faculty extends Employee {
    public static void main(String[] args) {
        new Faculty();

    }

    public Faculty() {
        System.out.println("(4) performs faculty's tasks");
    }
}

class Employee extends Person {
    public Employee() {
        this("(2) Invoke employee's overloaded constructor");
        System.out.println("(3) performs employee's tasks ");

    }

    public Employee(String s) {
        System.out.println(s);
    }
}

class Person{
    public Person(){
        System.out.println("(1) Perform person's tasks");
    }
}
