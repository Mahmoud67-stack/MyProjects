package SoftwareDesign.Project;


import java.util.Scanner;

public class GameEngine {
    public static void main(String[] args) {

        new Story().beginning();

        Scanner obj = new Scanner(System.in);
        Player player = Player.getInstance(Watch.getInstance());
        Guard g0 = new Guard(player, 0);
        Guard g1 = new Guard(player, 1);
        TCP_Client tCP_Client = new TCP_Client("192.168.0.132", 65001);

        Guard[] guards = {g0, g1};

        String c = "";
        System.out.println(" You are now in the Entrance room , there is a guard guarding the entrance the entrance and a bunch of trees close by \n" +
                "1- shoot the guard (Enter 1 and rotate your phone) or hide (Enter 1 and keep your phone still)\n"+
                "2- walk up to the guard and talk to him");
//sensor

        while (true) {
            c = obj.nextLine();
            if (c.equals("1")) {
                if (tCP_Client.isShoot()) {
                    tCP_Client.setShoot(false);
                    player.p.ButtonWasPressed(3);
                    System.out.println("You kill the guard, the other guards hear the gunshot! all the guards are now suspicious\n " +
                            "you can now enter the powerplant");
                    break;
                }
                else if (tCP_Client.isHide()) {
                    tCP_Client.setHide(false);
                    player.p.ButtonWasPressed(2);
                    System.out.println("You successfully hid behind the tree");
//sensor
                    System.out.println("1- Kill the guard\n" +
                            "2-walk up to the guard and talk to him" +
                            "\nIf you want to shoot (rotate the phone) or stab (move the phone forward) move your phone do not type");
                    while(true) {
                        c = obj.nextLine();
                        if (c.equals("1")) {
                            while(true) {
                                if (tCP_Client.isStab()) {
                                    tCP_Client.setStab(false);
                                    player.p.ButtonWasPressed(0);
                                    guards[0].Killb.kill(guards);
                                    System.out.println("you kill the guard without alerting anyone, now you can enter the powerplant!");
                                    break;
                                } else if (tCP_Client.isShoot()) {
                                    tCP_Client.setShoot(false);
                                    player.p.ButtonWasPressed(3);
                                    System.out.println("You kill the guard, the other guards hear the gunshot! all the guards are now suspicious\n " +
                                            "you can now enter the powerplant");
                                    break;
                                }
                            }
                            break;
                        }
                        else if (c.equals("2")) {
                            player.p.ButtonWasPressed(1);
                            guards[1].Talkb.talk();
                            if (!player.shield) {
                                System.out.println("And you died");
                                System.exit(1);
                            } else {
                                System.out.println("And you blocked the bullets with your shield");

                                System.out.println("Move your phone to stab (move) or shoot (rotate) the guard");
                                while (!guards[1].time_up) {
                                    if (tCP_Client.isShoot()) {
                                        tCP_Client.setShoot(false);
                                        player.p.ButtonWasPressed(3);
                                        System.out.println("All the guards are dead now");
                                        break;
                                    } else if (tCP_Client.isStab()) {
                                        tCP_Client.setStab(false);
                                        player.p.ButtonWasPressed(0);
                                        System.out.println("Nice you killed all the guards using a knife lol");
                                        break;
                                    } else {
                                        System.out.println("Invalid Option");
                                        System.out.println("Or no motion detected");
                                    }
                                }
                                break;
                            }
                            break;
                        } else {
                            System.out.println("Invalid Choice!");
                            System.out.println("Or no motion detected");
                        }
                    }
                    break;
                }
            break;
            }
            else if (c.equals("2")) {
                    player.p.ButtonWasPressed(1);
                    guards[1].Talkb.talk();
                    if (!player.shield) {
                        System.out.println("And you died");
                        System.exit(1);
                    } else {
                        System.out.println("And you blocked the bullets with your shield");

                        System.out.println("Move your phone to stab (move) or shoot (rotate) the guard");
                        while (!guards[1].time_up) {
                            if (tCP_Client.isShoot()) {
                                tCP_Client.setShoot(false);
                                player.p.ButtonWasPressed(3);
                                System.out.println("All the guards are dead now");
                                break;
                            } else if (tCP_Client.isStab()) {
                                tCP_Client.setStab(false);
                                player.p.ButtonWasPressed(0);
                                System.out.println("Nice you killed all the guards using a knife lol");
                                break;
                            } else {
                                System.out.println("Invalid Option");
                                System.out.println("Or no motion detected");
                            }
                        }
                        break;
                    }
                    break;
                } else {
                    System.out.println("Invalid Choice!");
                    System.out.println("Or no motion detected");
                }
            }
            //end of entrance scene
             /* 1- Shoot rotate phone
                                                     2- knife move phone
                                                     3- hide keep phone
                                                     4-try again, no input det */
            c = obj.nextLine();
            while (!c.contains("Enter") && !c.contains("enter")) {
                System.out.println("Invalid choice.");
                c = obj.nextLine();
            }
            System.out.println("You find yourself at the centre of the power plant, you find 3 long hallways, each reaching a different room");
            System.out.println("1- Go east(equipment room)\n" +
                    "2- Go north(Control room)\n" +
                    "3- Go west (The generator)");

            while (true) {
                c = obj.nextLine();
                if (c.equals("1")) {
                    System.out.println("Entering the Equipment room");
                    player.setLocation(1);
                    new EquipmentRoom(player, guards, tCP_Client);
                    break;
                } else if (c.equals("2")) {
                    if (player.key) {
                        System.out.println("Entering the Control Room");
                        player.setLocation(4);
                        new Controlroom(player, guards,tCP_Client);
                        break;
                    } else {
                        System.out.println("The door is locked you cannot enter");
                        System.out.println("Enter another option");
                    }
                } else if (c.equals("3")) {
                    System.out.println("Entering the Generator Room");
                    player.setLocation(3);
                    new GeneratorRoom(player, guards, tCP_Client);
                    break;
                }
            }
        }

}
