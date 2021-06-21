package SoftwareDesign.LAB10.Question2;

import java.util.Random;

public class Driver {
    public static void main(String[] args)
    {
        Random r = new Random();

        int random = r.nextInt(5);

        Crewmate [] crewmates = new Crewmate[5];
        String color = "White";
        for (int i = 0; i<5; i++)
        {
            switch (i) {
                case 1:
                    color = "Blue";
                    break;
                case 2:
                    color  = "Red";
                    break;
                case 3:
                    color  = "Black";
                    break;
                case 4:
                    color  = "Orange";
                    break;
            }
            if (i== random)
                crewmates[i] = new Imposter(color);
            else
                crewmates[i] = new Normal(color);
        }

    }
}
