public class ThreeSumDeluxe {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        BinarySearch<Integer> cr = new BinarySearch<Integer>();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = StdIn.readInt();
        }
        for (int i = 0; i < n; i++)
            StdOut.print(arr[i] + " ");
        StdOut.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                int s = cr.search(arr, -arr[j] - arr[i]);
                if (s > 0)
                    StdOut.println(
                            "The three sums are: " + arr[j] + " + " + arr[i] + " + " + arr[s]);

            }
        }


    }
}
