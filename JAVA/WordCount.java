public class WordCount {
    public static void main(String[] args) {
        if (StdIn.isEmpty()) {
            StdOut.println("No text was entered");
            return;
        }
        int count = 0;
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            count++;
        }
        StdOut.println("The text has " + count + " words");
    }
}
