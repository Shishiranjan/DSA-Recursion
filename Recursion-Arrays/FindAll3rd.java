package RecursionArr;

import java.util.ArrayList;

public class FindAll3rd {
    public static void main(String[] args) {
        int[] arr = {12, 23, 45, 67, 11, 11, 22, 33, 44, 55};
        System.out.println(FindAllIndex3rd(arr, 11, 0));

    }

    //Previously we already see the first method of returning the array list. Here the second method is that we are not
    //allowed to include the array list as the parameter inside the function. Instead we have to create an array list
    //inside the body of the function not as the parameter inside the function.

    //By doing it like this ine major problem occurs which is that if we create an array list inside the body of the function
    //then with every check of the condition a new array list is created  and at last according  to the rule of function call
    //the ans which we get from the below function call  goes to the above function call but by doing so an empty list is returned at last because at every
    //step a new array list is created.

    //SO to overcome this we are going to include the answer from below function call and then add it to the above function
    //  call so that at last the required answer is returned from the main function call.

    static ArrayList<Integer> FindAllIndex3rd(int[] arr, int target, int index)
    {
        //Creating an array list in the body of the function.
        ArrayList<Integer> list = new ArrayList<>();

        //Base condition:
        if(index == arr.length)
        {
            return list;
        }

        //This will contain the answer for this function call only.

        if(arr[index] == target)
        {
            list.add(index);
        }

        ArrayList<Integer> ansfromBelowCalls = FindAllIndex3rd(arr, target, index + 1);
        list.addAll(ansfromBelowCalls);

        return list;

    }
}
