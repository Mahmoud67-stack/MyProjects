public class Deck {
    public static void main(String[] args) {
        String[] SUITS = { "Spades", "Hearts", "Diamonds", "Clubs" };
        String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
        };
        String temp;
        int n = SUITS.length * RANKS.length, k = 0;
        String[] Deck = new String[n];
        for (int i = 0; i < SUITS.length; i++) {
            for (int j = 0; j < RANKS.length; j++)
                Deck[k++] = RANKS[j] + " of " + SUITS[i];
        }
        System.out.println("We have the pre-shuffled Deck: ");
        for (int i = 0; i < Deck.length; i++) {
            System.out.println(Deck[i]);
        }
        System.out.println("After Shuffling: ");
        for (int i = 0; i < Deck.length; i++) {
            int r = i + (int) (Math.random() * (n - i));
            temp = Deck[i];
            Deck[i] = Deck[r];
            Deck[r] = temp;
            System.out.println(Deck[i]);
        }
    }
}
