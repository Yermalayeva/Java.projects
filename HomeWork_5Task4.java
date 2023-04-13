public class HomeWork_5Task4 {
    /*
    Реализовать алгоритм пирамидальной сортировки (HeapSort)
    */
    public static void main(String[] args) {
    int[] arr = {1000, 5, 7, 3, 2, 500, 13, 19};
    heapSort(arr);
    System.out.println("Сортировка");
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i] + " ");
    }
    }
    private static void heapSort(int[]arr){
        int n = arr.length;
        for(int i = n /2 -1; i >= 0; i--)
        heapyfy(arr, i, n);

        for(int i = n - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapyfy(arr, 0, i);
        }
    }
    private static void heapyfy(int[]arr, int i, int n){
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;

        if(l < n && arr[l] > arr[largest])
            largest = l;
        if(r < n && arr[r] > arr[largest])
            largest = r;   
        if(i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapyfy(arr, largest, n);
        }
    }
}
