package SoftwareDesign.LAB9.Question2;


public class WeatherStation extends ConcreteSubject implements Runnable{

    WeatherStation(){
        Thread t=new Thread(this);
        t.start();
    }

    public void run() {
        String x = "";
        int i=-1;
        while(true) {
            if(i==0){
                x="Spring";
            }
            else if(i==1){
                x="Summer";
            }
            else if(i==2){
                x="Fall";
            }
            else if(i==3){
                x="Winter";
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            NotifyObserver(x);
            i=(i+1)%4;


        }
    }

}