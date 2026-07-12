import java.util.Scanner;
public class Last {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String:");
        String orange = s.nextLine();
        System.out.println(orange.charAt(orange.length()-2));
    }
    
}
