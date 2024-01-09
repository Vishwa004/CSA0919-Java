import java.util.Scanner;
class count
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=input.nextLine();
		int n=s.length();
		char a[]=new char[n];
		int c=0,i;
		for(i=0;i<n;i++)
		{
			a[i]=s.charAt(i);
			if(a[i]>=0 && a[i]<=9 || a[i]>='a' && a[i]<='z')
			{

			}
			else
			{
				c++;
				System.out.print(a[i]);
			}
		}
		System.out.print("\n"+c);
	}
}