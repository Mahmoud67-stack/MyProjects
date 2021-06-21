public class BMI {
    public static void main(String[] args) {
        float weight = Float.parseFloat(args[0]);
        float height = Float.parseFloat(args[1]);
        double bmi = weight / Math.pow(height, 2.0);
        System.out.println("Your BMI ratio is : " + bmi);
    }
}
