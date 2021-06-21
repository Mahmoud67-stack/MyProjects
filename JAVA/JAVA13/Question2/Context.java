package SoftwareDesign.LAB11.Question2;

public class Context{
    boolean mushroom=false;
    boolean flower=false;
    boolean shell=false;
    private State state = new Mario();
    public void previousState() {
        state.prev(this);
    }
    public void nextState() {
        state.next(this);
    }
    public void printStatus() {
        state.printStatus();
    }
    public void setState(State state) {
        this.state = state;}
}
