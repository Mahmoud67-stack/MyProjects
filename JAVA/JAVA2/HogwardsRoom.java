package SoftwareDesign.HW2;

public abstract class HogwardsRoom {

    String Placename, location;
    UserInterface UI;

    HogwardsRoom(String Placename, String location, UserInterface UI) {
        this.location = location;
        this.Placename = Placename;
        this.UI = UI;
    }

    abstract void next();
}
