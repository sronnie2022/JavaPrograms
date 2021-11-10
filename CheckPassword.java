import java.util.Scanner;
public class CheckPassword
{
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter password:");
		String pass;

		pass = in.nextLine();

		System.out.println((ValidPassword(pass) ? " Valid " : "Invalid ") + "Password");


	}
	public static boolean ValidPassword(String p)
	{
		final int lvp = 8;
		final int mnd = 2;

		boolean vp = LengthValid(p,lvp) && LetterDigit(p) && Digits(p,mnd);


		return vp;
	}
	public static boolean LengthValid(String p , int v)
	{
		return p.length() >= v;
	}
	public static boolean LetterDigit(String p)
	{
		for(int i = 0; i < p.length(); i++)
		{
		  if( ! Character.isLetterOrDigit(p.charAt(i)))
		  {
			  return false;
		  }
		}

		return true;
	}
	public static boolean Digits(String p, int v)
	{
		int n = 0;

		for(int i = 0; i < p.length(); i++)
		{
			if(Character.isDigit(p.charAt(i)))
			{
				n++;
			}
			if(n >= v)
			{
				return true;
			}
		}

		return false;
	}


}