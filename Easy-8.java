import java.util.Scanner;
class simpleinterest
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the principal amount:");
		int p=input.nextInt();
		System.out.print("Enter the no of years:");
		int n=input.nextInt();
		double interest=0.0;
		System.out.print("Is customer is senior citizen:");
		char age=input.next().charAt(0);
		if(age=='y')
		{
			interest=(p*n*12)/100;
			System.out.print("Simple interest:"+interest);
		}
		else
		{
			interest=(p*n*10)/100;
			System.out.print("Simple interest:"+interest);
		}
		
	}
}
	
			
		
		