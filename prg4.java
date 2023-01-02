//Write a Java program that reverses all the words in a string that have odd lengths.

import java.util.StringTokenizer;

public class OddLengthWordReverser 
{
   public static void main(String[] args) 
   {
      String string = "hey wassup";
      StringBuilder result = new StringBuilder();
      StringTokenizer tokenizer = new StringTokenizer(string);
      while (tokenizer.hasMoreTokens()) 
      {
         String word = tokenizer.nextToken();
         if (word.length() % 2 != 0) 
         {
            result.append(new StringBuilder(word).reverse().toString());
         } 
         else 
         {
            result.append(word);
         }
         result.append(" ");
   }
   System.out.println(result.toString().trim());
 }
}
