import java.math.BigInteger;
public class P16
{
	public static void main(String args[])
	{
		BigInteger mul= new BigInteger("1"); 
		BigInteger a= new BigInteger("2");
		BigInteger c= new BigInteger("1000");
		while(c.compareTo(new BigInteger("1"))>=0)
		{
			mul=mul.multiply(a);
			c=c.subtract(BigInteger.ONE);
		}
		String s=mul.toString();
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			sum=sum+(s.charAt(i)-48);
		}
		System.out.println(sum);
	}
}
