package SoftwareDesign.QUIZ2;


import java.util.Random;

public class Main {

        public static void main(String[] args) throws Exception {

            final int num_waiters = 5;
            Random r = new Random();

            //create a teashop with waiters and one cook
            TeaShop ts = new TeaShop(num_waiters);

            //create 10 customers placing orders with random
            //waiters of the shop

            Customer c;

            for(int i = 0; i< 10; i++) {

                Thread.sleep(r.nextInt(5000)); // within the next 5 seconds
                c = new Customer(ts);
                c.place_order(r.nextInt(num_waiters), new Karak(c));
            }
        }

    }

}
