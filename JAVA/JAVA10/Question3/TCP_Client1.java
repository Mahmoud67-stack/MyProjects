package SoftwareDesign.LAB8.Question3;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class TCP_Client1 implements Runnable {

    // ip address of the machine
    String host;

    // need the port
    int port;

    public double x, y,z,x1,x2,y1,z1;
    boolean stab, shoot, hide;
    Thread t;

    TCP_Client1(String host, int port) {

        // set the ip address and the port of the
        // the server we will connect to.

        this.host = host;
        this.port = port;

        // make this a thread
        t = new Thread(this);
        t.start();
    }

    public synchronized void setHide(boolean hide) {
        this.hide = hide;
    }

    public synchronized boolean isHide() {
        return hide;
    }

    public synchronized boolean isShoot() {
        return shoot;
    }

    public synchronized boolean isStab() {
        return stab;
    }

    public synchronized void setStab(boolean stab) {
        this.stab = stab;
    }

    public synchronized void setShoot(boolean shoot) {
        this.shoot = shoot;
    }

    public void run() {

        try {

            // create an instance of the Socket
            // try to create a socket connection to
            // host using port

            // block -- the program will wait here \
            // to form a connection.
            // if somthing goes wrong, the progrma will
            // create an exception

            Socket socket = new Socket(host, port);

            // returns a socket object

            // grab the input stream so I can read the sensors

            InputStream input = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);

            JSONParser parser = new JSONParser();

            BufferedReader br = new BufferedReader(reader);
            String line = "";
            while ((line = br.readLine()) != null) {//read line by line

//parse String to JSON
                JSONObject jsonObject = (JSONObject) parser.parse(line);
//print the object
//select a specific value using its key

                //System.out.println(jsonObject);
/*                JSONObject accObject = (JSONObject) jsonObject.get("accelerometer");
                JSONArray AccValues = (JSONArray) accObject.get("value");
                System.out.println(AccValues);*/

                JSONObject accObject = (JSONObject) jsonObject.get("gyroscope");
                JSONArray AccValues_gyr = (JSONArray) accObject.get("value");

                accObject = (JSONObject) jsonObject.get("linearAcceleration");
                JSONArray AccValues_lacc = (JSONArray) accObject.get("value");


                accObject = (JSONObject) jsonObject.get("rotationVector");
                JSONArray AccValues_rotvec = (JSONArray) accObject.get("value");


                accObject = (JSONObject) jsonObject.get("accelerometer");
                JSONArray AccValues_acc = (JSONArray) accObject.get("value");
                this.x = (double) AccValues_acc.get(1);
                this.x1  = (double) AccValues_rotvec.get(0);
                this.y = (double) AccValues_rotvec.get(1);
                this.z = (double) AccValues_rotvec.get(2);
                this.x2  = (double) AccValues_gyr.get(0);
                this.y1 = (double) AccValues_gyr.get(1);
                this.z1 = (double) AccValues_gyr.get(2);
              if(x < -17)
                {
                    setStab(true);
                }

                if(x1>0&&y>0&&z>0 && !(x < -17))
                {
                    setShoot(true);
                }

                else if(x2<0.00001&&y1<0.00001&&z1<0.00001 && ! (x< -17))
                {
                    setHide(true);
                }

                }


                /*this.x = (double) AccValues.get(0);
                this.y = (double) AccValues.get(1);
                this.z = (double) AccValues.get(2);

                System.out.println(" X = "+ this.x);

                System.out.println("Y = "+ this.y);

                System.out.println("Z = "+ this.z);*/
//print the selected value

            //----------------------------------------------------------------------------
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
