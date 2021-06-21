package SoftwareDesign.Project;

import java.util.ArrayList;
import java.util.Scanner;
class sleep{
    public void sleeps(){
        try{
            Thread.sleep(1500);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void longlseep(){
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

public class Story{
    public void beginning(){
        sleep s=new sleep();

        System.out.println("You are Obetsa, you have been trained your entire life by the russian secret service,your purpose is to stop america from bombing russia with their nukes\n\n");
        s.sleeps();
        System.out.println("Putin: How is this possible? Our nukes have been tampered with, I smell betrayal!");
        s.sleeps();
        System.out.println("Rutskoy: Sir, I've just recieved word from our spies in America, they have a plan to end the war and eradicate us");
        s.sleeps();
        System.out.println("Putin: ha? the american filth is no match for mother russia, our soldiers will  no doubt beat them on the battlefield");
        s.sleeps();
        System.out.println("Ruskoy: Nukes, sir, they will nuke russia now that they know our nuclear weapons are disarmed");
        s.sleeps();
        System.out.println("Putin:   We must stop them now!");
        s.sleeps();
        System.out.println("Rutskoy: How can we stop them? ");
        s.sleeps();
        System.out.println("Putin: Bring out the secret weapon, Obetsa.");
        s.sleeps();
        System.out.println("Rutskoy: But he's not ready sir...");
        s.sleeps();
        System.out.println("Putin: has he not been trained for the last 14 years?");
        s.sleeps();
        System.out.println("Rutskoy: he is only halfway through his training program, the russian regime always trains its soldiers to the extreme!");
        s.sleeps();
        System.out.println("Putin: he is our best bet, bring him to me!");

        s.sleeps();
        Scanner x= new Scanner(System.in);

        String in;

        System.out.println("1-Who are you? \n"+
                "2-What do you want from me?\n"+
                "3-At your service master");

        in=x.nextLine();
        while(!(in.contains("1")||in.contains("2")||in.contains("3"))){
            System.out.println("invalide choice");
            in=x.nextLine();
        }
        if(in.contains("1")){
            System.out.println("Obetsa: Who are you? \n");
            s.sleeps();
            System.out.println("Putin: I am putin, you have been trained your whole life to answer to me");
            s.sleeps();
            System.out.println("1-I answer to no one\n2-ok master");
            in =x.nextLine();
            while(!(in.contains("1")||in.contains("2"))){
                System.out.println("invalide choice");
                in=x.nextLine();
            }
            if(in.contains("1")){
                System.out.println("Obetsa: I answer to no one");
                s.sleeps();
                System.out.println("Putin:This mission is meant to save all of mother russia, your loyalty to me is pointless, I know that your loyalty for russia is unquestionable");
            }
            else if(in.contains("2")){

                System.out.println("Putin:I know your loyalty to russia is unquestionable");
            }

        } else if(in.contains("2")){
            System.out.println("Obetsa:What do you want from me?");
            s.sleeps();
            System.out.println("Putin: you have a task");
        }
        else if(in.contains("3")){
            System.out.println("Obetsa: At your service master");
            s.sleeps();
            System.out.println("Putin: That's good, you have a task");
        }

        s.sleeps();
        System.out.println("Putin: Remember your mother obetsa? her life is at stake too");
        s.sleeps();
        System.out.println("1- My mother has forsaken me \n"+
                "2-Why would I want to protect someone who has left me ever since I was a child?");
        in=x.nextLine();
        while(!(in.contains("1")||in.contains("2")||in.contains("3"))){
            System.out.println("invalid choice");
            in=x.nextLine();
        }
        s.sleeps();
        if(in.contains("1")){
            System.out.println("Obetsa: My mother has forsaken me ");
        }
        else if(in. contains("2")){

            System.out.println("Obetsa: Why would I want to protect someone who has left me ever since I was a child?");
        }
        s.sleeps();
        System.out.println("Putin: She only saved your life, she did this only to protect you");
        s.sleeps();
        System.out.println("1-How did she save my life?\n2-Why would I believe you? ");
        in=x.nextLine();
        while(!(in.contains("1")||in.contains("2"))){
            System.out.println("invalide choice");
            in=x.nextLine();
        }
        s.sleeps();
        if(in.contains("1")){
            System.out.println("Obetsa:How did that save my life?\nPutin:Oh obetsa, you where set for execution on the day of your birth, she gave you away only out of pure love");
        }else if(in.contains("2")){
            System.out.println("Obetsa:Why would I beleive you?");
                   s.sleeps();
                   System.out.println("Putin:Why would I lie to you? She gave you away for a good cause Obetsa, she never loved anything more than you and mother russia");

        }
        s.sleeps();
        System.out.println("1-then why did she give me away?\n2-I hate her nonetheless..");
        in=x.nextLine();
        while(!(in.contains("1")||in.contains("2"))){
            System.out.println("invalide choice");
            in=x.nextLine();
        }
        if(in.contains("1")){
            System.out.println("Obetsa: then why did she give me away?");
        }else if (in.contains("2")){
            System.out.println("Obetsa: I hate her nonetheless..");
        }
        s.sleeps();
        System.out.println("Putin:Your father, it was the price to pay for his actions");
        s.sleeps();
        System.out.println("Obetsa: My father? which I've never met? what did he do?");
        s.sleeps();
        System.out.println("Rutskoy: doesn't matter, you have a job to do, you will be sent to the helicpoter soon for transport,maybe you'lle find some info on your past life on your mission.");

        s.longlseep();

    }


    public boolean book(){

        System.out.println("Inside the book, you find a little key and a torn piece of paper with the heading 'The Russian key'\n" +
                "would you like to read it? ");
        Scanner x= new Scanner(System.in);
        String in;
        System.out.println("1-Yes\n2-no");
        in=x.nextLine();
        while(!(in.contains("1")||in.contains("2"))){
            System.out.println("invalide choice");
            in=x.nextLine();
        }
        if(in.contains("1")){
            System.out.println("                                                                          The Russian key  ");
            System.out.println("Russian technolgy never refuses to impress, this advanced key, contains a technology like no other, frequently called the death switch, for beware, as if it not used within 2 minutes  ");
            System.out.println("of it being taken out of this book, it would explode, killing its holder, to protect the powerplant from intuders");
            System.out.println("Similar technology was used on the vice president, Mike Pence, for if he dies, the death switch would activate, launching the powrplant's nuclear weapons on the Russian dogs!");
            System.out.println("The Russian traitor has proven himself to be useful, this technology will guarantee America's success in winning the war, if anything goes wrong");
            System.out.println("\n                                                                                                                                                  -Jhon Hawkins ,");
            System.out.println("                                                                                                                                                   Powerpnt Analyst");
        }
        else{
            return false;
        }
        return true;
    }



    public void end(){
        Scanner x= new Scanner(System.in);
        String in;
        System.out.println("You successfully walk into the control room to find Trump, Pence and a mysterious man, he looks familar.");
        sleep s=new sleep();
        s.sleeps();
        System.out.println("1-Halt!\n2-Stop or ille shoot!");
        in=x.nextLine();
        while(!(in.contains("1")||in.contains("2"))){
            System.out.println("invalide choice");
            in=x.nextLine();
        }
        if(in.contains("1")){
            System.out.println("Obetsa: Halt!");
        }
        else if(in.contains("2")){
            System.out.println("Obetsa: Stop or ille shoot!");
        }
        s.sleeps();
        System.out.println("Trump: who is this and how did he pass the guards?");
        s.longlseep();
        System.out.println("Pence: you can't stop us, filthy russian. WE won this war. KILL him guard!");
        s.sleeps();
        System.out.println("Mysterious Man: No, dont kill him!");
        s.sleeps();
        System.out.println("*the guard seems to stop aiming the gun at you based on the order, the guard is the only one armed in the room*");
        System.out.println("1-take advantage and kill the guard\n2- do nothing");
        in=x.nextLine();
        while(!(in.contains("1")||in.contains("2"))){
            System.out.println("invalide choice");
            in=x.nextLine();
        }
        if(in.contains("1")){
            System.out.println("You kill the guard! Trump is now almost defenseless!");
        }
        else if(in.contains("2")){
            System.out.println("Trump: kill him!! Obetsa's reactions surpass the guard's and wins the shoot off");
        }
        s.longlseep();
        System.out.println("Mysterious Man: Alexander! is that you?");
        System.out.println("1- My name is Obetsa!\n2- who the hell is alexander?\n3-Screw off before I kill you!");
        in=x.nextLine();

        while(!(in.contains("1")||in.contains("2")||in.contains("3"))){
            System.out.println("invalid choice");
            in=x.nextLine();
        }
        if(in.contains("1")){
            System.out.println("Obetsa: My name is OBETSA!!");
            s.longlseep();
            System.out.println("Mysterious Man: is this what they have named you.. these Russian Dogs! You are nothing to them but a weapon!");
        }
        else if(in.contains("2")){
            System.out.println("Obetsa: who the hell is alexander?");

        }
        else if(in.contains("3")){
            System.out.println("Obetsa: Screw off before I kill you!");
        }
        s.longlseep();
        System.out.println("Mysterious Man: I am you father, of course I would know my son even after all of these years..");
        s.sleeps();
        System.out.println("Father: join me alexander, the russians only know power and destruction , they don't care about their people");
        s.sleeps();
        System.out.println("1-I don't believe you traitor, stop talking now!\n2-Why did you betray russia.. and Mother!");
        in=x.nextLine();
        while(!(in.contains("1")||in.contains("2"))){
            System.out.println("invalide choice");
            in=x.nextLine();
        }
        if(in.contains("1")){
            System.out.println("Obeetsa: I don't believe you traitor, stop talking now! *the man stops talking and starts tearing up, it seems like regret has overwhelmed him*");
        }
        else if(in.contains("2")){
            System.out.println("Obetsa: Why did you betray russia.. and Mother!");
            s.sleeps();
            System.out.println("Father: Their ways were too immoral, I couldn't side with them any longer, they are the bad guys");
            s.sleeps();
            System.out.println("Obetsa: Their ways may be immoral but true Russians would never betray their own.. if I let Russia lose then Mother's life is lost with too");
        }
        s.sleeps();
        System.out.println("1-kill pence and kill trump  (leave father)");
        System.out.println("2-kill pence and take trump alive (kill father)");
        System.out.println("3-kill everyone and leave");
        System.out.println("4-Join the USA ");

        in=x.nextLine();
        while(!(in.contains("1")||in.contains("2")||in.contains("3")||in.contains("4"))){
            System.out.println("invalide choice");
            in=x.nextLine();
        }
        if(in.contains("1")){
            System.out.println("*you shoot both trump and pence, father goes into shock*");
            s.sleeps();
            System.out.println("Father: ... what have you done?");
            s.longlseep();
            System.out.println("Obetsa: This is it Father! you can finally be free from American filth!");
            s.longlseep();
            System.out.println("Father: I can't.. Putin will torcher me until every nerve in my body has been destroyed. What have you become Alexander? what have these monsters done to you? why would you do this?");
            s.longlseep();
            System.out.println("Obetsa: You see, in the beginning, I was nothing but a regular boy, I didn't stand out anymore than 1 of many leaves on a tree");
            s.longlseep();
            System.out.println("Father: And is a leaf's only purpose to fall? Because this is what you have done Obetsa, you have done nothing but fall ever since you where born");
            s.longlseep();
            System.out.println("Obetsa: No! I have won my country this war and I have freed my family from everything that can harm us in the future! We can run away dad! We can live happily ever after on a farm somewhere far away where no politics can get to us, just you, me , and Mother!");
            s.longlseep();
            System.out.println("Father: you don't understand.. there is no running from Putin *Father aims gun at you*");
            s.longlseep();
            System.out.println("Alexander: What are you doing? ");
            s.longlseep();
            System.out.println("Father: you are not my son, not anymore.. my son would never agree to this assassination, Alexander was killed by the Russian regime, you are only what they call you, Obetsa, a heartless assassin");
            s.longlseep();
            System.out.println("1-Shoot father\n2-do nothing");
            in=x.nextLine();
            while(!(in.contains("1")||in.contains("2"))){
                System.out.println("invalid choice");
                in=x.nextLine();
            }
            if(in.contains("1")){
                System.out.println("* You pull out your gun to shoot at father.. your instincts act against you, you could not shoot your own father*");
                s.longlseep();
                System.out.println("Father: Goodbye, Obetsa * Father pulls the trigger *");
                s.sleeps();
                System.out.println("You die.. but take trump with you, America has lost access to its nuclear codes, making Russia win the war, but at what cost?");
            }
            else if(in.contains("2")){
                System.out.println("* you stand there, vulnerable and exposed *");
                s.longlseep();
                System.out.println("Obetsa: please father, I am still your son!");
                s.sleeps();
                System.out.println("*a tear falls on you father's face as he pulls the trigger *");
                s.sleeps();

                System.out.println("You die.. but take trump with you, America has lost access to its nuclear codes, making Russia win the war, but at what cost?");
            }
        }
        else if(in.contains("2")){
            System.out.println("You have done it! the nuclear codes where not yet executed and you have saved Russia from the nukes, you will be greeted as a hero!");
        }
        else if(in.contains("3")){
            System.out.println(" You kill everyone, and hear the nukes launch, Russia is doomed..");
        }
        else if(in.contains("4")){
            System.out.println("Father: Yes! Alexander, I knew that my son would see truth though logic! Your Mother will survive! I swear!");
            s.longlseep();
            System.out.println("Pence: This monstrosity of a human being will not be accepted on American soil *Pence pulls gun out*");
            s.longlseep();
            System.out.println("Father: What are you doing? he has conceded, he is my son let him be! *pence shoots Father and turns to you*");
            s.longlseep();
            System.out.println("Obetsa: FATHER!! NO!! I have conceded, why are you turning on us");
            s.longlseep();
            System.out.println("Pence: You see Obetsa, Alexander, or whatever you may be called, your father was a fool to think that we would trust a traitor! his use was over, we already have the nuclear technology in place!");
            s.longlseep();
            System.out.println("Alexander: No! You monsters, he gave your life to you, so have I..");
            s.longlseep();
            System.out.println("Trump: Oh just shoot him already");
            s.longlseep();
            System.out.println("Pence: Triumph over everythign else  *Pence shoots you*");
            s.longlseep();
            System.out.println(" As you lie bleeding on the floor, waiting for your life to be ripped from your body, you hear the nuclear codes launch, you realise that you have failed Russia and tears drop down your face.. along with your blood, realising that you will never see Mother ever again");

        }




    System.exit(1);

    }
}



