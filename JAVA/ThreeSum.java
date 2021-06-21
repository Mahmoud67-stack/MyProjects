public class ThreeSum {

    public static void printAll(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++)
                    if (a[i] + a[k] + a[j] == 0)
                        StdOut.println(a[i] + " + " + a[j] + " + " + a[k] + " = " + 0);
            }

        }
    }

    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++)
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        In infile = new In("File.txt");
        int b[] = infile.readAllInts();
        StopWatch watch = new StopWatch();
        int count = count(b);
        StdOut.println("elapesed time = " + watch.elapsedTime());
        printAll(b);
        StdOut.println(count);
    }
}
