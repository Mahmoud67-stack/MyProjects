public class Stats {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        float[] arr = new float[n];
        StdOut.println(
                "Please enter " + n + " values to calculate their mean and standard deviation");
        float sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = StdIn.readFloat();
            sum += arr[i];
        }
        sum /= n;
        StdOut.println("The mean is: " + sum);
        double stddev = 0;
        StdOut.print("The standard deviation is: ");
        for (int i = 0; i < n; i++) {
            stddev += ((arr[i] - sum) * (arr[i] - sum));
        }
        stddev = Math.sqrt(stddev / (n - 1));
        StdOut.println(stddev);
    }
}
