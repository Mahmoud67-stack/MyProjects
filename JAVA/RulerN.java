public class RulerN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = "1";
        for (int i = 2; i <= n; i++)
            s = s + " " + i + " " + s;

        System.out.println(s);
    }
}
