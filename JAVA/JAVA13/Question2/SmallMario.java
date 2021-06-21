package SoftwareDesign.LAB11.Question2;

public class SmallMario implements State {
    public void prev(Context context) {
        context.setState(new Mario());
    }

    public void next(Context context) {
        if (context.mushroom==true) {
            context.setState(new SuperMario());
            context.mushroom=false;
        }
        else if (context.flower){
            context.setState(new FireMario());
            context.flower=false;
        }
    }
    public void printStatus() {
        System.out.println("Mario was hit with a turtle shell,Mario is now small Mario");
    }
}
