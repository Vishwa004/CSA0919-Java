import java.util.Scanner;
class name
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int pr=input.nextInt();
		int year=input.nextInt();
		char age=input.next().charAt(0);
		double interest=0;
		if(age<=65)
		{
			interest=(pr*year*12)/100;
			System.out.print(interest);
		}
		else
		{
			interest=(pr*year*10)/100;
			System.out.print(interest);
		}
	}	
}