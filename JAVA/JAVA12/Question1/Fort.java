package SoftwareDesign.LAB10.Question1;

public class Fort extends Structure {
    Fort(){
        System.out.println("Building Ramp");
        material ="brick";
        components = "many walls, floors and stairs";
    }

    @Override
    void find_location() {
        System.out.println("Found an empty grass field");
    }
}
