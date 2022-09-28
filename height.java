import java.util.Scanner;

 class height {
    // String Gender;
     int maleheight;
   void  height1(){
         System.out.println("enter height for male  in cms : ");
     }

     void height2() {
         Scanner in = new Scanner(System.in);
         // Gender = in.nextLine();
         maleheight = in.nextInt();

       //  System.out.println("gender : " + Gender);
         System.out.println("height male : " + maleheight);
     }

     void male() {

         if ((maleheight > 177) && (maleheight < 1000)) {
             System.out.println("your are above average !");
         } else if (maleheight == 177) {
             System.out.println("your are average ! ");
         } else {
             System.out.println("your are below average !");
         }
     }
 }
class girl extends height {
    // String Gender;
    int femaleheight;
    void  height12(){
        System.out.println("enter height for female in cms : ");
    }

    void height21() {
        Scanner in = new Scanner(System.in);
        // Gender = in.nextLine();
        femaleheight = in.nextInt();

        //  System.out.println("gender : " + Gender);
        System.out.println("height male : " + femaleheight);
    }

    void female() {

        if ((femaleheight > 152) && (femaleheight < 1000)) {
            System.out.println("your are above average !");
        } else if (femaleheight == 152) {
            System.out.println("your are average ! ");
        } else {
            System.out.println("your are below average !");
        }
    }
}

class Testheight {
    public static void main(String[] args) {
        girl j = new  girl ();
        j.height1();
        j.height2();
        j.male();
        System.out.println();
        j.height12();
        j.height21();
        j.female();
    }
}
