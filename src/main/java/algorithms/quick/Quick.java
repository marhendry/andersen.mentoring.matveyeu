package algorithms.quick;

public class Quick {
    public static void sort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int baseElement = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < baseElement) {
                i++;
            }
            while (array[j] > baseElement) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            sort(array, low, j);

        if (high > i)
            sort(array, i, high);
    }
}
