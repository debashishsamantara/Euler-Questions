public class P14
{
	public static long countChain(long n)
	{
		long c=0;
		while(n!=1)
		{
			if(n%2==0)
				n=(n/2);
			else
				n=((3*n)+1);
			c++;
		}
		return c;
	}
	public static void main(String args[])
	{
		long b,v=0,ans,k=0;
		for(long i=1; i<=1000000; i++)
		{
			b=countChain(i);
			if(b>v)
			{	
				v=b;
				k=i;
			}	
		}
		System.out.print(k);
	}
}
