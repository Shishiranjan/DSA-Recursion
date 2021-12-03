package RecursionArr;

import java.util.ArrayList;

public class FindAll2nd {
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, 67, 11, 11, 22, 33, 44, 55};
        ArrayList<Integer> ans = FindAllSecond(arr, 11, 0, new ArrayList<>());
        System.out.println(ans);

    }

    //Previously we see that we implement this linear search using array list but in that case we are just returning
    //index of the array or just te boolean value. But What if we have to return the array list directly.
    //So if we have to return the array list directly then firstly of course we have to add the array list as the parameter
    //inside the function and then finally return that list.

    static ArrayList<Integer> FindAllSecond(int[] arr, int target, int index, ArrayList<Integer> list) {
        //Base condition:
        //If we reached the end of the array then just simply return the list.

        if (index == arr.length) {
            return list;
        }

        //If you are at the current index of the array and this is also the target element then just add the index of
        //that target element in the list.
        if (arr[index] == target) {
            list.add(index);
        }

        //Otherwise call the function with remaining part of the array.

            return FindAllSecond(arr, target, index + 1, list);


    }
}
