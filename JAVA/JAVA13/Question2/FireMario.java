package SoftwareDesign.LAB11.Question2;

public class FireMario implements State {
    public void prev(Context context) {
        if (context.shell) {
            context.setState(new SuperMario());
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
        System.out.println("Mario ate a Fire Flower. Mario is now Fire Mario");
    }
}
