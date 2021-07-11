import java.util.Scanner;

class Numberprob {
	int sum=0;
	int SumofFactors(int n)
	{
		for(int i=1;i<n;i++)
		{
		if(n%i==0)
		{
			sum=sum+i;
		}
		}
		return sum;
	}
	Boolean Isperfect(int n)
	{
		if  (sum==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter no.:");
		int n=obj.nextInt();
		
		
		Numberprob obj1=new Numberprob();
		obj1.SumofFactors(n);
		obj1.Isperfect(n);
		System.out.print(obj1.Isperfect(n));
		
		
	}
}