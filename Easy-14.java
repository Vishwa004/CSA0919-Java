import java.util.Scanner;
class matmul
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of rows:");
		int rows=input.nextInt();
		System.out.print("\nEnter number of columns:");
		int cols=input.nextInt();
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		int c[][]=new int[rows][cols];
		System.out.print("Enter the elements of matrix1:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				a[i][j]=input.nextInt();
			}
		}
		System.out.print("Enter the elements of matrix2:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				b[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				c[i][j]=0;
				for(int k=0;k<cols;k++)
				{

					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}				
			}
		}
		System.out.print("Addition of matrix:\n");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print((c[i][j])+"\t");
			}
			System.out.print("\n");
		}
	}
}

		