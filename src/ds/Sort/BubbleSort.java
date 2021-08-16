package ds.Sort;

public class BubbleSort {


    //Bubble Sort logic - Bubble up the maximum element to the right for each iteration
    //
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1 ; i++){
            boolean isSwapped = false;
            for(int j = 0 ; j < arr.length -1 - i ; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                return;
            }
        }
    }

    public static void printElements(int[] arr){
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String a[]) {
        int[] arr= {5,3,8,7,2,4,9};
        printElements(arr);

        System.out.println();
        bubbleSort(arr);
        printElements(arr);
    }
}
