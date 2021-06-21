package SoftwareDesign.Project;

import java.util.Scanner;

class Book{

    void read(){

        System.out.println("The book is saying that your father was a double agent for your side and the enemy's" +
                "\nThere is a mysterious key inside the book, you have acquired it");
    }

}
public class Recordroom extends Room {
    Book book;

    Recordroom(Player player, Guard[] guards, TCP_Client tcp) {
        super(2, player, guards, tcp);
        book = new Book();
        Scanner obj = new Scanner(System.in);
        String c = "";
        c = obj.nextLine();
        while(!(c.contains("look")||c.contains("Look")))
        {
            c =  obj.nextLine();
            System.out.println("You entered an invalid choice");
        }
        look();

    }

    void look() {
        System.out.print("The Record room is where the American government keeps" +
                "\ntheir secrete documents classified information, you can hear the");
        if (player.alerted) {
            System.out.println("guards running toward you");
        } else {
            System.out.println("guard running towards you");
        }

        System.out.println("You have 10 seconds to either:" +
                "\n1- Hide and wait for the guards to leave" +
                "\n2- Examine the documents and Exit");

        Scanner obj = new Scanner(System.in);
        guards[1].setTime_up(false);

        String c = "";
        while (!guards[1].isTime_up()) {
            c = obj.nextLine();
            if(c.equals("1"))
            {
                System.out.println("Keep the phone still");
            while(!tcp.isHide() && !guards[1].isTime_up());
                tcp.setHide(false);
                System.out.println("There is no where to hide in the Record Room" +
                        "\nYou have been found and shot you");
                if (!player.shield) {
                    System.out.println("And you died");
                    System.exit(1);
                } else {
                    System.out.println("And you blocked the bullets with your shield");
                    System.out.println("Move your phone to shoot (rotate) or stab (move)");
                    while (!guards[1].isTime_up()) {
                        if (tcp.isShoot()) {
                            tcp.setShoot(false);
                            player.p.ButtonWasPressed(3);
                            System.out.println("All the guards are dead now");
                            System.out.println("You found a strange book , do you want to open it?");
                            System.out.println("1- Yes" +
                                    "\n2- No");
                            while (true) {
                                c = obj.nextLine();
                                if (c.equals("1")) {
                                    Story s=new Story();
                                    s.book();
                                    player.Rkey = new Key();
                                    player.key = true;
                                    System.out.println("1- Generator Room (South) or\n" +
                                            "2- Central Room (East)");
                                    while (true) {
                                        c = obj.nextLine();
                                        if (c.equals("1")) {
                                            System.out.println("Entering the Generator Room");
                                            player.setLocation(3);
                                            new GeneratorRoom(player, guards, tcp);
                                            break;

                                        } else if (c.equals("2")) {
                                            if (player.key) {
                                                System.out.println("Entering the Control Room");
                                                player.setLocation(4);
                                                new Controlroom(player, guards, tcp);
                                                break;
                                            } else {
                                                System.out.println("The door is locked you cannot enter");

                                            }
                                        }else {
                                            System.out.println("Invalid Choice");
                                        }
                                    }
                                    break;
                                } else if (c.equals("2")) {
                                    System.out.println("1- Generator Room (South) or\n" +
                                            "2- Central Room (West)");
                                    while (true) {
                                        c = obj.nextLine();
                                        if (c.equals("1")) {
                                            System.out.println("Entering the Generator Room");
                                            player.setLocation(3);
                                            new GeneratorRoom(player, guards, tcp);
                                            break;

                                        } else if (c.equals("2")) {
                                            System.out.println("Entering the Control Room");
                                            player.setLocation(4);
                                            new Controlroom(player, guards, tcp);
                                            break;
                                        } else {
                                            System.out.println("Invalid Choice");
                                        }
                                    }
                                    break;
                                } else {
                                    System.out.println("Invalid option");
                                }
                            }
                            break;
                        } else if (tcp.isStab()) {
                            tcp.setStab(false);
                            player.p.ButtonWasPressed(0);
                            System.out.println("Nice you killed all the guards using a knife lol");
                            System.out.println("You found a book that is titled top secret, do you want to read it?");
                            System.out.println("1- Yes" +
                                    "\n2- No");
                            c = obj.nextLine();
                            if (c.equals("1")) {
                                player.key = true;
                                System.out.println("1- Generator Room (South) or\n" +
                                        "2- Central Room (West)");
                                while (!guards[1].isTime_up()) {
                                    c = obj.nextLine();
                                    if (c.equals("1")) {
                                        System.out.println("Entering the Generator Room");
                                        player.setLocation(3);
                                        new GeneratorRoom(player, guards, tcp);
                                        break;

                                    } else if (c.equals("2")) {
                                        System.out.println("Entering the Control Room");
                                        player.setLocation(4);
                                        new Controlroom(player, guards, tcp);
                                        break;
                                    } else {
                                        System.out.println("Invalid Choice");
                                    }
                                }
                                break;
                            } else {
                                System.out.println("Invalid Option");
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            }
            if (c.equals("2")&& !guards[1].isTime_up()) {
                System.out.println("You found a strange book , do you want to open it?");
                System.out.println("1- Yes" +
                        "\n2- No");
                c = obj.nextLine();
                if (c.equals("1") && !guards[1].isTime_up()) {
                    Story s=new Story();
                    s.book();
                    player.Rkey = new Key();
                    player.key = true;
                    System.out.println("1- Generator Room (South) or\n" +
                            "2- Central Room (West)");
                    while (!guards[1].isTime_up()) {
                        c = obj.nextLine();
                        if (c.equals("1") && !guards[1].isTime_up()) {
                            System.out.println("Entering the Generator Room");
                            player.setLocation(3);
                            new GeneratorRoom(player, guards, tcp);
                            break;

                        } else if (c.equals("2")&& !guards[1].isTime_up()) {
                            System.out.println("Entering the Control Room");
                            player.setLocation(4);
                            new Controlroom(player, guards, tcp);
                            break;
                        }
                        else
                        {
                            System.out.println("Invalid Choice");
                        }
                    }
                    break;
                }

                else if(c.equals("2")&& !guards[1].isTime_up()){
                    System.out.println("Escaping to the Generator Room");
                    new GeneratorRoom(player, guards, tcp);
                    break;
                }
                else {
                    System.out.println("Invalid Choice");
                }
                break;
            }
            else
            {
                System.out.println("Invalid Choice");
            }
            if(guards[1].isTime_up())
            {
                System.out.println("The time is up and you lost");
                System.exit(1);
            }
        }
    }
}
