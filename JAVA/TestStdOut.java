public class TestStdOut {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        StdOut.println("Hello, World");
        StdOut.printf("% 14d", 512);
        StdOut.printf("%-14d", 512);
        StdOut.printf("%14.2f", 1595.3262732532632);
        StdOut.printf(".7%f", 1595.3262732532632);
        StdOut.printf("%14.4e", 1595.3262732532632);
        StdOut.printf("%14s", "Hello World");
        StdOut.printf("%-14s", "Hello World");
        StdOut.printf("%-14.5s", "Hello World");
        StdOut.printf("%b", true);

    }
}
