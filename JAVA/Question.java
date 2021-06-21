public class Question {
    public static long search(long lo, long hi) {
        if ((hi - lo) == 1) return hi;
        long mid = lo + (hi - lo) / 2;
        StdOut.println("Is the value geater than " + mid + " ?");
        if (StdIn.readBoolean()) return search(mid, hi);
        else return search(lo, mid);
    }

    public static void main(String[] args) {
        long k = Integer.parseInt(args[0]);
        long n = (long) Math.pow(2, k);
        StdOut.println("Think of an integer between 0 and " + (n - 1));
        long secret = search(0, n);
        StdOut.println("Your number is " + secret);
    }
}
