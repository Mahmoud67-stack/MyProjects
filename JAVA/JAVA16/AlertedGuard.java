package SoftwareDesign.Project;

public class AlertedGuard implements State {

    @Override
    public void next(Guard guard) {
    System.out.println("you attract the alerted guard's attention and he kills you!");
    System.exit(1);
    }

    @Override
    public void prev(Guard guard) {
        guard.setState(new SuspiciousGuard());
    }

    @Override
    public void printStatus() {
        System.out.println(this+ " is now alerted");
    }
}
