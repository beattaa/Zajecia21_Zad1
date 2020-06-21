package zadanie1;

public class DistanceCalculation {
    public static String calculateForMeters(String distance) {
        double meters = Double.parseDouble(distance);
        double centimetres = meters * 100;
        double milimetres = meters * 1000;

        return "<h1>Podana wartość w przeliczeniu na: </h1> " +
                "<h2>metry " + meters + "</h2>" +
                "<h2>centrymetry: " + centimetres + "</h2>" +
                "<h2>milimetry: " + milimetres + "</h2>";
    }

    public static String calculateForCentyMeters(String distance) {
        double centymeters = Double.parseDouble(distance);
        double meters = centymeters / 100;
        double milimeters = meters * 10;

        return "<h1>Podana wartość w przeliczeniu na: </h1> " +
                "<h2>metry " + meters + "</h2>" +
                "<h2>centrymetry: " + centymeters + "</h2>" +
                "<h2>milimetry: " + milimeters + "</h2>";
    }

    public static String calculateForMiliMeters(String distance) {
        double milimeters = Double.parseDouble(distance);
        double meters = milimeters / 1000;
        double centymeters = milimeters / 10;

        return "<h1>Podana wartość w przeliczeniu na: </h1> " +
                "<h2>metry " + meters + "</h2>" +
                "<h2>centrymetry: " + centymeters + "</h2>" +
                "<h2>milimetry: " + milimeters + "</h2>";
    }
}
