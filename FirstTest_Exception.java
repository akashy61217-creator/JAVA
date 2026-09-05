package learnings.Exception;

public class FirstTest_Exception {
  public   static void main(String[] args) {
      int a=10;
      int b=0;
      int c=a/b;
      System.out.println("10 Dived by 0" + c);
      System.out.println("**********Program End**********");
      /*
      Show Erro:
      Exception in thread "main" java.lang.ArithmeticException: / by zero
	at learnings.Exception.FirstTest_Exception.main(FirstTest_Exception.java:7)
       */



    }
}