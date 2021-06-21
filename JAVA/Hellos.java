public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < 100) {
                if (i % 10 == 1 && i / 10 != 1)
                    System.out.println("st Hello");
                else if (i % 10 == 2 && i / 10 != 1)
                    System.out.println("nd Hello");
                else if (i % 10 == 3 && i / 10 != 1)
                    System.out.println("rd Hello");
                else
                    System.out.println("th Hello");

            }
            else {
                if (i % 10 == 1 && (i > 120 || i < 110))
                    System.out.println("st Hello");
                else if (i % 10 == 2 && (i > 120 || i < 110))
                    System.out.println("nd Hello");
                else if (i % 10 == 3 && (i > 120 || i < 110))
                    System.out.println("rd Hello");
                else
                    System.out.println("th Hello");
            }
        }
    }
}

