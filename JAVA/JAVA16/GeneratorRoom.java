package SoftwareDesign.Project;


import java.util.Scanner;

public class GeneratorRoom extends Room {
    Scientists scientist;

    GeneratorRoom(Player player, Guard[] guards, TCP_Client tcp) {
        super(3, player, guards, tcp);

        this.scientist = Scientists.getInstance(player, 3);

        //look around

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
        if(scientist.isAlive()) {
            System.out.println("The Generator room is where the nuke war heads are made" +
                    "\nthere is a huge generator in front of you and a scientist walking around");
        }
        else {
            System.out.println("The Generator room is where the nuke war heads are made" +
                    "\nthere is a huge generator in front of you");
        }
        //sensor
        Scanner obj = new Scanner(System.in);
        String c = "";
        if(scientist.isAlive()) {
            System.out.println("1- Talk to the Scientist." +
                    "\n2- Examine the Generator\n");
            while(true) {
                c = obj.nextLine();
                if (c.equals("1")) {
                    scientist.Talkb.talk();

                    scientist.setTime_up(false);

                    while (!tcp.isShoot() && !tcp.isStab() && !scientist.isTime_up());

                    if (tcp.isShoot()) {
                        System.out.println("You shot the scientist");
                        tcp.setShoot(false);
                    }

                    if (tcp.isStab()) {
                        System.out.println("You stabbed the scientist");
                        tcp.setStab(false);
                    }

                    if (!scientist.isTime_up()) {
                        scientist.setAlive(false);
                        scientist.Killb.kill(guards);
                        player.alerted = true;
                    } else {
                        System.out.println("Time up 10 seconds have passed and you joined the enemy lines");
                        System.exit(1);
                    }
                    if (!scientist.isAlive()) {
                        System.out.println("You managed to kill the scientist but he alerted all the guards with a loud scream!");
                        System.out.println("You have 10 seconds to either: ");
                        System.out.println("1- Examine the Generator and Exit");
                        System.out.println("2- Hide behind the generator and wait for the guards to leave then Exit");

                        guards[1].setTime_up(false);

                        while (!guards[1].isTime_up()) {
                            c = obj.nextLine();
                            if (c.equals("2")) {
                                System.out.println("Keep your phone still to hide");
                                while (!tcp.isHide() && !guards[1].isTime_up()) ;
                                tcp.setHide(false);
                                if (!player.shield) {
                                    System.out.println("Hiding here will not help you, there are many guards and they found you," +
                                            "you do not have any protection so you died");
                                    System.exit(1);
                                } else {
                                    System.out.println("The guards found you, but your shield helped you to block the guards fire" +
                                            "\nAnd shoot the guards with your gun or stab them using your phone");
                                    while (!guards[1].isTime_up()) {
                                        if (tcp.isShoot()) {
                                            tcp.setShoot(false);
                                            player.p.ButtonWasPressed(3);
                                            System.out.println("All are dead now");
                                            break;
                                        } else if (tcp.isStab()) {
                                            tcp.setStab(false);
                                            player.p.ButtonWasPressed(0);
                                            System.out.println("Nice you killed all the guards using a knife lol");
                                            break;
                                        } else {
                                            System.out.println("No motion detected");
                                        }
                                    }
                                    System.out.println("1- East (Equipment Room) or" +
                                            "\n2- North (Record Room)");
                                    while (true) {
                                        c = obj.nextLine();

                                        if (c.equals("1")) {
                                            System.out.println("Entering the Equipment Room");
                                            player.setLocation(1);
                                            new EquipmentRoom(player, guards, tcp);
                                            break;
                                        } else if (c.equals("2")) {
                                            System.out.println("Entering the Record Room");
                                            player.setLocation(2);
                                            new Recordroom(player, guards, tcp);
                                            break;
                                        } else {
                                            System.out.println("Invalid choice.");
                                        }
                                    }
                                    break;
                                }
                                break;
                            } else if (c.equals("1")) {
                                hidden_objects();
                                System.out.println("1- East (Equipment Room) or" +
                                        "\n2- North (Record Room)");
                                while (!guards[1].isTime_up()) {
                                    c = obj.nextLine();

                                    if (c.equals("1") && !guards[1].isTime_up()) {
                                        System.out.println("Entering the Equipment Room");
                                        player.setLocation(1);
                                        new EquipmentRoom(player, guards, tcp);
                                        break;
                                    } else if (c.equals("2") && !guards[1].isTime_up()) {
                                        System.out.println("Entering the Record Room");
                                        player.setLocation(2);
                                        new Recordroom(player, guards, tcp);
                                        break;
                                    } else {
                                        System.out.println("Invalid choice.");
                                    }
                                }
                            }
                        }
                    }
                } else if (c.equals("2")) {
                    if (player.isCode()) {
                        System.out.println("You already have the codes");
                    } else {
                        hidden_objects();
                    }
                    System.out.println("Talking to the Scientist");
                    scientist.Talkb.talk();
                    scientist.setTime_up(false);

                    while (!tcp.isShoot() && !tcp.isStab() && !scientist.isTime_up()) ;
                    if (!scientist.isTime_up()) {
                        scientist.setAlive(false);
                        scientist.Killb.kill(guards);
                        player.alerted = true;
                    }

                    if (scientist.isTime_up()) {
                        System.out.println("Time up 10 seconds have passed and you joined the enemy lines");
                        System.exit(1);
                    }
                    if (scientist.isAlive()) {
                        System.out.println("You managed to kill the scientist but he alerted all the guards with a loud scream!");
                        System.out.println("You have 10 seconds to : ");
                        System.out.println("1- Hide behind the generator and wait for the guards to leave then Exit");
                        System.out.println("2- Fight the guards then Exit");
                        c = obj.nextLine();
                        guards[1].setTime_up(false);

                        while (true) {
                            if (c.equals("1")) {
                                System.out.println("Stand sill");
                                while (!tcp.isStab() && !guards[1].isTime_up()) ;
                                tcp.setStab(false);
                                while (!guards[1].isTime_up()) ;
                                System.out.println("Ok you are good to go now" +
                                        "\n1- East (Equipment Room) or" +
                                        "\n2- North (Record Room)");
                                while (true) {
                                    c = obj.nextLine();
                                    if (c.equals("1")) {
                                        System.out.println("Entering the Equipment Room");
                                        player.setLocation(1);
                                        new EquipmentRoom(player, guards, tcp);
                                        break;
                                    } else if (c.equals("2")) {
                                        System.out.println("Entering the Record Room");
                                        player.setLocation(2);
                                        new Recordroom(player, guards, tcp);
                                        break;
                                    } else {
                                        System.out.println("Invalid choice.");
                                    }
                                }
                                break;
                            } else if (c.equals("2")) {
                                if (!player.shield) {
                                    System.out.println("What were you thinking facing all guards with no protection, you died");
                                    System.exit(1);
                                } else {
                                    System.out.println("Your shield helped you to block the guards fire" +
                                            "\nMove your phone to shoot (rotate) at the guards");
                                    // sensor either shoot or stab
                                    while (!guards[1].isTime_up()) {
                                        while (!tcp.isShoot() && !guards[1].isTime_up()) ;
                                        tcp.setShoot(false);
                                        player.p.ButtonWasPressed(3);
                                        System.out.println("All are dead now");
                                    }
                                    System.out.println("Ok you are good to go now" +
                                            "\n1- West (Equipment Room) or" +
                                            "\n2- North (Record Room)");
                                    while (true) {
                                        c = obj.nextLine();
                                        if (c.equals("1")) {
                                            System.out.println("Entering the Equipment Room");
                                            player.setLocation(1);
                                            new EquipmentRoom(player, guards, tcp);
                                            break;
                                        } else if (c.equals("2")) {
                                            System.out.println("Entering the Record Room");
                                            player.setLocation(2);
                                            new Recordroom(player, guards, tcp);
                                            break;
                                        } else {
                                            System.out.println("Invalid choice.");
                                        }
                                    }
                                    break;
                                }
                                break;
                            } else {
                                System.out.println("Invalid Option");
                            }
                        }
                    }
                    break;
                }
                else {
                    System.out.println("Invalid Option");
                }
            }
        }
        else {
            System.out.println("Examining the Generator\n");
                if(player.isCode()) {
                    System.out.println("You already have the codes");
                }
                else {
                    hidden_objects();
                }
                System.out.println("Exiting the room");
                System.out.println("Ok you are good to go now" +
                        "\n1- West (Equipment Room) or" +
                        "\n2- North (Record Room)");
                    while (true) {
                        c = obj.nextLine();
                        if (c.equals("1")) {
                            System.out.println("Entering the Equipment Room");
                            player.setLocation(1);
                            new EquipmentRoom(player, guards, tcp);
                            break;
                        } else if (c.equals("2")) {
                            System.out.println("Entering the Record Room");
                            player.setLocation(2);
                            new Recordroom(player, guards, tcp);
                            break;
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    }
                }
            }


        void hidden_objects()
    {
        System.out.println("You found the nuclear codes for the enemies war heads");
        player.setCode(true);
    }

}
