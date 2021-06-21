package SoftwareDesign.HW2;

public abstract class Tool {
    String name, use;

    Tool(String name, String use) {
        this.name = name;
        this.use = use;

    }

    @Override
    public String toString() {
        return "The tool is " + name + " and is used to know the " + use;
    }
}
