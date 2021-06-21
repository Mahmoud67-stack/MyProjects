public class Euler {
    public static void main(String[] args) {
        boolean istrue = false;
        long i5 = 1, j5 = 1, k5 = 1, p5 = 1, h5 = 1;
        for (long i = 1; i < 100000000; i++) {
            i5 = i * i * i * i * i;
            for (long j = 1; j < 100000000; j++) {
                j5 = j * j * j * j * j;
                if ((j5 * 5) > i5) break;
                for (long k = j; k < 100000000; k++) {
                    k5 = k * k * k * k * k;
                    if ((j5 + k5 + k5 + k5) > i5) break;
                    for (long p = k; p < 100000000; p++) {
                        p5 = p * p * p * p * p;
                        if ((j5 + k5 + p5 + p5) > i5) break;
                        for (long h = p; h < 100000000; h++) {
                            h5 = h * h * h * h * h * h;
                            if (k5 + j5 + p5 + h5 > i5) break;
                            if (k5 + j5 + p5 + h5 == i5) {
                                System.out.println(
                                        "The numbers are: " + h5 + " + " + k5 + " + " + j5 + " + "
                                                + p5 + " = " + i5);
                                System.out.println("Euler was right you bitch");
                                istrue = true;
                            }
                        }
                    }
                }
            }
        }

        if (!istrue) {
            System.out.println("Euler was wrong lol");
        }
    }
}
