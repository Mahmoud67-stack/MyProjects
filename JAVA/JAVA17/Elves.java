package SoftwareDesign.Quiz1;

public class Elves extends FreePeople {

    Elves(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    void characteristics() {
        System.out.println("One of The characteristic of Elves is that they cannot become sick.");
    }

    @Override
    public String toString() {
        return "The Ent's name is" + name + ", " + gender + ", and is " + age + " years old";
    }
}
