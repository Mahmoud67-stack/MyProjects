package SoftwareDesign.LAB7.Question2;

public class Flag {
    String color;

    int location;

    Flag() {
        color = "GREY";

        location = 5;
    }

    public synchronized String getColor() {
        return color;
    }

    public synchronized void setColor(String color) {
        this.color = color;
    }

    public synchronized void setLocation(int location) {
        this.location = location;
    }

    public synchronized int getLocation() {
        return location;
    }


    @Override
    public String toString() {
        return "The flag is located at: " + location + "\nAnd colored with: " + color;
    }
}
