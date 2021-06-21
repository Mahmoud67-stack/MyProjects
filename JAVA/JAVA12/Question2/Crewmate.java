package SoftwareDesign.LAB10.Question2;

public abstract class Crewmate implements Runnable{

    Thread t;
    String color;
    ActBehaviuor ActB;
    KillBehaviour KillB;
    TaskBehaviour TaskB;

    Crewmate ()
    { }
    synchronized public void performAction()
    {
       ActB.act(color);
    }

    synchronized public void performKill()
    {
        KillB.kill(color);
    }

   synchronized public void performTask()
    {
        TaskB.task(color);
    }

    public void setKillBehaviour(KillBehaviour Kb) {
        KillB = Kb;
    }
    public void setActBehaviour(ActBehaviuor Ab) {
        ActB = Ab;
    }
    public void setTaskBehaviour(TaskBehaviour Tb) {
        TaskB = Tb;
    }

    @Override
    public void run() {
        performTask();
        performKill();
        performAction();

    }
}
