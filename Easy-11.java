import java.util.Scanner;
class addmat
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int c[][]=new int[5][5];
		System.out.print("Enter the elements of matrix1:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=input.nextInt();
			}
		}
		System.out.print("Enter the elements of matrix2:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				b[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.print("Addition of matrix:\n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print((c[i][j])+"\t");
			}
			System.out.print("\n");
		}
	}
}
