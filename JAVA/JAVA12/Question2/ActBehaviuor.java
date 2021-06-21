package SoftwareDesign.LAB10.Question2;

class innocent extends ActBehaviuor{

    @Override
    public void act(String color) {
        System.out.println(color + " is acting innocent");
    }
}
class sus extends ActBehaviuor{

    @Override
    public void act(String color) {
        System.out.println(color + " is acting sus");
    }
}
public abstract class ActBehaviuor {
    abstract void act(String color);
}
