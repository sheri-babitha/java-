import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        //float is greater than int value because in int we can added only int value but
        // in float we can int and decimal value
        //left hand should be greater than right like in below
//type casting

//       int num = (int)(67.56f);
//        System.out.println(num);
//      int number= "హలో";
//        System.out.println(number);
        byte a = 100;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;
        System.out.println(d);
    }
}