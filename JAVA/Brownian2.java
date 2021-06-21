class Game {
    String name;
    int number_of_teams;

    Game() {
        name = "None";
        number_of_teams = 0;
    }

    Game(String name, int number_of_teams) {
        this.name = name;
        this.number_of_teams = number_of_teams;
    }

    public void score() {
        System.out.println("Team " + (int) ((Math.random() * number_of_teams) + 1) + " scored!");
    }

    @Override
    public String toString() {
        String statement = "Game Name: " + name + "\nNumber of Teams: " + number_of_teams;
        return statement;
    }
}

class Basketball extends Game {
    Basketball() {
        name = "Basketball";
    }

    Basketball(int number) {
        name = "Basketball";
        number_of_teams = number;
    }
}

class Football extends Game {
    Football() {
        name = "Football";
    }

    Football(int number) {
        number_of_teams = number;
        name = "Football";
    }
}

public class GameTest {
    public static void main(String[] args) {
        Football f = new Football(2);
        System.out.println(f);
        f.score();
    }
}
