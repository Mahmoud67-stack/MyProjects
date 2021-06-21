public class Ramanujan {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            int i3 = i * i * i;
            if (i3 > n)
                break;
            for (int j = i + 1; j <= n; j++) {
                int j3 = j * j * j;
                if (i3 + j3 > n)
                    break;
                for (int k = i + 1; k <= n; k++) {
                    int k3 = k * k * k;
                    if (k3 > j3 + i3)
                        break;
                    for (int p = k + 1; p <= n; p++) {
                        int p3 = p * p * p;
                        if (p3 + k3 > j3 + i3)
                            break;
                        if (i3 + j3 == k3 + p3)
                            System.out.println(
                                    (j3 + i3) + " = " + i + "^3 + " + j + "^3 =" + k + "^3 + " + p
                                            + "^3");


                    }
                }
            }
        }
    }
}
