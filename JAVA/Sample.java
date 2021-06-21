public class Sample {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        int[] perm = new int[N];
        for (int i = 0; i < N; i++)
            perm[i] = i;

        for (int i = 0; i < M; i++) {
            int r = i + (int) (Math.random() * (N - i));
            int temp = perm[r];
            perm[r] = perm[i];
            perm[i] = temp;
            System.out.println(perm[i]);
        }
    }
}
