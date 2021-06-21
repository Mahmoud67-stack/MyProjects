package SoftwareDesign.Quiz1;

public class Dwarves extends FreePeople {

    Dwarves(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    void characteristics() {
        System.out.println("One of The characteristic of Dwarves is that they are very good at mining precious metals" +
                "\n and they can make good things with them.");
    }

    @Override
    public String toString() {
        return "The Ent's name is" + name + ", " + gender + ", and is " + age + " years old";
    }
}
