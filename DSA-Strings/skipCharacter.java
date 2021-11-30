package StringRecursion;

public class skipCharacter {
    public static void main(String[] args) {

        System.out.println(skipCha("baccdah"));
    }

    static void skipCh(String processed, String unprocessed)
    {
        //Base case:
        //If the unprocessed part of your string is empty, then it simply means that the processed part is your ans.

        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

        // At first you have to take the first letter of the string i.e. which is present at the 0th index of the String.

        char ch = unprocessed.charAt(0);

        if(ch == 'a')
        {
            skipCh(processed, unprocessed.substring(1));
        }

        else
        {
            skipCh(processed + ch, unprocessed.substring(1));
        }

    }

    //What if i have to return string directly in the function:

    static String skipCha(String complete)
    {
        //You can also write this as complete.isEmpty() both are the same thing.
        if(complete.length() == 0)
        {
            return " ";
        }

        char ch2 = complete.charAt(0);

        if(ch2 == 'a')
        {
            return skipCha(complete.substring(1));
        }

        else
        {
            return ch2 + skipCha(complete.substring(1));
        }
    }
}
