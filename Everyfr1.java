import java.util.Scanner;
public class Everyfr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String:");
        String name = sc.nextLine();
        int len = name.length();
        for(int i=0; i<len;i++){
            System.out.println(name.charAt(i));
        }
        
    }
}
    
