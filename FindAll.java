package RecursionArr;

import java.util.ArrayList;

public class FindAll {
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, 67, 11, 11, 22, 33, 44, 55};
        FindAllIndex(arr, 11, 0);
        System.out.println(list);

    }

    //Here what we are going to do is that we are going to create an array list so that whenever the target element
    //is found then we are going to add that target element in the arraylist.

    //Creating an array list.
    //This implementation of array list is helpful when we have to search for the target element that have the multiple occurences.

    static ArrayList<Integer> list = new ArrayList<>();

    static void FindAllIndex(int[] arr, int target, int index )
    {
        //Base condition
        //If index goes out of bound then just simply return -1;
        if(index ==  arr.length)
        {
            return;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        else
        {
            FindAllIndex(arr, target, index + 1);
        }
    }
}
