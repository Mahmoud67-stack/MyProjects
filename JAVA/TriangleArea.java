public class TriangleArea {
    public static void main(String[] args) {
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        float c = Float.parseFloat(args[2]);
        float s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the given triangle is: " + area);

    }
}
