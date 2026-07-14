import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String name = sc.nextLine();

        int digit = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (Character.isDigit(ch)) {
                digit++;
                System.out.println(ch);
            }
        }

        System.out.println("Total Digits = " + digit);

        sc.close();
    }
}
