public class LongestRun {
    public static void main(String[] args) {
        if (StdIn.isEmpty()) {
            StdOut.println("No value entered ");
            return;
        }
        int prev = StdIn.readInt();
        int current;
        int count = 1;
        int bestcount = count;
        int best = prev;
        while (!StdIn.isEmpty()) {
            current = StdIn.readInt();
            if (current == prev)
                count++;
            else {
                prev = current;
                count = 1;
            }
            if (bestcount < count) {
                best = current;
                bestcount = count;
            }
        }
        StdOut.println(
                "The most frequent value is: " + best);
    }
}
