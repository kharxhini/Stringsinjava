import java.util.Scanner;

public class Pwords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String namee = sc.nextLine();

        String[] words = namee.trim().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        sc.close();
    }
}

