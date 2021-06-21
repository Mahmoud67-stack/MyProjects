public class TwentyQuestions {
    public static void main(String[] args) {
        StdOut.println("Welcome to the number guessing game!");
        StdOut.println("You will be given an interval in which the number you should guess is in.");
        StdOut.println("The interval is from 1 to 100");
        int goal = 1 + (int) (Math.random() * 100);
        StdOut.println("You have 3 times to repeat you guess");
        StdOut.println("After the first wrong guess you will be given a strong hint");
        StdOut.println("After the second wrong guess you will be given a weak hint");
        StdOut.println("Goodluck!");
        int guess = 0, count = 0;
        while (count != 3 && guess != goal) {
            StdOut.print("What is your guess: \n> ");
            guess = StdIn.readInt();
            count++;
            if (count == 1 && guess != goal) {
                StdOut.println("Your guess was wrong here is a hint: ");
                if (goal >= 90) {
                    StdOut.print("The number is between 90 and 100");
                }
                else if (goal >= 80 && goal < 90) {
                    StdOut.print("The number is between 80 and 89");
                    if (goal % 5 == 0) {
                        StdOut.println(" and the number is a multipile of 5");
                    }
                    else
                        StdOut.println(" and the number is not a multiple of 5");
                }
                else if (goal >= 70 && goal < 80) {
                    StdOut.print("The number is between 70 and 79");
                    if (goal % 5 == 0) {
                        StdOut.println(" and the number is a multipile of 5");
                    }
                    else
                        StdOut.println(" and the number is not a multiple of 5");
                }
                else if (goal >= 60 && goal < 70) {
                    StdOut.print("The number is between 60 and 69");
                    if (goal % 5 == 0) {
                        StdOut.println(" and the number is a multipile of 5");
                    }
                    else
                        StdOut.println(" and the number is not a multiple of 5");
                }
                else if (goal >= 50 && goal < 60) {
                    StdOut.print("The number is between 50 and 59");
                    if (goal % 5 == 0) {
                        StdOut.println(" and the number is a multipile of 5");
                    }
                    else
                        StdOut.println(" and the number is not a multiple of 5");
                }
                else if (goal >= 40 && goal < 50) {
                    StdOut.print("The number is between 40 and 49");
                    if (goal % 5 == 0) {
                        StdOut.println(" and the number is a multipile of 5");
                    }
                    else
                        StdOut.println(" and the number is not a multiple of 5");
                }
                else if (goal >= 30 && goal < 40) {
                    StdOut.print("The number is between 30 and 39");
                    if (goal % 5 == 0) {
                        StdOut.println(" and the number is a multipile of 5");
                    }
                    else
                        StdOut.println(" and the number is not a multiple of 5");
                }
                else if (goal >= 20 && goal < 30) {
                    StdOut.print("The number is between 20 and 29");
                    if (goal % 5 == 0) {
                        StdOut.println(" and the number is a multipile of 5");
                    }
                    else
                        StdOut.println(" and the number is not a multiple of 5");
                }
                else if (goal >= 10 && goal < 20) {
                    StdOut.print("The number is between 10 and 19");
                    if (goal % 5 == 0) {
                        StdOut.println(" and the number is a multipile of 5");
                    }
                    else
                        StdOut.println(" and the number is not a multiple of 5");
                }
                else if (goal < 10) {
                    StdOut.print("The number is between 1 and 9");
                    if (goal % 5 == 0) {
                        StdOut.println(" and the number is a multipile of 5");
                    }
                    else
                        StdOut.println(" and the number is not a multiple of 5");
                }
            }
            else if (count == 2 && guess != goal) {
                StdOut.println("You got your second guess wrong too!");
                StdOut.println("Here is a hint: ");
                if (goal % 3 == 0)
                    StdOut.println("The number is a multipile of 3");
                else
                    StdOut.println("The number is not a multipile of 3");
            }
        }
        if (count == 3 && guess != goal)
            StdOut.println("Game Over you have lost, the number is: " + goal);
        else
            StdOut.println("Congrats you have won!");
    }
}
