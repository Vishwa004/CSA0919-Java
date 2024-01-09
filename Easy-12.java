import java.util.Scanner;
class rectangle
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter no of rows:");
		int rows=input.nextInt();
		System.out.print("Enter no of columns:");
		int col=input.nextInt();
		System.out.print("\nEnter the symbol to be used:");
		char symbol=input.next().charAt(0);
		int i,j;
		for(i=0;i<rows;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(symbol+" ");
			}
			System.out.println();
		}
	}
}