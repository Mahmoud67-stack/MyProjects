package SoftwareDesign.LAB11.Question1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
// create object to be acted upon

        R2D2 l1 = new R2D2();
// create the commands
        MoveDownCommand down = new MoveDownCommand(l1);
        MoveUpCommand up = new MoveUpCommand(l1);
        MoveLeftCommand left = new MoveLeftCommand(l1);
        MoveRightCommand right = new MoveRightCommand(l1);
        SpeakCommand speak = new SpeakCommand(l1);
        ShowMapGalaxy show_map = new ShowMapGalaxy(l1);
        SaveMessageCommand save_massage = new SaveMessageCommand(l1);
        DeleteMessageCommand delete_massage = new DeleteMessageCommand(l1);
// create the panel
        Command[] cmds = { down, up, left,right, speak, show_map, save_massage, delete_massage};
        ControlPanel p = new ControlPanel(cmds);

        System.out.println("Welcome to your brand new R2-D2 robot experience brought to you by Industrial Automation" +
                "\nHow R2-D2 help you today? ");
        System.out.println("1. Move <direction>\n" +
                            "2. Speak\n" +
                            "3. Save secret message <message>\n" +
                            "4. Delete secret message\n"+
                            "5. Show galaxy map");
        Scanner x =new Scanner(System.in);
        String choice;
        while(!(choice = x.nextLine()).equals("")) {

            if (choice.equals("Move right") || choice.equals("Move Right"))
            {
                p.buttonWasPressed(3);
            }

            else if(choice.equals("Move left") || choice.equals("Move Left"))
            {
                p.buttonWasPressed(2);
            }
            else if(choice.equals("Move down") || choice.equals("Move Down"))
            {
                p.buttonWasPressed(0);
            }
            else if(choice.equals("Move up") || choice.equals("Move Up"))
            {
                p.buttonWasPressed(1);
            }
            else if(choice.equals("Speak"))
            {
                p.buttonWasPressed(4);
            }
            else if(choice.startsWith("Save secret message"))
            {
                String message = choice.substring(20);
                save_massage.setMessage(message);
                p.buttonWasPressed(6);
            }
            else if(choice.equals("Delete secret message"))
            {
                p.buttonWasPressed(7);
            }
            else if(choice.equals("Show galaxy map"))
            {
                p.buttonWasPressed(5);
            }
            else if(choice.equals("undo")){
                p.undo();
            }
            else{
                System.out.println("invalid choice"); }
        }
    }
}
