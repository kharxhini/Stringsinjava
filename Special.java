import java.util.Scanner;
public class Special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String name = sc.nextLine();
        int length = name.length();
        int special = 0;
        for(int i=0; i<length ;i++){
            char ch = name.charAt(i);
            if(!Character.isLetterOrDigit(ch) &&
                !Character.isWhitespace(ch)) {
                    special++;
                    System.out.println(ch);
                }
        }
        System.out.println("The special characters count:" + special);

    }
}
    

