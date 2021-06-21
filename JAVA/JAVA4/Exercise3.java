package SoftwareDesign;

public class Exercise3 {
    public static void main(String[] args) {
        Integer r = 4;
        Double area = Math.PI * Math.pow(r.doubleValue(), 2.0);
        Double a = Math.sqrt(area);
        System.out.println(r + "\n" + area + "\n" + a);
    }
}
