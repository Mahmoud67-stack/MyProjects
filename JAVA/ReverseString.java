public class ReverseString {
    public static String reverse(String s) {
        char[] t = new char[s.length()];
        for (int i = 0; i <= s.length() / 2; i++) {
            int r = s.length() - i - 1;
            t[i] = s.charAt(r);
            t[r] = s.charAt(i);
        }
        String s1 = new String(t);
        return s1;
    }

    public static void main(String[] args) {
        String s = args[0];
        StdOut.println("The string you entered is: " + s);
        StdOut.println("The reversed string is: " + reverse(s));
    }
}
