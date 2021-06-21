public class Reverse {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        if (N < 0) {
            N = 10;
        }
        int[] a = new int[N];
        System.out.println("We have the array: ");
        for (int i = 0; i < N; i++) {
            a[i] = i;
            System.out.print(a[i] + " ");
        }
        System.out.println("\nNow the reversed array: ");

        for (int i = 0; i < N / 2; i++) {
            int temp = a[i], r = (N - 1) - i;
            a[i] = a[r];
            a[r] = temp;
        }
        for (int j = 0; j < N; j++) {
            System.out.print(a[j] + " ");
        }
    }

}
