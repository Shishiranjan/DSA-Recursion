package StringRecursion;

public class PermutationCount {
    public static void main(String[] args) {
        System.out.println(CountPermutation("", "abcde"));

    }
    //What if we have to count the no of permutations of any specified string.

    static int CountPermutation(String Processed, String unprocessed)
    {
        //Base condition:
        if(unprocessed.isEmpty())
        {
            return 1;
        }

        //Here we are taking the count inside the body of the function.
        //Initially the count must be zero.
        int count  = 0;
        char ch = unprocessed.charAt(0);
        for(int i = 0; i <= Processed.length(); i++)
        {
            String first = Processed.substring(0, i);
            String last = Processed.substring(i, Processed.length());
            count = count + CountPermutation(first + ch + last, unprocessed.substring(1));
        }
        return count;
    }
}
