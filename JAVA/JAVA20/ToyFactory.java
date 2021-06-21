public abstract class ToyFactory 
{
    final void produceToy()
    {
        fixMold();
        feedPVC();
        heat();
        inject();
        cooldown();
        fixWheels();
        pack();
    }
    abstract void fixMold();
    protected void feedPVC()
    {
        System.out.println("Feed poly vinyl chloride powder to the machin");
    }
    protected void heat()
    {
        System.out.println("Heat raw material to 500 degree centigrad");
    }
    protected void inject()
    {
        System.out.println("Injecting the raw material into the mold");
    }
    abstract void cooldown();
    abstract void fixWheels();
    abstract void pack();
}