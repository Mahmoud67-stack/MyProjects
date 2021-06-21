public class Eqtest {
    public static boolean eq(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StdOut.println(
                "We have the four following arrays when want to see if they are equal to each other: ");
        StdOut.println("Array 'a' : ");
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        int[] d = new int[20];
        for (int i = 0; i < 10; i++) {
            a[i] = b[i] = i;
            c[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < 20; i++) {
            d[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            StdOut.print("a[" + i + "] = " + a[i] + " ");
        }
        StdOut.println();
        StdOut.println("Array 'b' : ");
        for (int i = 0; i < 10; i++) {
            StdOut.print("b[" + i + "] = " + b[i] + " ");
        }
        StdOut.println();
        StdOut.println("Array 'c' :");
        for (int i = 0; i < 10; i++) {
            StdOut.print("c[" + i + "] = " + c[i] + " ");
        }
        StdOut.println();
        StdOut.println("Array 'd' :");
        for (int i = 0; i < 20; i++) {
            StdOut.print("d[" + i + "] = " + d[i] + " ");
        }
        StdOut.println();
        StdOut.println("Checking if arrays 'a' and 'b' are equal.... " + eq(a, b));
        StdOut.println("Checking if arrays 'a' and 'c' are equal.... " + eq(a, c));
        StdOut.println("Checking if arrays 'c' and 'd' are equal.... " + eq(c, d));
        StdOut.println("Checking if arrays 'a' and 'd' are equla.... " + eq(a, d));
    }
}
