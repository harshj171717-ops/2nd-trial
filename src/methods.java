import jdk.jshell.SourceCodeAnalysis;
import java.util.Scanner;
public class methods {
    static void main() {
        int[] x = {23, 3, 5, 9, 7,12,17,13};
    Scanner sc1 = new Scanner(System.in);
    int d = sc1.nextInt();
        d = d%x.length;
        for ( int ele : x) {
            System.out.print(ele+ " " );
        }
        System.out.println("");
    int i=0 , j=x.length-d;
    while (i<d){
        int t = x[i];
        x[i] = x[j];
        x[j] = t;
        i++;
        j++;
    }
    for ( int ele : x) {
        System.out.print(ele+ " " );
    }
    }
    }



