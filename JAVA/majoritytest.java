public class majoritytest {
    public static boolean majority(boolean var1, boolean var2, boolean var3) {
        return ((var1 || var3) && (var2 || var3));
    }

    public static void main(String[] args) {
        boolean var1 = Boolean.parseBoolean(args[0]);
        boolean var2 = Boolean.parseBoolean(args[1]);
        boolean var3 = Boolean.parseBoolean(args[2]);
        StdOut.println("The majority of the boolean values is: " + majority(var1, var2, var3));
    }
}
