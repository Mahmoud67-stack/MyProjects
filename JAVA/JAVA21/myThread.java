import java.io.*;
public class myThread implements Runnable
{
    String in1,in2,out;
    Thread t;
    public myThread(String n, String in, String o)
    {
        t = new Thread(this);
        in1 = n;
        in2 = in;
        out = o;
        t.start();
    }
    public Thread get_Thread()
    {
        return t;
    }
    public void run()
    {
        String line;
        BufferedReader reader1 = null;
        BufferedReader reader2 = null;
        PrintWriter printer = null;
        try{
            reader1 =  new BufferedReader(new FileReader(new File(in1)));
            reader2 =  new BufferedReader(new FileReader(new File(in2)));
            printer = new PrintWriter(new FileWriter(new File(out)));
            while((line=reader1.readLine())!=null)
            {
                printer.println(line);
            }
            while((line=reader2.readLine())!=null)
            {
                printer.println(line);
            }   
        }
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally{
            try {
                reader1.close();
                reader2.close();
                printer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String args[]) throws InterruptedException
    {
        myThread thr = new myThread("Input1.txt","Input2.txt","output.txt");
        thr.get_Thread().join();
    }
}