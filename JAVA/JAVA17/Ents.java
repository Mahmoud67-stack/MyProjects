package SoftwareDesign.Quiz1;

public class Ents extends FreePeople {

    Ents(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    void characteristics() {
        System.out.println("One of The characteristic of Ents is that they look like a tree.");
    }

    @Override
    public String toString() {
        return "The Ent's name is" + name + ", " + gender + ", and is " + age + " years old";
    }
}
