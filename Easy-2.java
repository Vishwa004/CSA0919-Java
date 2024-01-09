import java.util.Scanner;
class equal
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the username:");
		String s1=input.nextLine();
		System.out.print("Reenter the username:");
		String s2=input.nextLine();
		if(s1.equals(s2))
			System.out.print("User name is valid"); 
		else
			System.out.print("User name is invalid"); 
	}
} 
		