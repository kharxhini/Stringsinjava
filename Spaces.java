import java.util.Scanner;
public class Spaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String name = sc.nextLine();
        int length = name.length();
        int space = 0;
        for(int i=0; i<length;i++){
            char ch = name.charAt(i);
            if(ch == ' '){
                space++;
                System.out.println("Space Founded");
            }
        }
        System.out.println("Total space: " + space);
    }
    
}
