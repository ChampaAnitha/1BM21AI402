//Write a program to delete all consonents from the string "Hello, have a good day".

public class ConsonantDeleter 
{
   public static void main(String[] args) 
   {
      String string = "Hello, have a good day";
      String vowels = "aeiouAEIOU";
      String result = "";
      for (int i = 0; i < string.length(); i++) 
      {
      char c = string.charAt(i);
      if (vowels.indexOf(c) >= 0) 
      {
         result += c;
      }
      }
      System.out.println(result);
   }
}
