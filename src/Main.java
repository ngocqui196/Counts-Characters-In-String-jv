import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       do {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter String:");
           String str = sc.nextLine();
           System.out.println("Enter charater: ");
           String string = sc.nextLine();
           char chr = string.charAt(0);
           int count = 0;
           for (int i = 0; i < str.length(); i++) {
               if (str.charAt(i) == chr)  {
                   count++;
               }
           }
           System.out.println(count);
       }while (true);

    }
}
