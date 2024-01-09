import java.util.Scanner;
class vote
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the age:");
		int n=18-age;
		int age=input.nextInt();
		if(age>=18)
			System.out.print("Eligible to vote");
		else if(age<=0)
			System.out.print("Invalid age");
		else
			System.out.print("You have to wait "+(n));
	}
}
		