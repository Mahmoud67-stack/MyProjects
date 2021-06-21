package SoftwareDesign.SampleExamFinal;

public class Context {
    private State state;
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