import java.util.Arrays;

public class BinarySearch<T extends Comparable<T>> {
    public int search(T[] a, T key) {
        return search(a, key, 0, a.length);
    }

    public int search(T[] a, T key, int lo, int hi) {
        if (lo >= hi) return -1;
        int mid = lo + (hi - lo) / 2;
        int cmp = a[mid].compareTo(key);
        if (cmp > 0) return search(a, key, mid + 1, hi);
        else if (cmp < 0) return search(a, key, lo, mid);
        else return mid;
    }

    public static void main(String[] args) {
        BinarySearch<String> s2 = new BinarySearch<String>();
        StdOut.print("Enter A Sentence or multiple sentences: \n>");
        if (StdIn.isEmpty()) {
            StdOut.println("No value entered");
        }
        String s1 = StdIn.readLine();
        String[] s = s1.split("\\s+");

        Arrays.sort(s);
        System.err.println("Done sorting words");
        StdOut.print("Enter a string to find in the sentence that you entered:\n>");
        while (!StdIn.isEmpty()) {
            s1 = StdIn.readString();
            if (s2.search(s, s1) > 0) StdOut.println("found at " + s2.search(s, s1));
            else StdOut.println("Not found");
            StdOut.print("Enter a string to find in the sentence that you entered:\n>");
        }
    }
}
