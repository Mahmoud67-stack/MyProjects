package SoftwareDesign.LAB10.Question2;
class Good extends TaskBehaviour{

    @Override
    public void task(String color) {
        System.out.println(color+ " is fixing the wiring");
    }
}
class Bad extends TaskBehaviour{

    @Override
    public void task(String color) {
        System.out.println(color + " is causing a reactor meltdown");
    }
}
public abstract class TaskBehaviour {
    abstract void task(String color);
}
