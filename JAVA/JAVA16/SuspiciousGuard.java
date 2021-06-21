package SoftwareDesign.Project;

public class SuspiciousGuard implements State{


    @Override
    public void next(Guard guard) {
        guard.setState(new AlertedGuard());
        printStatus();
    }

    @Override
    public void prev(Guard guard) {
        guard.setState(new SuspiciousGuard());
        printStatus();
    }

    @Override
    public void printStatus() {
        System.out.println(this+" is now Suspicious!");
    }
}
