public class Median {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max3 = Integer.parseInt(args[0]);
        int temp, count = 0, i = 0;

        while (count < 2 && i < 5) {
            if (Math.max(Math.min(Integer.parseInt(args[i]), max3), min) == Integer
                    .parseInt(args[i])) {
                min = max3;
                max3 = Integer.parseInt(args[i]);
                count++;
            }
            i++;

        }
        System.out.println("The median is: " + max3);
    }
}
