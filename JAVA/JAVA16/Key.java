package SoftwareDesign.Project;

public class Key implements Runnable{
    Thread t;
    boolean done;


     Key()
     {
         t = new Thread(this);
         t.start();
         done = false;
     }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    @Override
     public void run() {
      try {
        t.sleep(120000);
      }
      catch (InterruptedException e) {
          e.printStackTrace();
      }
      if(!isDone())
      {
          System.out.println("The key exploded after 2 minutes have passed without using it" +
                  "\nAnd you died");
          System.exit(1);
      }

     }
}
