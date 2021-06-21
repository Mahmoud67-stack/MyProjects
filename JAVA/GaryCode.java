public class GaryCode {
    public static void GaryFunction(int n, boolean forward) {
        if (n == 0) return;
        GaryFunction(n - 1, true);
        if (forward) StdOut.println("enter " + n);
        else StdOut.println("exit " + n);
        GaryFunction(n - 1, false);
    }

    public static void main(String[] args) {
        GaryFunction(4, true);
    }
}
