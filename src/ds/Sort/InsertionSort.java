package ds.Sort;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i = 1; i< arr.length; i++){ // Loop through the unsorted array, make the first element as sorted
            int temp = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > temp ){ //take first element from unsorted array and compare it with sorted array and move one position at each step un till it fill the hole
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j + 1] = temp;
        }
    }

    public static void printElements(int[] arr){
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String a[]) {
        int arr[] = {8,3,4,1,9,2,5};
        printElements(arr);
        System.out.println();
        insertionSort(arr);
        printElements(arr);
    }
}
