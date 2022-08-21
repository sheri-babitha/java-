import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner m =new Scanner(System.in);
        System.out.print("enter Principal amount: ");
        float p=m.nextInt();
        System.out.print("enter rate of interest: ");
         float r =m.nextInt();
        System.out.print("enter time : ");
        float t =m.nextInt();
        float A =p*r*t/100;
        System.out.println("your simple is :"+ A);
        float y=p +A;
        System.out.println("per "+t+" you have to pay "+ y);



    }
}
