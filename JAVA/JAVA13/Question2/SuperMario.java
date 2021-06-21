package SoftwareDesign.LAB11.Question2;

public class SuperMario implements State {
    public void prev(Context context) {
        if(context.shell) {
            context.setState(new SmallMario());
            context.shell = false;
        }
}
    public void next(Context context) {
        if(context.flower) {
            context.setState(new FireMario());
            context.flower = false;
        }
    }
    public void printStatus() {
        System.out.println("Mario ate mushroom. Mario is now Super Mario.");
    }
}
