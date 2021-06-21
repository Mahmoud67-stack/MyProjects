public class BinomialCoefficients {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] randomperm = new int[n];
        for (int i = 0; i < n; i++)
            randomperm[i] = i;

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int temp = randomperm[r];
            randomperm[r] = randomperm[i];
            randomperm[i] = temp;
            System.out.print(randomperm[i] + " ");
        }
        System.out.println("");
        int[][] CheckerBoard = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (randomperm[j] == i)
                    System.out.print("Q ");
                else
                    System.out.print("* ");
            System.out.println("");
        }

    }
}
