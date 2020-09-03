package model;

public class Model {
    public double calculateVf( String viStr, String aStr, String tStr) throws CalculationException {
        double vi, a, t;
        try {
            vi = Double.parseDouble(viStr);
        }
        catch (NumberFormatException e) {
            throw new CalculationException("Cannot parse initial velocity value from text field");
        }

        try {
            a = Double.parseDouble(aStr);
        }
        catch (NumberFormatException e) {
            throw new CalculationException("Cannot parse acceleration value from text field");
        }

        try {
            t = Double.parseDouble(tStr);
        }
        catch (NumberFormatException e) {
            throw new CalculationException("Cannot parse time value from text field");
        }
        return vi + a * t;
    }
}
