public class Ordered {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        boolean b;
        if (Math.max(x, y) == y && (Math.max(z, y) == Math.max(z, x))) {
            b = true;
            System.out.println("The numbers are in ascending order and b = " + b);
        }
        else {
            b = false;
            System.out.println("The numbers are not in ascending order and b = " + b);
        }

    }
}

