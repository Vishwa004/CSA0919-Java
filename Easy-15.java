import java.util.Scanner;
class pattern
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to be printed:");
		int x=input.nextInt();
		System.out.print("Enter the number of times:");
		int n=input.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(x);
			}	
			System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(x);
			}
			System.out.println();
		}
	}
}