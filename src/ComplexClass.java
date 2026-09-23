import java.util.Scanner;

public class ComplexClass {
    public static class Complex{
        int x;
        int y;
        Complex(int x, int y){
            this.x=x;
            this.y=y;
        }
        void print(){
            System.out.println(x+"+"+"i"+y);
        }
        void add(Complex c2){
            x+=c2.x;
            y+=c2.y;
        }
        void mul (Complex c2){
            int a1=x,a2=y;
            x=(a1* c2.x)-(a2* c2.y);
            y=(a2* c2.x)+(a1* c2.y);
        }

    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        Complex c1 =new Complex(sc3.nextInt(), sc3.nextInt());
        Complex c2 =new Complex(sc4.nextInt(), sc4.nextInt());
        c1.print();
        c2.print();
        c1.mul(c2);
       // c1.add(c2);
        c1.print();
    }
}
