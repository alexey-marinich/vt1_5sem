package Task6;

public class SixthTask {
    public static void sixthTask(double[] array) {
        double[][] matrix = new double[array.length][array.length];
        int pos = 0, srcPos = 0, destPos = 0, numOfElems = array.length;

        for (int i = 0; i < matrix.length; i++){
            pos = srcPos;
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = array[pos];
                pos++;
                if (pos >= array.length)
                    pos = 0;
                System.out.printf(" %.2f", matrix[i][j]);
            }
            srcPos++;
            System.out.println();
        }
    }
}
