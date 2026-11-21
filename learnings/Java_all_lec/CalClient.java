public class CalClient {
    public static void main(String[] args) {
        Cal Calc =new Cal();
        int add =Calc.add(5,6);

        int sub = Calc.sub(10, 5);
        int multi = Calc.multi(10, 3);
        int div = Calc.div(300, 6);


        System.out.println("add: " +add );
        System.out.println("sub: " +sub );
        System.out.println("div: " +div );
        System.out.println("multi: " + multi);

    }
}
