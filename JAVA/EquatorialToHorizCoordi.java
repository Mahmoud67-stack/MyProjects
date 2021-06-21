public class EquatorialToHorizCoordi {
    public static void main(String[] args) {
        double declination = Double.parseDouble(args[0]);
        double HourAngle = Double.parseDouble(args[1]);
        double latitude = Double.parseDouble(args[2]);
        declination = Math.toRadians(declination);
        HourAngle = Math.toRadians(HourAngle);
        latitude = Math.toRadians(latitude);
        double Altitude = Math
                .asin((Math.sin(latitude) * Math.sin(declination)) + (Math.cos(latitude) * Math
                        .cos(declination) * Math.cos(HourAngle)));
        double Azimuth = Math
                .acos(((Math.cos(latitude) * Math.sin(declination)) - (Math.sin(latitude) * Math
                        .cos(declination) * Math.cos(HourAngle))) / Math.cos(Altitude));
        Azimuth = Math.toDegrees(Azimuth);
        Altitude = Math.toDegrees(Altitude);
        System.out.println("The Altitude is: " + Altitude + " Degrees");
        System.out.println("The Azimuth is: " + Azimuth + " Degrees");

    }
}
