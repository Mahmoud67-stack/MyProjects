package SoftwareDesign.HW2;

public class Library extends HogwardsRoom {
    Hermione hermione;
    Harry harry;

    Library(Harry harry, UserInterface UI) {
        super("Library", "West", UI);
        this.harry = harry;
        hermione = new Hermione(harry, UI);
        UI.write("The Library is where students spend a lot of their time once the" +
                "\nacademic year starts. Hermione is here.");
    }
    @Override
    void next() {
        // No Next
    }
}
