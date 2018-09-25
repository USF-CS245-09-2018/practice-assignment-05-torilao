public class MergeSort implements SortingAlgorithm {
    public void sort(int[] a){
        int[] temp = new int[a.length];
        mergeHelper(a, temp, 0, a.length-1);
    }

    public void merge(int[] arr, int[] temp, int low, int mid, int high){
        int insert = low;
        int lowindex = low;
        int highindex = mid + 1;

        while(insert <= high){
            if(lowindex > mid){
                temp[insert++] = arr[highindex++];
            } else if(highindex > high) {
                temp[insert++] = arr[lowindex];
            } else if(arr[lowindex] < arr[highindex]) {
                temp[insert++] = arr[lowindex++];
            } else {
                temp[insert++] = arr[highindex];
            }
        }
        for(insert = low; insert <= high; insert++){
            arr[insert] = temp[insert];
        }
    }

    public void mergeHelper(int[] arr, int[] temp, int low, int high) {
        int mid = (low + high)/2;

        if(low >= high){
            return;
        }

        mergeHelper(arr, temp, low, mid);
        mergeHelper(arr, temp, mid+1, high);

        merge(arr, temp, low, mid, high);
    }
}
