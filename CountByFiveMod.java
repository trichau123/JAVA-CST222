import java.util.Scanner;

public class CountByAnything
{
   // Modify the code below
   public static void main (String args[])
   {    

       Scanner myObj = new Scanner(System.in);
       int start = myObj.nextInt();
      final int STOP = 500;
      final int NUMBER_PER_LINE = 50;
      for(int i = start; i <= STOP; i += start)
      {
         System.out.println(i + "  \t");
      }
   }
}

