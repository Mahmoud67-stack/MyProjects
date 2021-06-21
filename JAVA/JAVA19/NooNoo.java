package SoftwareDesign.SampleExamFinal;

public class NooNoo extends ConcreteSubject implements Runnable{

    private static NooNoo instance;
    Thread t;
    private NooNoo()
    {
        instance = new NooNoo();

        t = new Thread(this);
        t.start();
    }

    public static synchronized NooNoo getInstance(){
        if(instance == null){
            instance = new NooNoo();
        }
        return instance;
    }

    @Override
    public void run() {
        while (true){
            try {
                    t.sleep(1000);
                }
            catch (InterruptedException e)
                {
                  e.printStackTrace();
                }

            this.notifyObservers();
        }
    }
}
