public class BmiService {
    public double calculate(double weight, int height) {
        double bmiHuman = weight / (height * height / 10_000);  // делим на 10 000, потому что рост в сантиметрах.
        return bmiHuman;
    }
}
