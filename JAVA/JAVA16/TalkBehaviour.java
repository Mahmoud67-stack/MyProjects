package SoftwareDesign.Project;

class notalk extends TalkBehaviour {

    @Override
    public void talk() {
        System.out.println("you try to talk to the body guard and tries to shoot you");
    }
}
class dotalk extends TalkBehaviour {

    @Override
    public void talk() {
        System.out.println("The scientist noticed your weird look and recognizes you as an enemy" +
                "\nnow he is trying to hypnotize you to join their lines, you have" +
                "\n10 seconds to stab (move phone forward) or shoot(rotate phone)");
    }
}
public abstract class TalkBehaviour {
    abstract void talk();
}