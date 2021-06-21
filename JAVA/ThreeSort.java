public class ThreeSort {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt((args[2]));
        if (Math.max(n1, n3) == Math.max(n1, n2)) {
            if (Math.min(n3, n2) == n2)
                System.out.println("The numbers sorted: " + n2 + " " + n3 + " " + n1);
            else
                System.out.println("The numbers sorted: " + n3 + " " + n2 + " " + n1);
        }
        else if (Math.max(n1, n3) == Math.max(n2, n3)) {
            if (Math.min(n1, n2) == n2)
                System.out.println("The numbers sorted: " + n2 + " " + n1 + " " + n3);
            else
                System.out.println("The numbers sorted: " + n1 + " " + n2 + " " + n3);
        }
        else {
            if (Math.min(n1, n3) == n3)
                System.out.println("The numbers sorted: " + n3 + " " + n1 + " " + n2);
            else
                System.out.println("The numbers sorted: " + n1 + " " + n3 + " " + n2);
        }
    }
}
