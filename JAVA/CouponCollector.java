public class CouponCollector {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isCollected = new boolean[n];
        int count = 1, i = 1;

        while (count != n) {
            int random = (int) (Math.random() * n);
            if (!isCollected[random]) {
                isCollected[random] = true;
                count++;
            }
            i++;
        }
        System.out.println(
                "The number of trials you should is : " + i + " times to get all " + n
                        + " cards");
    }
}
