public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 85;   // Задаем значение веса (кг)
        int height = 182;  // Задаем значение роста в см (чаще люди помнят рост в сантиметрах)
        if ((height <= 0) | (weight <= 0)) {
            System.out.println("Расчет невозможен при нулевом или отрицательном значении веса или роста");
        } else {
            double bmi = Math.floor(service.calculate(weight, height));
            System.out.println();
            System.out.println("Индекс массы тела: " + bmi);
        }
    }
}
