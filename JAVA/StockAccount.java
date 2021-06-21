public class StockAccount {
    private final String name;
    private double cash;
    private int n;
    private int[] share;
    private String[] stocks;

    public StockAccount(String filename) {
        In infile = new In(filename);
        name = infile.readLine();
        cash = infile.readDouble();
        n = infile.readInt();
        share = new int[n];
        stocks = new String[n];
        for (int i = 0; i < n; i++) {
            share[i] = infile.readInt();
            stocks[i] = infile.readString();
        }

    }

    public void printReport() {
        StdOut.println(name);
        double total = cash;
        for (int i = 0; i < n; i++) {
            int amount = share[i];
            double price = StockQuote.priceOf(stocks[i]);
            total += amount * price;
            StdOut.printf("%4d %5s", amount, stocks[i]);
            StdOut.printf("%9.2f %11.2f\n", price, amount * price);
        }
        StdOut.printf("%21s %10.2f\n", "Cash: ", cash);
        StdOut.printf("%21s %10.2f\n", "Total: ", total);
    }

    public double valueOf() {
        StdOut.println(name);
        double total = cash;
        for (int i = 0; i < n; i++) {
            int amount = share[i];
            double price = StockQuote.priceOf(stocks[i]);
            total += amount * price;
        }
        return total;
    }

    public static void main(String[] args) {
        String filename = args[0];
        StockAccount account = new StockAccount(filename);
        account.printReport();

    }
}
