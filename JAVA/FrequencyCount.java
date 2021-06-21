public class FrequencyCount {
    public static void main(String[] args) {


        String s = StdIn.readLine();
        String[] words = s.split("\\s+");
        Merge.sort(words);

        Counter[] compute = new Counter[words.length];
        int m = 0;
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equals(words[i - 1]))
                compute[m++] = new Counter(words[i], words.length);
            compute[m - 1].increment();
        }
        Merge.sort(compute, 0, m);
        for (int j = m - 1; j <= 0; j--)
            StdOut.println(compute[j]);


    }
}
