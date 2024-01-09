import java.util.Scanner;
class composite
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the starting value:"); 
		int a=input.nextInt();
		System.out.print("Enter the ending value:");
		int b=input.nextInt();
		for(int i=a+1;i<=b;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c>2)
			{
				System.out.print(i+" ");
			}
		}
	}
}
		
		
		