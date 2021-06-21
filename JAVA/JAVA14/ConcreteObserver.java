package SoftwareDesign.LAB12;


public class ConcreteObserver implements Observer {
    Subject[] subject;
    public ConcreteObserver(Subject [] subject)
    {
        this.subject = subject;

        for(int i=0; i<this.subject.length ;i++){

            this.subject[i].RegisterObserver(this);
        }
    }

    @Override
    public void update(Message msg) {
        System.out.println(msg);
    }
}

