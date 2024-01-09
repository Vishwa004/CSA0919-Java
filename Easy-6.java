import java.util.Scanner;
class star
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int n=input.nextInt();
		int i,j,k;
		for(i=0;i<n;i++)
		{
			for(j=0;j<2*(n-i);j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}