package SoftwareDesign.LAB5.Question2;

public class Manager extends Employee {
    Manager() {
        super();
    }

    Manager(String name, String company, String email, int age, int salary) {
        super(name, company, email, age, salary);
    }

    void Approved() {
        System.out.println("\n" + name + ":\nAPPROVED!");
    }

    @Override
    public String toString() {
        return name + " is a " + age + " year old Manager who works at Dunder Mifflin. He makes $" + salary + " a year. His email is" + email;
    }
}
