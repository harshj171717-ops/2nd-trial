public class Fraction {
    public static class frac{
        int a;
        int b;
        frac(int a, int b){
            this.a=a;
            this.b=b;
        }
        void print(){
            System.out.println(a+"/"+b);
        }
        void add(frac y){
            int t1=a,t2=b;
            a=(t1*y.b)+(t2*y.a);
            b=(t2*y.b);
        }
    }

    public static void main(String[] args) {
        frac x=new frac(2,3);
        frac y=new frac(3,4);
        x.print();
        y.print();
        x.add(y);
        x.print();
    }
}
