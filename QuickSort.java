public class QuickSort implements SortingAlgorithm{
    public void sort(int[] a){
        quickSort(a, 0, a.length - 1);
    }

    public int partition(int[] arr, int low, int high){
        int pivot;
        int tmp;
        int max = high;
        int mid = (low + high) / 2;

        tmp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = tmp;
        pivot = arr[high];
        low--;
        do {
            while ((low < high) && (arr[++low] < pivot));
            while ((low < high) && (arr[--high] > pivot));
            tmp = arr[low];
            arr[low] = arr[high];
            arr[high] = tmp;
        } while (low < high);
        tmp = arr[low];
        arr[low] = arr[max];
        arr[max] = tmp;
        return low;
    }

    public void quickSort(int arr[], int low, int high) {
        int pivot; // index of the pivot
        if (low < high) {
            pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);

        }
    }
}
