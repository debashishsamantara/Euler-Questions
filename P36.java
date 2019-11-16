public class P36
{
	public static long deciToBin(long m)
	{
		long d;
		char rem;
		String str="";
		while(m!=0)
		{
			d=m%2;
			str=d+str;
			m=m/2;
		}
		long binres=Long.parseLong(str);
		return binres;
	}
	public static long reverse(long n)
	{
		long rev=0;
		while(n>0)
		{
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		return rev;
	}
	public static boolean isPalindrome(long n)
	{
		long v= reverse(n);
		if (v==n)
		{
			long k= deciToBin(n);
			long c= reverse(k);
			if(k==c)
			{
				return true;
			}	
		}
		return false;
	}
	public static void main(String args[])
	{
		long sum=0;
		boolean y;
		for(long i=1; i<=Math.pow(10,6); i++)
		{
			if(isPalindrome(i))
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
