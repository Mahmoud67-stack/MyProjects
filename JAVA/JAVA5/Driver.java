package SoftwareDesign.LAB2;

abstract class Block {
    String id;
    int x, y, z;

    Block(String id) {
        this.id = id;
    }

    public void place(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void store() {
        this.x = -1;
        this.y = -1;
        this.z = -1;
    }

    abstract void mine();

    @Override
    abstract public String toString();
}

class Dirt extends Block {
    Dirt(String id) {
        super(id);
    }

    @Override
    void mine() {
        System.out.println("The Dirt block was mined with a pickaxe");
    }

    @Override
    public String toString() {
        return "The Dirt block has the id = " + id + " and is located in " + "(" + x + ", " + y + ", " + z + ")";
    }
}

class Wool extends Block {
    String color;

    Wool(String id) {
        super(id);
    }

    public void craft() {
        System.out.println("The Wool block was crafted from spiderweb");
    }

    public void dye(String color) {
        this.color = color;
        System.out.println("The Wool block was dyed to " + color);
    }

    @Override
    void mine() {
        System.out.println("The Wool block was mined from sheep with a shear");
    }

    @Override
    public String toString() {
        return "The Wool block has the id = " + id + " and is located in " + "(" + x + ", " + y + ", " + z + ") and is colored " + color;
    }
}

class Sand extends Block {
    Sand(String id) {
        super(id);
    }

    @Override
    void mine() {
        System.out.println("The Sand block was mined with a shovel");
    }

    @Override
    public String toString() {
        return "The Sand block has the id = " + id + " and is located in " + "(" + x + ", " + y + ", " + z + ")";
    }
}

public class Driver {
    public static void main(String[] args) {
        Dirt dirt = new Dirt("dirt_001");
        Wool wool = new Wool("wool_700");
        Sand sand = new Sand("sand_004");


        dirt.mine();
        wool.craft();
        wool.dye("blue");
        sand.mine();

        System.out.println();

        dirt.place(0, 5, 5);
        sand.store();
        wool.place(0, 5, 6);

        System.out.println(dirt);
        System.out.println(sand);
        System.out.println(wool);
    }
}
