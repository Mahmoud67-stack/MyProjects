public class MaxMin {
    public static void main(String[] args) {
        int min = StdIn.readInt();
        int max = min;
        while (StdIn.readChar() != '\n') {
            int temp = StdIn.readInt();
            max = Math.max(max, temp);
            min = Math.min(min, temp);
        }
        StdOut.println("The maximum value is: " + max);
        StdOut.println("The minimum value is: " + min);
    }
}
