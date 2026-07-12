import java.util.Scanner;
public class Every {
    public static void main(String[] args) {
      Scanner  sc = new Scanner(System.in);
      System.out.print("Enter a String:");
      String org_namr = sc.nextLine();
      int leng = org_namr.length();
      for(int i=leng-1;i>=0;i--){
        System.out.println(org_namr.charAt(i));
      }

    }
    
}
