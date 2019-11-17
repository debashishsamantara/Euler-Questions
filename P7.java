public class P7
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
		int i=1, c=0;
		boolean h;
		while(i>0)
		{
			h=isPrime(i);
			if(h)
				c++;
			i++;
			if(c==10002)
				break;
		}
		System.out.println(i-1);
	}
}
