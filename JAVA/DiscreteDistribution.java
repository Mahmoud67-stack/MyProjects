public class DiscreteDistribution {
    public static void main(String[] args) {
        int[] freq = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            freq[i] = Integer.parseInt(args[i]);
        }
        for (int i = freq.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (freq[i] < freq[j]) {
                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;
                }
            }
        }
        System.out.println("The items of the array are: ");
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i] + " ");
        }
        System.out.println("");
        int i = 0;
        while (i < freq.length) {
            int tot = 0;
            for (int j = i; j < freq.length; j++) {
                if (freq[i] == freq[j] || (j == freq.length - 1)) {
                    tot++;
                    if (tot >= 1 && (j == freq.length - 1)) {
                        System.out.println(freq[i] + " = " + tot + " times");
                        i = j + 1;
                    }
                }
                else {
                    System.out.println(freq[i] + " = " + tot + " times");
                    i = j;
                    break;
                }
            }
        }

    }
}
