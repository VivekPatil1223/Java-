import java.util.Scanner;
public class Marks{
    public static void main (String[] args)
    {
        int marks[]=new int[5];
        int i;
        float sum=0,avg;
        Scanner reader = new Scanner(System.in);
        for(i=0;i<5;i++)
        {
        System.out.println("Enter marks of the subject"+(i+1)+":-");
        marks[i]=reader.nextInt();
        sum=sum+marks[i];
        }
        avg=sum/5;
        System.out.println("Total marks got:-"+avg);
        if(avg>=40)
        {
        System.out.println("pass!");
        }
        else
        System.out.println("Fail!");
    }
}