public class P4
{
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		return rev;
	}
	public static boolean isPalindrome(int n)
	{
		int v= reverse(n);
		if (v==n)
			return true;
		return false;
	}
	public static void main(String args[])
	{
		boolean u;
		int m,palin=0;
		for(int i=100; i<1000; i++)
		{
			for(int j=100; j<1000; j++)
			{
				m=i*j;
				u=isPalindrome(m);
				if(u && m>palin)
					palin=m;
			}
		}
		System.out.println("The largest palindrome is="+palin);
	}
}
