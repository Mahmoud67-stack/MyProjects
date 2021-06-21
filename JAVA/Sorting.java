public class Sorting {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void insertionsort(Comparable[] arry) {
        for (int i = 1; i < arry.length; i++) {
            for (int j = i; j > 0; j--)
                if (arry[j].compareTo(arry[j - 1]) < 0) {
                    Comparable temp = arry[j];
                    arry[j] = arry[j - 1];
                    arry[j - 1] = temp;
                }
                else break;
        }
    }


    public static void main(String[] args) {
        String[] a = StdIn.readAllStrings();
        insertionsort(a);
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }
}
