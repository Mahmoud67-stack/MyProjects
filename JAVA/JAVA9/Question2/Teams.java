package SoftwareDesign.LAB7.Question2;

public abstract class Teams {
    String team_color;

    int location;

    Flag flag;

    Teams() {

    }

    Teams(String team_color, int location, Flag flag) {
        this.team_color = team_color;
        this.location = location;
        this.flag = flag;
    }

    public synchronized void move(int steps) {
        flag.setLocation(flag.getLocation() + steps);
        System.out.println("The flag was moved to " + flag.location);
    }
}
