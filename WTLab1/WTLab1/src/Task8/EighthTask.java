package Task8;

import java.util.Arrays;

public class EighthTask {
    public static void eighthTask(double[] a, double[] b) {
        int[] placesToInsert = new int[b.length];
        double[] mergedArray = mergeArrays(a, b);

        Arrays.sort(mergedArray);
        double stub = mergedArray[0] - 1;

        for (int i = 0; i < b.length; i++) {

            int j = 0;

            while (j < mergedArray.length) {
                if (b[i] == mergedArray[j]) {
                    mergedArray[j] = stub;
                    placesToInsert[i] = j;
                    j = mergedArray.length;
                }
                j++;
            }

        }

        for (int i = 0; i < b.length; i++){
            System.out.printf("Элемент %.2f нужно вставить на позицию: %d\n", b[i], placesToInsert[i]);
        }
    }

    private static double[] mergeArrays(double[] array1, double[] array2) {
        double[] result = new double[array1.length + array2.length];

        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }
}
