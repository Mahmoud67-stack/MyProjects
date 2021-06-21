package SoftwareDesign;

public class Exercise5 {

    public static void main(String[] args) {

        String a = "An old silent pond\nA frog jumps into the pond\nSplash! Silence again.";
        System.out.println(a + '\n');
        System.out.println("Length of haiku = " + a.length() + "\n");
        int x = -1;
        for (int i = a.length() - 1; i > 0; i--) {
            if (a.charAt(i) == ' ') {
                x = i + 1;
                break;
            }
        }
        System.out.println("The last word starts at index = " + x);
    }
}

