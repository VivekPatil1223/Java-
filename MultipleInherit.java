interface demo
{
    static final double pi=3.14;
    public void disp();

}
class Def
{
    int i=22;
    void disp1()
    {
            System.out.println("In disp1 function:");

    }   
}
class MultipleInherit extends Def implements demo
{
    public void disp()
    {
        System.out.println("IN disp function:");
    }
    public static void main(String[] args)
    {
        MultipleInherit obj =new MultipleInherit();
        obj.disp1();
        obj.disp();
    }
}