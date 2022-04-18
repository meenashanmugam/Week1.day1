package week1.day1;

public class FibonacciSeries {
	public static void main(String arg[])
	{  
		int i=0, firstterm=0, secondterm=1, sum;
		
		for(i=0; i<8; ++i) {
			
			System.out.print(firstterm+" ");
			sum=firstterm+secondterm;
	firstterm=secondterm;
			secondterm=sum;
			
		}
			 
	}
}
