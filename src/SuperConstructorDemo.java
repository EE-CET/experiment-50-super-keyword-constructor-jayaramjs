// Parent class
class Person {
    // Constructor of Person
    Person() {
        System.out.println("Person class");
    }
}

// Subclass
class Student extends Person {
    // Constructor of Student
    Student() {
        // Invokes the parent class constructor
        // Note: super() must be the first statement in a constructor
        super();
        System.out.println("Student class");
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        // Creating an instance of Student will trigger the constructor chain
        new Student();
    }
}
