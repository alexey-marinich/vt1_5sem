package Task2;

public class SecondTask {
    public static void secondTask(double x, double y){
        boolean result = checkTop(x,y) || checkBottom(x,y);
        System.out.println(result);
    }

    private static boolean checkTop(double x, double y){
        boolean topResult = (x >= -4 && x <= 4) && (y >= 0 && y <= 5) ? true : false;
        return topResult;
    }

    private static boolean checkBottom(double x, double y){
        boolean bottomResult = (x >= -6 && x <= 6) && (y >= -3 && y <= 0) ? true : false;
        return bottomResult;
    }
}
