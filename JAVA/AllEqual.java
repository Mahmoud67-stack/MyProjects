public class AllEqual {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        if (n1 == n3 && n1 == n2) {
            System.out.println("The numbers are equal");
        }
        else
            System.out.println("The numbers are not equal");
    }
}
