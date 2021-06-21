package SoftwareDesign.Project;

public class Enemy extends ConcreteObserver{
    KillBehaviour Killb;
    TalkBehaviour Talkb;

    Enemy(Subject subject)
    {
        super(subject);
    }

}
