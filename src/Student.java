public class Student {
    String name;
    int regno;
    int marks1,marks2,marks3;

    // null Constructure
    public Student(){
        name="pranav";
        regno=12345;
        marks1=80;
        marks2=90;
        marks3=95;
    }
    // parameterized constructure
    public Student(String n,int a,int b,int c,int d){
        name=n;
        regno=a;
        marks1=b;
        marks2=c;
        marks3=d;
    }

    // copy Constructure
    public Student(Student s){
        name=s.name;
        regno=s.regno;
        marks1=s.marks1;
        marks3=s.marks3;
        marks2=s.marks2;
    }

    public void Display(){
        System.out.println(name + "\t" +regno+ "\t" +marks1+ "\t" +marks2+ "\t" + marks3);
    }

    public static void main(String [] args){
        Student s1=new Student();
        Student s2=new Student("Manas",23456,89,87,96);
        Student s3=new Student(s1);
        s1.Display();
        s2.Display();
        s3.Display();
    }
}
