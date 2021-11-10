import java.util.Scanner;
public class ChargeDemo
{
  public static void main(String[] args)
  {
       Scanner key = new Scanner(System.in);

       int num;


       System.out.print(" Enter the account number:");
       num = key.nextInt();


       ChargeAccount at = new ChargeAccount();
       //-----------------------------------------------------------------

       // Checks if the number is valid for the account number
       if(at.isValid(num) == true)
       {
		   System.out.println("Valid account number:");
	   }

	   else
	      System.out.println("INVALID:");

  }// end main method
  //-----------------------------------------------------------------------


}// end ChargeDemo class