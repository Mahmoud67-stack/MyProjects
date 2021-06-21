package SoftwareDesign.LAB9.Question1;


public class Watch extends ConcreteSubject implements Runnable{
    Watch(){
        Thread t=new Thread(this);
        t.start();
    }

    public void run() {
        int i=-1;
        while(true) {
            NotifyObserver(i);
            i=(i+1)%24;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }
    }

}