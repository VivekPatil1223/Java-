public class Dowhile{
    public static void main(String args [])
    {
        int total=0,sum=0,x=2,n=10;
        
        do
        {
            total++;
            sum=sum+x;
            x=x+2;
            
        }
        while(total!=n);
        System.out.println("sum pf first 10even number :"+sum);
    }
}