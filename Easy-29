import java.util.Scanner;
class frequency
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=input.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int visited=-1;
		System.out.print("Enter the elements of array:");
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=visited;
				}
			}
				if(b[i]!=visited)
					b[i]=count;
		}
		for(int i=0;i<n;i++)
		{
			if(b[i]!=visited)
			{
				System.out.print(a[i]+"-"+b[i]+"\n");
			}
		}
	}
}
