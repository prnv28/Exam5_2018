class A1 {
    static int x = 5;
}
class B1 extends A1 {
    int x;
    public B1() {
        x = 0;
    }
    public B1(int x) {
        this.x = x;
    }
    public void display() {
        System.out.println("A.x = " + A1.x);
        System.out.println("B.x = " + this.x);
    }
}
public class hidden_main {
    public static void main(String[] args) {
        B1 b_obj = new B1(8);
        b_obj.display();
    }
}