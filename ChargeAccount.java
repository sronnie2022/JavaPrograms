/**
Create a class with a method that accepts a charge account number as its argument. The method should determine whether the number is valid by comparing it to the following list of valid charge numbers:

5656645
4520125
7895122
8777541
8451277
1302850
8080152
4562555
5552012
5050552
7825877
1250255
1005231
6545231
3852085
7576651
7881200
4581002

These numbers should be stored in an array object. Use a sequential search to locate the number passed as an argument. If the number is in the array, the method should return true, indicating the number is valid. If the number is not in the array, the method should return false, indicating the number is invalid.

Write a program that tests the class by asking the user to enter a charge account number. The program should display a message indicating whether the number is valid or invalid.
*/


class ChargeAccount
{
	// Fields
	private int[] acctnum = {5656645, 4520125, 7895122, 8777541, 8451277 ,1302850,
	                         8080152, 4562555, 5552012, 5050552, 7825877 ,1250255,
	                         1005231, 6545231, 3852085, 7576651, 7881200 ,4581002};






   /**
    Boolean method  checks if the number is valid
    @param int number

   */


   //----------------------------------------------------
   // Misc Method
   //----------------------------------------------------

   public boolean isValid(int number)
   {
	   for(int i = 0; i < acctnum.length; i++)
	   {
		   if(number == acctnum[i])
		   {
			   return true;
		   }

	   }

	   return false;

   }



}