package SoftwareDesign.Project;


public interface State {
    public void prev(Guard guard);
    public void next(Guard guard);
    public void printStatus();
}
