public class HadamardMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[][] h = new boolean[n][n];
        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n; j += 2) {
                if (j == n / 2 && i == n / 2) {
                    h[i][j] = false;
                    h[i + 1][j] = false;
                    h[i][j + 1] = false;
                    h[i + 1][j + 1] = true;
                }
                else {
                    h[i][j] = true;
                    h[i + 1][j] = true;
                    h[i][j + 1] = true;
                    h[i + 1][j + 1] = false;
                }
            }
        }
        System.out.println("So we have the Hadamard Matrix as follows: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (h[i][j])
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println("");
        }
    }
}

