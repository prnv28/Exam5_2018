class Complex{
    int real;
    int imag;

    public Complex(){
        real=imag=0;
    }
    public Complex(int a,int b){
        real=a;
        imag=b;
    }
    public Complex addition(Complex c){
        Complex d=new Complex();
        d.real=this.real+c.real;
        d.imag=this.imag+c.imag;
        return d;
    }
    public void Display(){
        System.out.println("The Number is : ("+this.real+") + ("+this.imag+")i");
    }

}
public class Complex_main {
    public static void main(String [] args){
        Complex c1=new Complex(5,7);
        Complex c2=new Complex(8,-8);
        c1.Display();
        c2.Display();
        System.out.println("--------------The addition Of Both Numbers---------------");
        Complex c3=c1.addition(c2);
        c3.Display();
    }
}
