package SoftwareDesign.LAB7.Question2;

public abstract class TeamsB {
    String team_color;

    int location;

    Flagb flag;

    TeamsB() {

    }

    TeamsB(String team_color, int location, Flagb flag) {
        this.team_color = team_color;
        this.location = location;
        this.flag = flag;
    }

    public void move(int steps) {
        synchronized (flag) {
            flag.location += steps;
            System.out.println("The flag was moved to " + flag.location);
        }
    }
}
