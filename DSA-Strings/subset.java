package StringRecursion;

public class subset {
    public static void main(String[] args) {
        subsequence("", "abc");

    }

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
    }
}
