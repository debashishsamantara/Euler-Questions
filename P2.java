public class P2
{
	public static void main(String args[])
	{
		 int a=0,b=1,c=0,sum=0;
 		 for(b=0;b<=4000000;b++)
 		{
 			c=a+b;
     		a=b;
     		b=c;
     		if(c%2==0)
     			sum=sum+c;
    	}
    	System.out.println("Sum of even valued terms in the fibonacci sequence="+sum);
	}
}