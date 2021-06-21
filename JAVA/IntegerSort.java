public class IntegerSort {
    public static void main(String[] args) {
        int MAX = 100;
        int[] freq = new int[MAX];

        while (!StdIn.isEmpty()) {
            int i = StdIn.readInt();
            if (i < 0 || i >= MAX) throw new RuntimeException("Invalid Integer");
            freq[i]++;
        }

        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < freq[i]; j++) {
                StdOut.print(i + " ");
            }
        }
        StdOut.println();
    }
}
