package SoftwareDesign.Project;

class shield extends component{
    void trimcomponent(Player player) {
        player.shield = true;
        System.out.println("you cut the shield to make it small enough to fit the top of your gun with the cutter");
    }
}
class suppressor extends component{
    @Override
    void trimcomponent(Player player) {
        player.suppressor = true;
        System.out.println("you make a hole in the suppressor, it fits the barrel of your gun");
    }
}
public abstract class component {
    protected void pickupcomonenet(){System.out.println("you pick up the "+this.getClass().getSimpleName());}
    abstract void trimcomponent(Player player);
    protected void addcomponent(){System.out.println("you add the "+this.getClass().getSimpleName()+" to your gun");}

    final public void attach_component(Player player){
   pickupcomonenet();
   trimcomponent(player);
   addcomponent();
    }
}
