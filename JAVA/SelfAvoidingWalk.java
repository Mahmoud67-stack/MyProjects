public class SelfAvoidingWalk {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);    //The size of the city N*N
        int T = Integer
                .parseInt(args[1]);   //The number we want to repeat the SelfAvoidingWalk experiment
        int deadEnds
                = 0;   //a counter for the number the experiment faces a dead end so we can count the percentage of the dead ends for all trials
        for (int t = 0; t < T; t++)    // A loop for the number of trials
        {

            boolean[][] a
                    = new boolean[N][N]; //An array that represents all the intersection of all the wlaks in the N*N city
            int x = N / 2, y = N
                    / 2;    //The initial position in the city which is excatly at the middle
            while (x > 0 && x < N - 1 && y > 0
                    && y < N - 1)//loop until we exit the bounderies of the city
            {
                a[x][y] = true; // assigning the intersection to be visited
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y
                        + 1])//we reached to dead end beacuse non of the intersection around us is not visited
                {
                    deadEnds++;
                    break;
                }
                double r = Math
                        .random();// assigning a variable to a random number in the interval [0,1) that will determine our movement in the city
                if (r < 0.25) {
                    if (!a[x + 1][y]) x++;
                } //checking if the intersection that we will move to is empty
                else if (r < 0.5) {
                    if (!a[x - 1][y]) x--;
                }   // Checking if the next intersection is not visited
                else if (r < 0.75) {
                    if (!a[x][y + 1]) y++;
                }//Checking if the next intersection is not visited
                else if (r < 1.0) {
                    if (!a[x][y - 1]) y--;
                }//Checking  if the next intersection is not visited

            }
        }
        System.out
                .println("The percentage for the dead ends is: " + ((deadEnds / (T * 1.0)) * 100));

    }


}
