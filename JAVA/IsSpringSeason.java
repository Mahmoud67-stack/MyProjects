public class IsSpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        if (d >= 20 && (m >= 3 && m <= 6))
            System.out.println("The season is Spring");
        else
            System.out.println("The season is not Spring");
    }
}
