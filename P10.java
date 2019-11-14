public class P10
{
	public static long isPrime(long m)
	{
		for(long i=2; i<Math.sqrt(m); i++)
		{
			if(m%i==0)
				return (-1);
		}
		return 1; 
	}
	public static void main(String args[])
	{
		long p;
		long sum=0;
		for(int i=2; i<2000000; i++)
		{
			p=isPrime(i);
			if(p==1)
				sum=sum+i;
		}
		System.out.println(sum);
	}
}
