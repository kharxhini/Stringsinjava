import java.util.Scanner;
public class Print{
    public static void main(String[] args){
        System.out.print("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("The Name is"+ name);
    }
}