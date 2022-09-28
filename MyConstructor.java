class Constructor {
    double bp;
    boolean x;
    String health;

    Constructor(double bp, boolean x, String health) {
        System.out.println("it show your  bp and your health. its a user  complie time input . ");
        this.bp = bp;
        this.x = x;
        this.health = health;


    }
}
     class Const{
        double weight;
        String wealth;
        boolean y;

    Const(double weight, String wealth, boolean y ){
        System.out.println("it show your  weight and your wealth . its a user  complie time input . ");
        this.weight= weight;
        this.wealth=wealth;
        this.y=y;

    }
}
class MyConstructor{
    public static void main(String[] args) {
        Constructor in = new Constructor(120,true,"not good") ;
        System.out.println("your bp is :"+in.bp);
        System.out.println("your bp is :"+in.x);
        System.out.println("your bp is :"+in.health);
        Const out = new Const(130.1, "under weight", true);
        System.out.println("your bp is :"+out.weight);
        System.out.println("your bp is :"+out.wealth);
        System.out.println("your bp is :"+out.y);
    }
}