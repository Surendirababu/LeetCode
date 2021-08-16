package ds.Search;

public class LinearSearch {

    public static void main(String a[]) {
        int[] arr = {5,6,1,3,9,8};
        boolean found = linearSearch(arr,8);
        System.out.println("found - " + found);
    }

    private static boolean linearSearch(int[] arr, int x) {
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                found = true;
                return found;
            }
        }
        return found;
    }
}
