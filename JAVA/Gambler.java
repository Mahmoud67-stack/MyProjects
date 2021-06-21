public class Gambler {
    public static void main(String[] args) {
        double init = Double.parseDouble(args[0]);
        double goal = Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        int i = (int) init;
        int c = n;
        int count = 0;
        System.out.println("Lets start the game!");
        while (n != 0) {
            int rand = (int) (Math.random() * 2);
            if (rand == 0) {
                init--;
                System.out.println("You have lost the bet and your balance is: " + init);
            }
            else {
                init++;
                System.out.println("You have won the bet and your balance is: " + init);
                count++;
            }
            n--;
        }
        if (init == 0) {
            System.out.println("You are now broke oops");
        }
        else if (init < i) {
            System.out.println(
                    "You Ended uo losing " + (i - init) + " With a final balance of " + init);
        }
        else {
            System.out.println(
                    "congratulations You Have reached to " + init + " With extra value of " + (init
                            - i));
            System.out.println("The number of won games is: " + count + " out of " + c + " games");
            System.out.println("The percentage of won games is: " + (((double) count / c) * 100));

        }
    }
}
