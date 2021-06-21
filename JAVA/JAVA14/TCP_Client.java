package SoftwareDesign.LAB12;

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

public class TCP_Client extends ConcreteSubject implements Runnable {

    // ip address of the machine
    String host;

    // need the port
    int port;

    public double z, y;

    TCP_Client(String host, int port) {

        // set the ip address and the port of the
        // the server we will connect to.

        this.host = host;
        this.port = port;

        // make this a thread
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {

        try {

            // create an instance of the Socket
            // try to create a socket connection to
            // host using port

            // block -- the program will wait here \
            // to form a connection.
            // if something goes wrong, the program will
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
                JSONObject accObject = (JSONObject) jsonObject.get("accelerometer");
                JSONArray AccValues = (JSONArray) accObject.get("value");
                this.z = (double) AccValues.get(2);
                this.y = (double) AccValues.get(1);

                if(y>1&& !(z<-1) && !(z>1))
                {
                    Message msg = new Message(this, "", "ghost traps");

                    publishMessage(msg);
                }
                if(z>1 && !(y>1) && !(z<-1))
                {
                    Message msg = new Message(this, "", "proton packs");
                    publishMessage(msg);
                }

                if(z<-1 && !(z>1) && !(y>1))
                {
                    Message msg = new Message(this, "", "slime blowers");
                    publishMessage(msg);
                }

//print the selected value

            }
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
