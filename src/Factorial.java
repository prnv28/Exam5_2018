public class Factorial {
    public static int recursive(int n){
        if(n<=1)
            return 1;
        else
            return n*recursive(n-1);
    }
    public static int iterative(int n){
        int mul=1;
        for(int i=1;i<=n;i++)
            mul*=i;
        return mul;
    }
    public static void main(String [] args){
        System.out.println("Iterative Factorial of 5 is :  "+iterative(5));
        System.out.println("Recursive factorial of 6 is : "+recursive(6));
    }
}
