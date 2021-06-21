public class Sqrt {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double t = 1;
        int count = 10;
        while (count != 0) {
            t = (t + (x / t)) / 2;
            System.out.print(t + " ");
            count--;
        }
        System.out.println("The square root approximation of " + x + " is : " + t);
    }
}
