public class ISBN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0, count = 2, c = n;
        while (n != 0) {
            sum += (n % 10) * count;
            n /= 10;
            count++;
        }
        c += 11 - (sum % 11);
        String s = Integer.toString(c);
        if (11 - (sum % 11) == 10) {
            s = s + 'X';
        }
        else if (sum % 11 == 0)
            s = s + "0";
        else
            s = s + (11 - sum % 11);
        System.out.println(s);
    }
}
