package SoftwareDesign.LAB5.Question2;

public class Receptionist extends Employee {

    Receptionist() {
        super();
    }

    Receptionist(String name, String company, String email, int age, int salary) {
        super(name, company, email, age, salary);
    }

    @Override
    public String toString() {
        return name + " is a " + age + " year old Receptionist who works at Dunder Mifflin. He makes $" + salary + " a year. Her email is" + email;
    }

}
