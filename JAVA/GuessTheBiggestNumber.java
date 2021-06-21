public class GuessTheBiggestNumber {
    public static void main(String[] args) {
        int rand1 = (int) (Math.random() * 101);
        int rand2 = (int) (Math.random() * 101);
        System.out.println(
                "If bob chooses the card that has a value of <=49 then the chance of the other card to be bigger in value is 51%");
        System.out.println("So lets see an example here: ");
        System.out.println("We have two valuies chosen from the values 0-100");
        System.out.println("I chose to pick the card number 1 that has the value of: " + rand1);
        if (rand1 > 49) {
            System.out.println(
                    "Since the value of the card that I chosen is greater than 49 so I have 51% chance to win");
            System.out.println("So I do not change my choice and keep as is ");
            System.out.println("Let us reveal the second card...");
            System.out.println("The second card has the value of " + rand2);
            if (Math.max(rand2, rand1) == rand2) {
                System.out.println("I think the odds where against us");
            }
            else
                System.out.println("look I told you");
        }
        else {
            System.out.println(
                    "Since the value of the card that I chosen is less than so I have 51% chance to win");
            System.out.println("So I do change my choice to card number two");
            System.out.println("Let us reveal the second card...");
            System.out.println("The second card has the value of " + rand2);
            if (Math.max(rand1, rand2) == rand1) {
                System.out.println("OOps I think the odds are agianst us");
            }
            else {
                System.out.println("Look I told you");
            }
        }

    }
}
