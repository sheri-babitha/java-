import java.util.Scanner;

public class operation{
    public static void main(String[] args) {
       // double num;
        // you can use if else if statemetn aswell if you want to repeat again then while if once it should then no while
        Scanner in = new Scanner(System.in);
       while (true) {
           System.out.println("enter the value :");
           double y = in.nextInt();
           System.out.println("enter the value :");
           double z = in.nextInt();
           System.out.println("enter the operator : ");
           char op = in.next().charAt(0);
           double x = 0;
           switch (op) {
               case '+':
                   x = y + z;
                   break;
               case '-':
                   x = y - z;
                   break;
               case '*':
                   x = y * z;
                   break;

               case '/':
                   x = y / z;
                   break;
           }

           System.out.println("your answer is :" + x);
       }
    }
}
