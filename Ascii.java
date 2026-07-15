import java.util.Scanner;
public class Ascii{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String naam = sc.nextLine();
        for(int i=0;i<naam.length();i++){
            char ch = naam.charAt(i);
              
          System.out.println(ch + "=" + (int)ch);
        }
          sc.close();
}
    }


