public class Average {
    public static void main(String[] args) {
        double sum = 0, count = 0;
        StdOut.println("Enter a sequence of values : ");
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }
        StdOut.println("The average is: " + (sum / count));
    }
}
