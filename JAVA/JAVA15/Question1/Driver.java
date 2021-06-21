package SoftwareDesign.MT1.Question1;

public class Driver {

    public static void main(String[] args) throws Exception {

        try {
            throw new IgnoreExpection("no worries mate!");
        } catch (Exception e) {

            System.out.println(e);
        }

        try {
            throw new SoftException("no worries mate!", "may be this was not a good idea", "standing", "sitting");
        } catch (Exception e) {

            System.out.println(e);
        }

        try {
            throw new HardException("this is not acceptable", "do 10 situps");
        } catch (Exception e) {

            System.out.println(e);
        }


    }
}

