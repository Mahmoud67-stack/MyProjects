package SoftwareDesign.Project;

import java.util.Scanner;

public class EquipmentRoom extends Room{

    EquipmentRoom(Player player, Guard[] guards, TCP_Client tcp) {
        super(1, player, guards, tcp);
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

    void look()
    {
        System.out.print("The Equipment room is where American craft their weapons" +
                "\nthey have so many tools to upgrade their weapons");

            System.out.println("You are recognized as a threat");
            System.out.println("You have 10 seconds to either: ");
            System.out.println("1- Talk to the Guard in front of you, and examine the crafting table, then exit the room" +
                    "\n2- Kill the guard in front of you, and examine the crafting table, then exit the room");

            Scanner obj = new Scanner(System.in);

            guards[1].setTime_up(false);

            while(true)
            {
              String c = obj.nextLine();
              if(c.equals("1") && !guards[1].isTime_up()) {
                  guards[1].Talkb.talk();
                  if (!player.shield && !guards[1].isTime_up()) {
                      System.out.println("And you died");
                      System.exit(1);
                  } else {
                      System.out.println("And you blocked the bullets with your shield");
                      System.out.println("Move your phone to Shoot (rotate) or Stab (move)");
                      while (!guards[1].isTime_up()) {
                          if (tcp.isShoot()) {
                              tcp.setShoot(false);
                              player.p.ButtonWasPressed(3);
                              System.out.println("You shot all the guards and All the guards are dead now");
                              System.out.println("Ok you are good to go now" +
                                      "\n1- West (Generator Room) or" +
                                      "\n2- North (Control Room)");
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
                                      System.out.println("Invalid choice.");
                                  }
                              }
                              break;
                          } else if (tcp.isStab()) {
                              tcp.setStab(false);
                              player.p.ButtonWasPressed(0);
                              System.out.println("Nice you killed all the guards using a knife lol");
                              break;
                          }
                          else
                          {
                              System.out.println("No accurate motion detected");
                          }
                      }
                      break;
                  }
                  break;
              }
              else if(c.equals("2") && !guards[1].isTime_up())
              {
                  System.out.println("Move your phone to Shoot (rotate) or Stab (move)");
                  while(!guards[1].isTime_up())
                  {
                      if(tcp.isShoot())
                      {
                          tcp.setShoot(false);
                          player.p.ButtonWasPressed(3);
                          System.out.println("Do you want to make a: " +
                                  "1- Shield (Invincibility from all bullet shots)" +
                                  "\n2- Suppressor (Quite Shooting)");
                          while(!guards[1].isTime_up()) {
                              c = obj.nextLine();
                              if (c.equals("1")) {
                                  new shield().attach_component(player);
                                  System.out.println("You finish attaching the shield to your gun" +
                                          "\n1- West (Generator Room) or" +
                                          "\n2- North (Control Room)");
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
                                          System.out.println("Invalid choice.");
                                      }
                                  }
                                  break;
                              } else if(c.equals("2"))
                              {
                                  new suppressor().attach_component(player);
                                  System.out.println("You finish attaching the suppressor to your gun" +
                                          "\n1- West (Generator Room) or" +
                                          "\n2- North (Control Room)");
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
                                      } else {
                                          System.out.println("Invalid choice.");
                                      }
                                  }
                                  break;
                              }
                              else {
                                  System.out.println("Invalid Option");
                              }
                          }
                          break;
                      }
                      else if(tcp.isStab()) {

                          tcp.setStab(false);
                          player.p.ButtonWasPressed(0);
                          System.out.println("Do you want to make a:" +
                                  "1- Shield (Invincibility from all bullet shots)" +
                                  "\n2- Suppressor (Quite Shooting)");
                          while(true) {
                              c = obj.nextLine();
                              if (c.equals("1")) {
                                  new shield().attach_component(player);
                                  System.out.println("Ok you are good to go now" +
                                          "\n1- West (Generator Room) or" +
                                          "\n2- North (Control Room)");
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
                                          System.out.println("Invalid choice.");
                                      }
                                  }
                                  break;
                              } else if(c.equals("2"))
                              {
                                  new suppressor().attach_component(player);
                                  System.out.println("Ok you are good to go now" +
                                          "\n1- West (Generator Room) or" +
                                          "\n2- North (Control Room)");
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
                                          System.out.println("Invalid choice.");
                                      }
                                  }
                                  break;
                              }
                              else {
                                  System.out.println("Invalid Option");
                              }
                          }
                          break;
                      }
                  }
                  break;
              }
              else {
                  System.out.println("Invalid Option");
              }
              if(guards[1].isTime_up())
              {
                  System.out.println("The time is up and you lost");
                  System.exit(1);
              }
            }
    }
}
