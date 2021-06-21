package SoftwareDesign.LAB5.Question2;

abstract class Employee {
    String name, company, email;
    int age, salary;


    Employee() { // This will initialize all premitive values to 0 and strings to null
    }

    Employee(String name, String company, String email, int age, int salary) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }


}
