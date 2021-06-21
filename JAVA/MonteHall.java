public class MonteHall {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = n;
        int randoor = ((int) (Math.random() * 3)) + 1;
        int count = 0;
        int count2 = 0;
        System.out.println(
                "You are playing the doors game, and you choose a door from the 3 doors\nAnd the producer opened one of the doors");
        System.out.println("The producer promots you to switch your door or not");
        System.out.println("I will cover both cases");
        while (n > 0) {
            int choice = ((int) (Math.random() * 3)) + 1;
            int opened = Math.abs(randoor - choice);
            if (opened == 0) {
                opened = randoor + 1;
                count2++;
                System.out.println("You kept your choice and you won");
            }
            else {
                count++;
                System.out.println("You switched the doors and you won");
            }
            n--;
        }
        System.out.println(
                "The times that you won from not changing your chioice is " + count2 + " out of "
                        + x + "\nWith percentage of " + ((count2 / (1.0 * x)) * 100));
        System.out.println("The times that you won from switching is " + count + " out of " + x
                                   + "\nWith percenatge of " + ((count / (1.0 * x)) * 100));
    }
}
