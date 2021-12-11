package Task4;

import java.util.ArrayList;
import java.util.List;

public class FourthTask {
    public static void fourthTask(int[] array){
        List<Integer> indexes = new ArrayList<Integer>();
        boolean isPrime = true;

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                indexes.add(i + 1);
            }
        }

        System.out.print("Номера простых чисел: ");
        for(Integer index : indexes) {
            System.out.print(index + " ");
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2)
            return false;

        for (int i = 2; i <= Math.floor(Math.sqrt(number)); i++) {
            int tmp = number % i;
            if (tmp == 0) {
                return false;
            }
        }
        return true;
    }
}
