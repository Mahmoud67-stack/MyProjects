package SoftwareDesign.HW2;

public abstract class Character implements Runnable {
    String name;
    int age;
    String location;
    Thread t;
    UserInterface UI;

    Character(String name, int age, String location, UserInterface UI) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.UI = UI;
    }

    @Override
    public String toString() {
        return "Hello I am " + name + " and I am " + age + " years old";
    }
}
