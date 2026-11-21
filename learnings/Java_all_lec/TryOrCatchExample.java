package learnings.Exception;

public class TryOrCatchExample {
   public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Cannot be divided by zero: ");
        }
        finally {
            System.out.println("All Work Done:");
        }

   }
}
