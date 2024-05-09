public class BmiService {
    public int calculate(double weight, double height) {
        double result;
        result = weight / Math.pow (height, 2);
        return (int) result;
    }
}
