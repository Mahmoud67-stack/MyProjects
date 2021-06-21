public class Birthdays {
    public static void main(String[] args) {
        int people = 0;

        int randbirth1 = (int) (Math.random() * 365);
        int randbirth2 = (int) (Math.random() * 365);
        int n = 0;
        while (n < 100) {
            n++;
            while (randbirth1 != randbirth2) {
                people++;
                randbirth1 = (int) (Math.random() * 365);
                randbirth2 = (int) (Math.random() * 365);
            }
            System.out.println(people
                                       + " people need to enter the party so a pair of people can have the same birthday");
        }

    }
}
