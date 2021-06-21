public class RollLoadedDie {
    public static void main(String[] args) {
        int randroll = ((int) (Math.random() * 8)) + 1;
        switch (randroll) {
            case 1:
                System.out.println("The face shows number 1");
                break;
            case 2:
                System.out.println("The face shows number 2");
                break;
            case 3:
                System.out.println("The face shows number 3");
                break;
            case 4:
                System.out.println("The face shows number 4");
                break;
            case 5:
                System.out.println("The face shows number 5");
                break;
            case 6:
                System.out.println("The face shows number 6");
                break;
            case 7:
                System.out.println("The face shows nunber 6");
                break;
            case 8:
                System.out.println("The face shows number 6");
                break;
        }
    }
}
