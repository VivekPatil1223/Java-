import java.util.Scanner;

public class Largest
{
    public static void main(final String[] args)
    {
    int num1,num2,num3;
    final Scanner in1 =new Scanner(System.in);
    System.out.println("Enter first number:");
    num1=in1.nextInt();
    
    System.out.println("Enter second number:");
    num2=in1.nextInt();
    
    System.out.println("Enter third number:");
    num3=in1.nextInt();
    if(num1>num2)
    {
        if(num1>num3)
        System.out.println("The largest number is :"+num1);
        else
        System.out.println("The largest number is :"+num3);
    }
    else
    {
        if(num2>num3)
        System.out.println("the Largest number is :"+num2);
        else
        System.out.println("The largest number is :"+num3);
    }
    }
    
}