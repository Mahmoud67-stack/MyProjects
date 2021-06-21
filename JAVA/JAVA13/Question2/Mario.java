package SoftwareDesign.LAB11.Question2;

public class Mario implements State {
    public void prev(Context context) {
        System.out.println("Mario is in his initial state");
    }
    public void next(Context context) {
        if(context.shell){
       context.setState(new SmallMario());
        context.shell=false;}

    }
    public void printStatus() {
        System.out.println("Mario is a normal plumber with no additional attributes");
    }
}
