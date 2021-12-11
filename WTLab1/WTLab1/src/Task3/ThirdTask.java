package Task3;

public class ThirdTask {
    public static void thirdTask(double a, double b, double h){
        int length = (int) ((b - a)/h);
        length = (int) Math.floor(length);
        double functionTable[][] = new double[length][2];
        double tmpA = a;

        System.out.println("______________");
        for (int i = 0; i < length; i++){
            functionTable[i][0] = tmpA;
            functionTable[i][1] = Math.tan(tmpA);
            tmpA += h;
            System.out.printf("| %.2f | %.2f|\n" , functionTable[i][0], functionTable[i][1]);
            System.out.println("______________");
        }
    }
}
