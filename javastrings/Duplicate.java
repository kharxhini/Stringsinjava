import java.util.Scanner;
public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = sc.nextLine();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            boolean duplicate = false;
            for(int j=0;j<i;j++){
                if(str.charAt(j) == ch){
                    duplicate = true;
                    break;
                }
            }
             if(!duplicate){
                System.out.println(ch);
             }
        }
        sc.close();
        
    }
}

    


