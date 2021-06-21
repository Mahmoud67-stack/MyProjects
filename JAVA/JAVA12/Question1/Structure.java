package SoftwareDesign.LAB10.Question1;

abstract public class Structure {
    String material;
    String components;
    protected void collect_material(){
        System.out.println("Collecting "+ material);
    }
    abstract void find_location();
    protected void build_components()
    {
        System.out.println("Building "+ components);
    }

    //template method
    public final void Build(){

        collect_material();

        find_location();

        build_components();
    }
}
