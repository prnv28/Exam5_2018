class emp
{
    String name;
    int id;
    public emp(int d_id,String d_n)
    {
        id=d_id;
        name=d_n;
    }
    public void dis()
    {
        System.out.println("name="+name+"\n");
        System.out.println("id="+id+"\n");
    }
}
class dailly extends emp
{
    int am;
    int day,bsalary;
    public dailly(int d_am,int day1,int d_id,String d_n)
    {
        super(d_id,d_n);
        am=d_am;
        day=day1;
    }
    public int cal1()
    {
        bsalary=am*day;
        return bsalary;
    }
    public void dis2()
    {
        dis();
        System.out.println(" Dailly Salary ="+bsalary+"\n");
    }
}
class reg extends emp
{
    int anu;
    int basic,salary;
    public reg(int d_a,int d_b,int d_id,String d_n)
    {
        super(d_id,d_n);
        anu=d_a;
        basic=d_b;
    }
    public int cal()
    {
        salary=basic+anu;
        return salary;
    }
    public void dis1()
    {
        dis();
        System.out.println(" basic salary="+salary+"\n");
    }
}
public class e_main
{
    public static void main(String [] s)
    {
        emp r1=new emp(1,"pranav");
        dailly r2=new dailly(200,2,1,"pranav");
        reg r3=new reg (5000,200,1,"pranav");
        r1.dis();
        r2.cal1();
        r2.dis2();
        r3.cal();
        r3.dis1();
    }
}