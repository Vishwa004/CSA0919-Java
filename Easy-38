import java.util.Scanner;
class sort
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s=input.nextLine();
		int n=s.length();
		char a[]=new char[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.charAt(i);
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Character.compare(a[i],a[j])>0)
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
		
	
