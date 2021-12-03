package RecursionArr;

public class sortedarr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 7, 11, 13};
        System.out.println(CheckSor(arr, 1));

    }

    static boolean CheckSor(int[] arr, int index)
    {
        //Base condition: If you are at the last position in the array then just simply say that your array is
        //sorted by returning true.
        if(index == arr.length - 1)
        {
            return true;
        }

        //Otherwise just compare the 1st and 2nd index of the array and then make a recursive call where the
        //recursive call also do the same thing that is to compare the indexes that if index is less than
        //index + 1 or not

        return arr[index] < arr[index + 1] && CheckSor(arr, index + 1 );
    }
}
