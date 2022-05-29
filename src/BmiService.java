public class BmiService {
    public double calculate(double weight, int hight) {

        double bmiHuman = weight / (hight * hight / 10_000);  // делим на 10 000, потому что рост в сантиметрах.
        return bmiHuman;
    }

}
