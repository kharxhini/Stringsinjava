import java.util.Scanner;

public class Upperlower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your String: ");
        String name = sc.nextLine();

        int upper = 0;
        int lower = 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (MyCharacter.isUpperCase(ch)) {
                upper++;
                System.out.println("Uppercase: " + ch);
            }

            if (MyCharacter.isLowerCase(ch)) {
                lower++;
                System.out.println("Lowercase: " + ch);
            }
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);

        sc.close();
    }
}
    

