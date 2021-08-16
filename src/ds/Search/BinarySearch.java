package ds.Search;

public class BinarySearch {

    public static boolean binarySearch(int arr[],int x){
        int low = 0;
        int high = arr.length - 1;
        while(low < high) {
            int mid = (low + high)/2;
            if(x == arr[mid]) return true;
            if(x < arr[mid]) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static void main(String a[]){
        int[] arr = {1,10,20,30,40,50,60,70};
        boolean found =  binarySearch(arr,70);
        System.out.println("found :" + found);
    }
}
