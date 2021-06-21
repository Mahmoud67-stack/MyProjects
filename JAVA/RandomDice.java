public class RandomDice {
    public static void main(String[] args) {
        int n1 = (int) (6 * Math.random()) + 1;
        int n2 = (int) (6 * Math.random()) + 1;
        int tot = n1 + n2;
        System.out.println(
                "You got from rolling the first dice: " + n1 + "\nAnd from the second one: " + n2
                        + "\nAnd the sum of them is: " + tot);
    }
}
