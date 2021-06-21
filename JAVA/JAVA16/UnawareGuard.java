package SoftwareDesign.Project;

public class UnawareGuard implements State{


    @Override
    public void next(Guard guard) {
        guard.setState(new SuspiciousGuard());
        printStatus();
    }

    @Override
    public void prev(Guard guard) {

    }

    @Override
    public void printStatus() {
        System.out.println(this+" the guard is now suspicious");
    }
}
