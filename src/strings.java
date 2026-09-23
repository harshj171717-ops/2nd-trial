import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i=0, j=s.length()-1,count = 0;
      while (i<j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (s.charAt(i)==s.charAt(j)){
                count++;
                i++;
                j--;
            }
            else {
                break;
            }
      }
      if (count==(s.length()/2)){
          System.out.println("String is palendrme");
      }
      else System.out.println("String is nit a palendrime");
    }
}
