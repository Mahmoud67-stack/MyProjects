package SoftwareDesign.Quiz1;

public class Men extends FreePeople {

    Men(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    void characteristics() {
        System.out.println("Mankind have no unique characteristic from other creatures except that they" +
                "\ndifferent from Ents in the shape and they do not get as old as the other free people");
    }

    @Override
    public String toString() {
        return "The Ent's name is" + name + ", " + gender + ", and is " + age + " years old";
    }
}
