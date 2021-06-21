public class PairsSum {
    public static void main(String[] args) {
        StdOut.println("Please enter the size of the array :");
        while (StdIn.isEmpty()) {
            StdOut.println("No value was read");
        }
        int n = 0;
        if (!StdIn.isEmpty()) {
            n = StdIn.readInt();
        }
        int[] a = new int[n];
        StdOut.println("Please enter " + n + " values into the array: ");
        for (int i = 0; i < n; i++) {
            if (!StdIn.isEmpty()) {
                a[i] = StdIn.readInt();
            }
        }
        StdOut.println("Please enter the sum : ");
        int sum = 0;
        if (!StdIn.isEmpty())
            sum = StdIn.readInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++)
                if (sum == a[i] + a[j] && i != j) {
                    StdOut.println(a[i] + " and " + a[j] + " sum up to: " + sum);
                }
        }

    }
}
