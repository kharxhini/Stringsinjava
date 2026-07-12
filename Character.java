import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String:");
        String org = scan.nextLine();
        System.out.println(org.charAt(4));
    }
    
}
