import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String Here: ");
        String name = sc.nextLine();

        int count = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (Character.isLetter(ch) &&
                !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {

                count++;
                System.out.println(ch);
            }
        }

        System.out.println("The Consonants: " + count);

        sc.close();
    }
}