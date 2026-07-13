import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String name = sc.nextLine();

        int count = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                count++;
                System.out.println(name.charAt(i));
            }
        }

        System.out.println("Number of vowels = " + count);

        sc.close();
    }
}