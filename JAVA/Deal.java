public class Deal {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        String[] RANK = {
                "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King", "Ace"
        };
        String[] SUIT = { "Hearts", "Spades", "Diamonds", "Clubs" };
        String[] deck = new String[(RANK.length - 1) * SUIT.length];
        int k = 0;
        for (int i = 0; i < SUIT.length; i++)
            for (int j = 1; j < RANK.length; j++)
                deck[k++] = RANK[j] + " of " + SUIT[i];

        for (int j = 0; j < deck.length; j++) {
            int r = (int) (Math.random() * (deck.length - j));
            String temp = deck[j];
            deck[j] = deck[r];
            deck[r] = temp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                int r = (int) (Math.random() * (deck.length - i));
                if (j == 4)
                    System.out.println(deck[r] + ". ");
                else
                    System.out.print(deck[r] + " , ");
            }
            System.out.println("");
        }
    }
}
