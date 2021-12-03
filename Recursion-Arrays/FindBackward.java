package RecursionArr;

public class FindBackward {
    public static void main(String[] args) {
        int[] arr = {23, 41, 89, 21, 25, 46, 97};
        System.out.println(Findlast(arr, 46, arr.length-1));

    }

    //If we are going to search for the target element from the back side of the array.
    //In that scenario in which case the target element is not found. In that if we reach the to the index -1 of the array then
    //in that case we would not find te target element.

    static int Findlast(int[] arr, int target, int index)
    {
        //Base condition
        if(index == -1)
        {
            return -1;
        }

        if(arr[index] == target)
        {
            return index;
        }
        else
        {
            return Findlast(arr, target, index -1);
        }
    }
}
