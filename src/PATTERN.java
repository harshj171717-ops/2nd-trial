import java.util.Scanner;

public class PATTERN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int c=1;
//        for ( int i=0 ; i<a ; i++){
//            for (int j=0 ; j<i+1 ; j++){
//                System.out.print(c+ " ");
//                c++;
//            }
//            System.out.println();
//        }
        for (int i=1 ; i<=a ; i++){
            for (int j=1 ; j<=a ; j++){
                if (i+j > a) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}