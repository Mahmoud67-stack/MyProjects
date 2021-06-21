package SoftwareDesign.LAB7.Question2;

public class Flagb {
    String color;

    int location;

    Flagb() {
        color = "GREY";

        location = 5;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }


    @Override
    public String toString() {
        return "The flag is located at: " + location + "\nAnd colored with: " + color;
    }
}
