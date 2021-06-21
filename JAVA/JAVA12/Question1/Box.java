package SoftwareDesign.LAB10.Question1;

public class Box extends Structure{
    Box(){
        System.out.println("Building Ramp");
        material ="metal";
        components = "four walls, stairs, floors and a roof";
    }

    @Override
    void find_location() {
        System.out.println("Currently being attacked");
    }
}
