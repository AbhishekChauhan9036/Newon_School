/*
// Information about the arguments given in function
arr[]: input array
start: starting index of array
end: ending index of array
*/
public static int[] quickSort(int arr[], int low, int high)
{
      if(low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
      }
      return arr;
}

static int partition(int arr[], int low, int high) {
      int pivot = arr[high];
      int i = low - 1;

      for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                  i++;
                  swap(arr, i, j);
            }
      }
      swap(arr, i + 1, high);
      return (i + 1);
}



static void swap(int arr[], int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
}