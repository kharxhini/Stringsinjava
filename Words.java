import java.util.Scanner;
public class Words {
    public static void main(String[] args) {
        Scanner can = new Scanner(System.in);
        System.out.print("Enter a String:");
        String naam = can.nextLine();
        String[] words = naam.trim().split("\\s+");
        System.out.print(words.length);
    }
}
    
