public class MethodOver
{
    double result;
    double area(int num1)
    {
        result =3.14*num1*num1;
        return result;
        
    }
    double area(int num1,int num2)
    {
        result = num1*num2;
        return result;
    }
    double area(int num1,int num2,int num3)
    {
        result =num1 *num2*num3;
        return result;
    }
    public static void main(String[] args)
    {
        MethodOver m1 =new MethodOver();
        double num1,num2,num3;
        num1=m1.area(5);
        System.out.println("Area of circle is : "+num1);
        num2=m1.area(5,6);
        System.out.println("Area of rectangle is : "+num2);
        num3=m1.area(5,6,7);
        System.out.println("Volume of cuboid is:  "+num3);
    }
}