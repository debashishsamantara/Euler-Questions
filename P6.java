public class P6
{
	public static void main(String args[])
	{
		int diff, sqsum, sumsq, n=100;
		int s=(n*(n+1))/2;
		sqsum=s*s;
		sumsq=(n*(n+1)*((2*n)+1))/6;
		System.out.println("Difference between the sum of the squares of the first one hundred natural nos. and the square of the sum="+(sqsum-sumsq));

	}
}
