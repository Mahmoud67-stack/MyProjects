public class RollDie {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int c = 1, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0;
        while (n > c) {
            int side = (int) (Math.random() * 6) + 1;
            System.out.println(
                    "We get from the experiment number " + c + " the side with number" + side);
            switch (side) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;
            }
            c++;
            n--;
        }
        System.out.println("The percentage for number 1 is: " + (((c1 * 1.0) / c) * 100));
        System.out.println("The percentage for number 2 is: " + (((c2 * 1.0) / c) * 100));
        System.out.println("The percentage for number 3 is: " + (((c3 * 1.0) / c) * 100));
        System.out.println("The percentage for number 4 is: " + (((c4 * 1.0) / c) * 100));
        System.out.println("The percentage for number 5 is: " + (((c5 * 1.0) / c) * 100));
        System.out.println("The percentage for number 6 is: " + (((c6 * 1.0) / c) * 100));
    }
}
