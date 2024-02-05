import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int unSortedArray[] = { -15, 43, 73, 23, 45, 67 };
        int sortedArray[] = Sort.bubbleSort(unSortedArray);
        Arrays.stream(sortedArray).forEach(System.out::println);

    }

    private static int[] bubbleSort(int[] input) {
        for(int j = input.length-1;j>0;j--){
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    swap(i, i + 1, input);
                }
            }
        }
        return input;
    }

    private static void swap(int left, int right, int[] unSortedArray) {
        int temp = unSortedArray[left];
        unSortedArray[left] = unSortedArray[right];
        unSortedArray[right] = temp;
    }
}
