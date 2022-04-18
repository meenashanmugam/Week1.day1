package week1.day1;

public class PrimeNumber {
	public static void main(String arg[])
	{
		int value=13;
		int n;
		boolean flag=false;
		n=value/2;
		
		for(int i=1; i<=n; i++)
		{
			if(value%2==0)
			{
			System.out.println("number 13 is prime number");
			flag=true;
			break;
		}
		}
		if(flag==false)
			{
				System.out.println("number 13 is not prime number");
			}
	}

}

