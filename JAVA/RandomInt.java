public class RandomInt {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = Math.random();
        int x = (int) (r * n);
        System.out.println("Here is a random number between 0 and n: " + x);
    }
}
