package sorters;

import java.util.Comparator;

public class QuickSortSorterImple <T> implements Sorter<T> {

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quickSort(arr,0,arr.length - 1, c);
    }

    private int partition(T arr[], int begin, int end, Comparator<T> c) {
        T pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            //if (arr[j] <= pivot) {
            if(c.compare(arr[j], pivot) < 1) {
                i++;
                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        T swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    public void quickSort(T arr[], int begin, int end, Comparator<T> c) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end, c);

            quickSort(arr, begin, partitionIndex-1,c);
            quickSort(arr, partitionIndex+1, end,c);
        }
    }
}
