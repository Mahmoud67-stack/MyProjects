package SoftwareDesign.LAB10.Question1;

public class Ramp extends Structure {

    Ramp(){
        System.out.println("Building Ramp");
        material ="wood";
        components = "three stairs to make a ramp";
    }

    @Override
    void find_location() {
        System.out.println("Found an existing wall");
    }

}
