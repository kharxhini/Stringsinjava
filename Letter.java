import java.util.Scanner;
public class Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String name = sc.nextLine();
        int count = 0;
        for(int i=0;i < name.length();i++) {
            char ch = name.charAt(i);
            if(Character.isLetter(ch)){
                count++;
                System.out.print(ch);

            }
        }
        System.out.println("Total count of Letter:" + count);
    }
}
    

