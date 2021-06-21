package SoftwareDesign.Project;


class nokill extends KillBehaviour {

    @Override
    public void kill(Guard[] guards) {
        System.out.println("The enemy screams like a baby and alerts all the guards that you are here!");
         for (int i = 0; i< guards.length; i++)
         {
             guards[i].setState(new AlertedGuard());
         }
    }
}
class dokill extends KillBehaviour {

    @Override
    public void kill(Guard[] guards) {
        System.out.println("The enemy attempts to kill you ");
    }
}
public abstract class KillBehaviour {
    abstract void kill(Guard[] guards);
}