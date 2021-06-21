public class TestStdInAndStdOut {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            StdOut.println("Enter a value for the number at position " + i + " :");
            int value = StdIn.readInt();
            sum += value;
        }
        StdOut.println("The sum of all the numbers is " + sum);
    }
}
