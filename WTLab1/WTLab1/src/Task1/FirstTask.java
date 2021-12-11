package Task1;

public class FirstTask {
    public static void firstTask(double x, double y){
        double numerator = Math.sin(x + y);
        numerator = Math.pow(numerator, 2);
        numerator += 1;

        double denominator = 2 * x;
        denominator /= 1 + Math.pow(x,2)*Math.pow(y,2);
        denominator = Math.abs(x - denominator);
        denominator += 2;

        double result = numerator/denominator + x;
        System.out.printf("Значение уравнения при x = %.3f и при y = %.3f равно %.3f", x, y, result);
    }
}
