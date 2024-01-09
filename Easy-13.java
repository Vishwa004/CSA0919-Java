import java.util.Scanner;
class ascending
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of names:");
		int n=input.nextInt();
		String str[]=new String[n];
		System.out.print("Enter the names:");
		for(int i=0;i<n;i++)
		{
			str[i]=input.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;				
				}
			}
		}
		System.out.print("The sorted order of names:");
		for(int i=0;i<n;i++)
		{
			System.out.print(str[i]+"\n");
		}
	}
}