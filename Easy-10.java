import java.util.Scanner;
class skip
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the starting number:");
		int p=input.nextInt();
		System.out.print("Enter the ending number:");
		int q=input.nextInt();
		System.out.print("Enter the skipping value:");
		int r=input.nextInt();
		int c=0;
		if(p<q)
		{
			for(int i=p;i<=q;i++)
			{
				if(r!=c)
				{
					System.out.print(i+"\n");
					c++;
				}
				else
				{
					c++;
					continue;
				}
			}
		}
	}
}
		