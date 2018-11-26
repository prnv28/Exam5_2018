interface my_interface
{
    public void m1();
    public void m2();
}
class x implements my_interface
{
    int x;
    int y;
    x(int a,int b)
    {
        x=a;
        y=b;
    }
    public void m1()
    {
        int z;
        z=x+y;
        System.out.println("z="+z);
    }
    public void m2()
    {
        int z;
        z=x-y;
        System.out.println("z="+z);
    }
}
public class Interface {
    public static void main(String[] args) {
        x x1=new x(10,5);
        x1.m1();
        x1.m2();
    }
}