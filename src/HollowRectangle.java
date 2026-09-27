package Pattern;

import java.util.Scanner;

public class HollowRectangle {
    static void main() {
        System.out.print("Enter no of Rows :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter no of Columns :");
        Scanner sb = new Scanner(System.in);
        int b = sb.nextInt();
        for(int i = 1;i<=a;i++)
        {
            System.out.print(" *");
            {
                for(int j = 1;j<=b-2;j++)
                {
                    if(i==1 || i==a)
                    {
                        System.out.print(" *");
                    }
                    else
                    {
                        System.out.print( " "+(char)32);
                    }
                }
                System.out.print(" *");
                System.out.println();
            }
        }
    }
}
