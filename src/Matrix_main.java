class Matrix{
    int [][] data;

    public Matrix(){
        data=new int [3][3];
    }
    public Matrix(int [][] a){
        data=a.clone();
    }
    public Matrix add(Matrix a){

        if(this.data.length!=a.data.length || this.data[0].length!= a.data[0].length){
            System.out.println("Dimensions missmatches !!");
            return new Matrix();
        }
        else {
            int [][] res =new int[data.length][data[0].length];
            for(int i=0;i<data.length;i++){
                for(int j=0;j<data[0].length;j++){
                    res[i][j]=this.data[i][j]+a.data[i][j];
                }
            }
            return new Matrix(res);
        }
    }
    public Matrix multiply(Matrix a){
        if(this.data.length != this.data.length){
            System.out.println("Invalid Dimensions!!!");
            return new Matrix();
        }
        else {
            int[][] res = new int[data.length][a.data[0].length];
            for(int i = 0; i < data.length; i++) {
                for(int j = 0; j < a.data[0].length; j++) {
                    int sum = 0;
                    for(int k = 0; k < data[0].length; k++) {
                        sum += data[i][k] * a.data[k][j];
                    }
                    res[i][j] = sum;
                }
            }
            return new Matrix(res);
        }
    }

    public Matrix transpose(){
        int [][] res =new int[data.length][data[0].length];
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                res[j][i]=this.data[i][j];
            }
        }
        return new Matrix(res);
    }

    public void Display(){
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
public class Matrix_main {
    public static void main(String [] args){
        int [][] a = {
                {3,4,5},
                {5,2,1},
                {4,1,6}
        };
        int [][] b ={
                {1,4,2},
                {5,9,3},
                {1,3,2}
        };
        int[][] c = {
                {5, 4},
                {2, 1},
                {6, 4}
        };

        Matrix A = new Matrix(a);
        Matrix B = new Matrix(b);
        Matrix C = new Matrix(c);
        System.out.println("Matrix A:");
        A.Display();
        System.out.println("Matrix B:");
        B.Display();
        System.out.println("Matrx C:");
        C.Display();
        System.out.println("A + B = ");
        A.add(B).Display();
        System.out.println("A * C = ");
        A.multiply(C).Display();
        System.out.println("A transpose = ");
        A.transpose().Display();


    }

}
