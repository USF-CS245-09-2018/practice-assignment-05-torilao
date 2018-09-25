public class InsertionSort implements SortingAlgorithm{
    @Override
    public void sort(int[] a) {
        int j;
        int curr;

        for(int i = 1; i < a.length; i++){
            curr = a[i];
            for(j = i - 1; j >= 0 && a[j] > curr; j--){
                a[j + 1] = a[j];

            }
            a[j + 1] = curr;
        }
    }
}
