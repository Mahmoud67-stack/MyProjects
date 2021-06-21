public class Kary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        String c = "";
        while (n != 0) {
            if (n % k == 10) {
                c = "A" + c;
            }
            else if (n % k == 11) {
                c = "B" + c;
            }
            else if (n % k == 12) {
                c = "C" + c;
            }
            else if (n % k == 13) {
                c = "D" + c;
            }
            else if (n % k == 14) {
                c = "E" + c;
            }
            else if (n % k == 15) {
                c = "F" + c;
            }
            else
                c = Integer.toString(n % k) + c;
            n /= k;
        }
        System.out.println(c);
    }
}
