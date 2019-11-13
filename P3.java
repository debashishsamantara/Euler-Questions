 public class P3
 {
 	public static void main(String args[])
 	{
 		double i,n= 600851475143.0;
 		for(i=3.0;i<n/2.0;i=i+2.0)
    	{
    		while(n%i==0)
          	{
          		n=n/i;
            }
        }
 		System.out.println("The largest prime factor of the no. 600851475143 is="+(int)n);
 	}
 }
