public class Transpose {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[][] arr = new int[n][n];

        System.out.println("We have the 2x2 matrix: ");
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = k++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("The transposed matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");
        }

    }
}
