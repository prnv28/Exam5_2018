interface A
{
    public void methodA();
}
interface B extends A
{
    public void methodB();
}
interface C extends A
{
    public void methodC();
}
class D implements B, C
{
    public void methodA()
    {
        System.out.println("MethodA");
    }
    public void methodB()
    {
        System.out.println("MethodB");
    }
    public void methodC()
    {
        System.out.println("MethodC");
    }
}
class multipath_main {
    public static void main(String[] args)
    {
        D obj1= new D();
        obj1.methodA();
        obj1.methodB();
        obj1.methodC();
    }
}