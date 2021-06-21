package SoftwareDesign.HW3;

public abstract class Potion {
    final void preparePotion(String addition, String way,String temp_level)
    {
        add(addition);

        stir(way);

        heat(temp_level);

        completion();
    }
    void add(String addition)
    {
        System.out.println("Adding "+addition+" in cauldron");
    }

    void stir(String way)
    {
        System.out.println("Stirring "+way);
    }
    void heat(String temp_level)
    {
        System.out.println("Heating at "+temp_level+" temperature");
    }

    abstract void completion();
}
