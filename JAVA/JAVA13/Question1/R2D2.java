package SoftwareDesign.LAB11.Question1;

public class R2D2 {
    int  x,y;
    String message, backup;
    R2D2(){
        x=0;y=0;
        message="";
        backup = "";
    }
    public void speak()
    {
        System.out.println("beep boop bleep bloop");
    }
    public void move_right() {
        x++;
        System.out.println("R2 D2 moves tot he right his coordinates are now ("+x+","+y+")");
    }
    public void move_left() {
        x--;
        System.out.println("R2 D2 moves tot he left his coordinates are now ("+x+","+y+")");
    }
    public void move_up() {
        y++;
        System.out.println("R2 D2 moves tot he up his coordinates are now ("+x+","+y+")");
    }
    public void move_down() {
        y--;
        System.out.println("R2 D2 moves tot he down his coordinates are now ("+x+","+y+")");
    }
    public void save_message(String message)
    {
        this.backup = this.message;
        this.message = message;
        System.out.println("R2-D2 saved a secret message: "+this.message);
    }
    public void delete_message()
    {
        this.backup = this.message;
        this.message = "";
        System.out.println("R2-D2 deleted the secret message");
    }
    public void show_map()
    {
        System.out.println("R2-D2 will not show you the map because R2D2 does not know how to draw it");
    }

}
