package Task5;

public class FifthTask {

    public static void fifthTask(int[] sequence){
        int min = sequence.length - getLargestNum(sequence);
        System.out.println("Минимальное количетсво элементов, которые можно выкинуть: " + min);
    }

    private static int getLargestNum(int[] sequence) {
        int array[] = new int[sequence.length];
        int secondArray[] = new int[sequence.length + 1];
        int maxLength = 0;

        for (int i = 0; i < sequence.length; i++) {

            int lower = 1;
            int higher = maxLength;

            while (lower <= higher) {
                int mid = (int) Math.ceil((lower + higher)/2);

                if (sequence[secondArray[mid]] < sequence[i]){
                    lower = mid + 1;
                } else {
                    higher = mid - 1;
                }
            }

            int newMaxLength = lower;

            array[i] = secondArray[newMaxLength - 1];
            secondArray[newMaxLength] = i;

            if (newMaxLength > maxLength){
                maxLength = newMaxLength;
            }
        }

        int[] longestSequence = new int[maxLength];
        int k = secondArray[maxLength];

        for (int i = maxLength - 1; i >= 0; i--) {
            longestSequence[i] = sequence[k];
            k = array[k];
        }

        return longestSequence.length;
    }
}
