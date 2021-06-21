public class MaxwithnoiforMathmax {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int max = (a + b + Math.abs(a - b)) / 2;
        System.out.println("The maximum value of " + a + " and " + b + " is: " + max);
    }
}
