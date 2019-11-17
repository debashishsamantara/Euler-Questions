public class P5
{
	public static boolean remainder(int i, int j)
	{
		if(i%j!=0)
			return true;
		return false;
	}
	public static void main (String Args[])
	{
		int i=20;
		while(remainder(i,2) || remainder(i,3) || remainder(i,4) || remainder(i,5) ||
         		remainder(i,6) || remainder(i,7) || remainder(i,8) || remainder(i,9) ||
         		remainder(i,10) || remainder(i,11) || remainder(i,12) || remainder(i,13) ||
         		remainder(i,14) || remainder(i,15) || remainder(i,16) || remainder(i,17) ||
         		remainder(i,18) || remainder(i,19) || remainder(i,20))

				{
					i=i+1;
				}
		System.out.println(i);
	}
}
