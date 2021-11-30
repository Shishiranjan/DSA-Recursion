package StringRecursion;

public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipStr("Rahulisagoodboy"));
    }

        //As we already see how to skip any specific character from an entire string. But what if i told you to skip an
        //entire string. In that case what we have to do is that we just tell the function that go on checking the string
        //from first character and whenever you find that the string starts from suppose "good" then in that case
        //you have to skip that entire string and then move ahead and do the remaining part. To find out if in any string
        //this string includes or not we use Starts with method of stringBuilder to check if the string starts from this
        //string or not.

        //If yes then just skip that entire string and then take the remaining substring from the next required index.
        //If no then just take the first character and do the remaining task from the 1st index of the string.



    static String skipStr(String WholeStr)
    {
         if(WholeStr.isEmpty())
         {
             return "";
         }

         if(WholeStr.startsWith("good"))
         {
             return skipStr(WholeStr.substring(4));
         }
         else
         {
             return WholeStr.charAt(0) + skipStr(WholeStr.substring(1));
         }
    }
}
