import java.util.Scanner;
class gcd
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number1:");
		int n1=input.nextInt();
		System.out.print("Enter the number2:");
		int n2=input.nextInt();
		int lcm=n1*n2;
		int g;
		do
		{
			if(n1>n2)
				n1=n1-n2;
			else
				n2=n2-n1;
			
		}
		while(n1!=n2);
			g=n1;
			System.out.print("Gcd of two numbers:"+g);
		lcm=lcm/g;
		System.out.print("\nLcm of two numbers:"+lcm);
	}
	
}
