package ds.Arrays;

public class ArrayClass {


    public static void main(String a[]){
        int[] intArr = new int[] {4,5,2,8,6,1};
        System.out.println("Before Reversing Array");
        printElements(intArr);

        int[] reversedArr = reverseArray(intArr, 0, intArr.length -3 );
        System.out.println("After Reversing Array" );
        printElements(reversedArr);

        System.out.println("Minimum Value of Array is : " + findMinValueInArr(intArr));

        System.out.println("Before Moving Zeros to the End of Array");
        int arr[] = new int[] {4,3,7,0,8,2,0,1};
        printElements(arr);

        int[] movedZerosToEndOfArr = moveZeroesToEndOfArray(arr);
        System.out.println("After Moving Zeros to the End of Array");
        printElements(movedZerosToEndOfArr);

        int[] movedZerosToStartOfArr = moveZeroesToStartOfArray(arr);
        System.out.println("After Moving Zeros to the Start of Array");
        printElements(movedZerosToStartOfArr);

        System.out.println("After Re-Sizing to new Capacity");
        int[] resizedArr = resizeArr(intArr, intArr.length * 3);
        printElements(resizedArr);

        String name="madam";
        boolean palindromeResult = checkPalindrome(name);
        System.out.println("Palindrome Result for the String " + name + " is : " + palindromeResult);
    }

    private static boolean checkPalindrome(String name) {
        if(name == null || name.length() == 0) {
            throw new IllegalArgumentException();
        }
        char[] nameArr = name.toCharArray();
        int startIndex = 0;
        int endIndex = nameArr.length -1;
        boolean res = true;
        while(startIndex < endIndex) {
            if(nameArr[startIndex] != nameArr[endIndex]) {
                res = false;
                break;
            }
            startIndex++;
            endIndex--;
        }
        return res;
    }

    private static int[] resizeArr(int[] intArr, int capacity) {
        int[] reSizedArr = new int[capacity];
        for(int i = 0 ; i < intArr.length;  i++) {
            reSizedArr[i] = intArr[i];
        }
        return reSizedArr;
    }

    //Logic id take two pointers i and j, i points to non-zero and j points to zero,
    //if j is un till non zero increment pointer
    //If j is zero an i is non-zero swap the positions
    private static int[] moveZeroesToEndOfArray(int[] intArr) {
        int j = 0;
        int temp;
        for(int i = 0; i < intArr.length; i++) {
            if(intArr[i] != 0 && intArr[j] == 0) {
                temp = intArr[i];
                intArr[i] = intArr[j];
                intArr[j] = temp;
            }
            if(intArr[j] != 0) {
                j++;
            }
        }
        return intArr;
    }

    //Logic is same as above but traverse from right to left
    private static int[] moveZeroesToStartOfArray(int[] intArr) {
        int j = intArr.length -1;
        int temp;
        for(int i = intArr.length -1; i >= 0 ; i--) {
            if(intArr[i] != 0 && intArr[j] == 0) {
                temp = intArr[i];
                intArr[i] = intArr[j];
                intArr[j] = temp;
            }
            if(intArr[j] != 0) {
                j--;
            }
        }


        return intArr;
    }

    private static int findMinValueInArr(int[] intArr) {
        if(intArr == null || intArr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int min = intArr[0];
        for(int i = 1; i < intArr.length; i++ ) {
            if(intArr[i] < min) {
                min = intArr[i];
            }
        }
        return min;
    }

    private static int[] reverseArray(int[] intArr, int startIndex, int endIndex) {
        int temp;
        while(startIndex < endIndex) {
            temp = intArr[startIndex];
            intArr[startIndex] = intArr[endIndex];
            intArr[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return intArr;

    }

    //Print Elements
    private static void printElements(int[] intArr) {
        int len = intArr.length;
        for(int i = 0; i < len; i++) {
            System.out.print(intArr[i] + " " );
        }
        System.out.println();
    }

}
