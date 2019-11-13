public class P21
{
    public static void main(String args[])
    {
        int i,j,k,t1=0,t2=0,s1=0,s2=0,s3=0;
        for(i=1;i<10000;i++)
        {
            t1=i;
            for(j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    s1=s1+j;
                }
            }
            t2=s1;
            for(k=1;k<s1;k++)
            {
                if(s1%k==0)
                {
                    s2=s2+k;
                }
            }
            if((s2==t1)&&(s1!=s2))
            {
                System.out.println(+t1+" "+t2);
                s3=s3+t1;
            }
            s1=0;s2=0;t2=0;t1=0;
        }
        System.out.println("Sum="+s3);
    }
}
