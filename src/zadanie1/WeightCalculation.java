package zadanie1;

public class WeightCalculation {
    public static String calculateForKiloGrams(String weight) {
        double kilograms = Double.parseDouble(weight);
        double grams = kilograms * 1000;
        double miligrams = kilograms * 1000000;

        return "<h1>Podana wartość w przeliczeniu na: </h1> " +
                "<h2>kilogramow " + kilograms + "</h2>" +
                "<h2>gramów: " + grams + "</h2>" +
                "<h2>miligramów: " + miligrams + "</h2>";
    }

    public static String calculateForGrams(String weight) {
        double grams = Double.parseDouble(weight);
        double kilograms = grams / 1000;
        double miligrams = grams * 1000;

        return "<h1>Podana wartość w przeliczeniu na: </h1> " +
                "<h2>kilogramow " + kilograms + "</h2>" +
                "<h2>gramów: " + grams + "</h2>" +
                "<h2>miligramów: " + miligrams + "</h2>";
    }

    public static String calculateForMiliGrms(String weight) {
        double miligrams = Double.parseDouble(weight);
        double grams = miligrams / 1000;
        double kilograms = miligrams / 1000000;

        return "<h1>Podana wartość w przeliczeniu na: </h1> " +
                "<h2>kilogramow " + kilograms + "</h2>" +
                "<h2>gramów: " + grams + "</h2>" +
                "<h2>miligramów: " + miligrams + "</h2>";
    }
}
