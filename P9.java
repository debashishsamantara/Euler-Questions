public class P9
{
	public static void main(String args[])
	{
		int a,b,c;
		 for(a=1; a<1000; a++)
		 {
		 	for(b=1; b<1000; b++)
		 	{
		 		c=1000-a-b;
		 		if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2))
		 		{
		 			System.out.println("The triplets are:"+a+" "+b+" "+c);
		 			System.out.println(a*b*c);
		 		}	 
		 	}
		 }
	}
}
