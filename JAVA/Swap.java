public class Swap {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("We have a = " + a + "  and b = " + b);
        int t = a;
        System.out.println("We have a new variable t and make t=a, t = " + t);
        a = b;
        System.out.println("We put a=b, so now a = " + a);
        b = t;
        System.out.println("We now put b=t, so now b = " + b);
        System.out.println("Finally, now we have a= " + a + " and b = " + b);


    }
}
