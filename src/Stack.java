public class Stack {
    private int maxSize;
    private long[] Array;
    private int top;

    public Stack(int n){
        maxSize=n;
        Array=new long[maxSize];
        top=-1;
    }
    public void push(long a){
        if(top<maxSize-1){
            Array[++top]=a;
        }
        else{
            System.out.println("Stack is full!!");
        }
    }
    public void pop(){
        if(top>-1){
            top--;
        }
        else{
            System.out.println("Stack is Empty!!!");
        }
    }
    public long peek(){
        return Array[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (maxSize-1==top);
    }
    public void Display(){
        for(int i=0;i<=top;i++){
            System.out.println("| "+ Array[i]+" |");
        }
    }

    public static void main(String [] args){
        Stack s1=new Stack(5);
        for(int i=0;i<5;i++){
            s1.push(i+1);
        }
        s1.Display();
        s1.push(6);
        s1.isFull();
      //  s1.Display();
        for(int i=5;i>0;i--){
            s1.pop();
        }
        s1.Display();
        s1.pop();
        s1.isEmpty();
        s1.Display();

    }
}
