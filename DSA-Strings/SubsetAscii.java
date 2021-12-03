package StringRecursion;

public class SubsetAscii {
    public static void main(String[] args) {
        subsequence("", "abc");


    }

    //Here you have to print the subset of a string along with its ASCII value.
    static void subsequence(String p, String unp)
    {
        //Base Condition:
        if(unp.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = unp.charAt(0);

        subsequence(p + ch, unp.substring(1));
        subsequence(p, unp.substring(1));
        subsequence(p + (ch + 0), unp.substring(1));
    }
}

