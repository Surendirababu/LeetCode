package ds.Sort;

public class SelectionSort {

    public static void printElements(int[] arr){
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Divide the arr int  unsorted and sorted and find the min element in the unsorted arr and move it to the sorted arr
    public static void selectionSort(int[] arr){

        for(int i=0; i< arr.length -1;i++){
            int min = i;
            for(int j=i+1; j< arr.length -1 ; j++) {
                if(arr[j] < arr[i]) {
                    min = j;
                }
            }
            // swap element at i and min
            int temp =  arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String a[]) {
        int[] arr = {4,2,8,6,1,9};
        printElements(arr);
        System.out.println();
        selectionSort(arr);
        printElements(arr);
    }
}
