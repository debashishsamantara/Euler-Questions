public class P10
{
	public static boolean isPrime(int i)
	{
		for(int j=2; j<=Math.sqrt(i); j++)
		{
			if(i%j==0)
				return false;	
		}
		return true;
	} 
	public static void main(String args[])
	{
		long sum=0;
		boolean p;
		for(int i=1; i<2000000; i++)
		{
			p=isPrime(i);
			if(p)
				sum=sum+i;
		}
		System.out.println(sum);
	}
}
//hello
