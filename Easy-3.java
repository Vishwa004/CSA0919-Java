import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number to be reversed:");
		int num=input.nextInt();
		int d;
		int r=0;
		while(num!=0)
		{
			d=num%10;
			r=r*10+d;
			num=num/10;
		}
		System.out.print(r);
	}
}