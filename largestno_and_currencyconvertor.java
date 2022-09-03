import java.util.Scanner;

public class largestno_and_currencyconvertor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
//        System.out.println("enter the values:");
       System.out.println("enter the  cash to be converted :");

         float x= input.nextInt();
//        int y= input.nextInt();
//        int z= input.nextInt();
//        int max =Math.max(x,Math.max(y,z));
//        System.out.println("largest value is :"+max);

        double y = x /79.71;
        System.out.println("Your rupees in USD:" +y+"$");


//




    }


}
