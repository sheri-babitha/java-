import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.print("enter the number :");
        Scanner input = new Scanner(System.in);
        int x =input.nextInt();
        if (x%2==0) {
            System.out.println(x + " is an even ");
        }
        else {
            System.out.println(x +"  is an odd");
        }
    }
}
