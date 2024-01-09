import java.util.Scanner;
class mmm
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int n=input.nextInt();
		int a[]=new int[n];
		int sum=0;
//Mean:
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		float mean=sum/n;
		System.out.print("Mean:"+mean);

//Median:
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int mid;
		if(n%2==0)
		{
			mid=n/2;
		
		}
		else
		{
			mid=(n+1)/2;
		}
		System.out.print("\nMedian:"+a[mid-1]);
//Mode:
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print("\nMode:"+a[i]);
				}
			}
		}
	}
}
		
		