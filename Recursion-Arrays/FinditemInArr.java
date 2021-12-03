package RecursionArr;

public class FinditemInArr {
    public static void main(String[] args) {
        int[] arr = {12, 34, 21, 62, 52, 22, 46, 79};
        System.out.println(Item(arr, 46, 0));

    }

    //If we have to return the index of the target element which we are looking for.
    static int Item(int []arr, int target, int index)
    {
        if(index == arr.length)
        {
            return -1;
        }

        if(arr[index] == target)
        {
            return index;
        }
        else
        {
            return Item(arr, target, index + 1);
        }
    }
}
