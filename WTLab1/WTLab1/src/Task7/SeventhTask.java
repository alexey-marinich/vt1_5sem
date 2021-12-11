package Task7;

public class SeventhTask {
    public static void seventhTask(double[] array) {
        double temp = 0;
        int i = 0;

        while (i < array.length - 1) {

            if (array[i] <= array[i + 1]) {
                i++;
            } else {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                if (i != 0)
                    i--;
            }
        }

        for(int k = 0; k < array.length; k++)
            System.out.printf("%.2f " , array[k]);
    }
}
