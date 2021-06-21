package SoftwareDesign.LAB2;

class Person {
    String name;
    int age;

    Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void getDetails() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}

class Employee extends Person {
    int salary;

    Employee(int age, String name, int salary) {
        super(age, name);
        this.salary = salary;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Salary: $" + salary);
    }
}

class Student extends Person {
    String major;

    Student(int age, String name, String major) {
        super(age, name);
        this.major = major;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Major: " + major);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        // This is a run or a test for the parent class
        Person someone = new Person(17, "Mahmoud");
        someone.getDetails();

        System.out.println();

        //This is a run or a test for the Employee subclass
        Employee employee = new Employee(35, "Hassan", 9000);
        employee.getDetails();

        System.out.println();

        //This is a run or a test for the Employee subclass
        Student student = new Student(35, "Ezeldean", "Computer Science and Engineering");
        student.getDetails();
    }
}
