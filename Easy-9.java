import java.util.Scanner;
class fib
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of terms:");
		int num=input.nextInt();
		int n1=0,n2=1,n3,sum=0;
		for(int i=2;i<num;i++)
		{
			n3=n1+n2;
			if(n3%2==0)
			{
				sum=sum+n3;
			}
			n1=n2;
			n2=n3;
		}
		System.out.print(sum);
	}
}