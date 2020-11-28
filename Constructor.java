public class  Constructor 
{
    int num1;
    int num2;
    Constructor()
    {
        num1=40;
        num2=50;
    }
    Constructor(int a)
    {
        num1 = a;
    }
    Constructor(int a,int b )
    {
    num1 =a;
    num2 =b;
    
    }
    public void display()
    { 
    System.out.println("Value1="+num1);
    System.out.println("Value="+num2);
    
    }
     public static void main(String args[])
    {
    Constructor d1 = new Constructor();
    Constructor d2 = new Constructor(70);
    Constructor d3 = new Constructor(70,80);
    System.out.println("Inside default Constructor ");
    d1.display();
    System.out.println("Inside paramaterized Constructor1");
    d2.display();
    System.out.println("Inside paramaterised Constructor2");
    d3.display();
    }
}