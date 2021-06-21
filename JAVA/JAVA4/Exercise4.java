package SoftwareDesign;

public class Exercise4 {
    public static void main(String[] args) {
        Integer r = 4;
        Double area = Math.PI * Math.pow(r.doubleValue(), 2.0);
        Double a = Math.sqrt(area);
        System.out.println("The raduis of the circle: " + r + "\nThe area of the circle: " + area + "\nA square with an area = " + area + " has a side length of = " + a);
    }
}
