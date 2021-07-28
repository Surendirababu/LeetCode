package RemoveAnElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveAnElement {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        RemoveElement rm = new RemoveElement();
        int nums[] = new int[4];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 2;
        nums[3] = 3;
        int val = 2;
        System.out.println("Size" + rm.removeElement(nums,val));
    }
}

class RemoveElement {

public int removeElement(int[] nums, int val) {
    List<Integer> listOfIntegers = new ArrayList<Integer>(nums.length);
    for (int i : nums)
    {
        listOfIntegers.add(i);
    }
    listOfIntegers.removeAll(Collections.singletonList(val));
    for (int j: listOfIntegers) {
        System.out.println(j);
    }
    return listOfIntegers.size();
    }
}
