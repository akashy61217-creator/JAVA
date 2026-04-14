package learnings.abstraction_and_Interface;

abstract class Parent{
        public Parent(){  // Create a constructor
            System.out.println("I am Constructor of the parent class ");
        }
        public void name(){ //Method
            System.out.println("My name is akash yadav");
        }
        abstract public void greet();
    }
    class Child extends Parent{

        @Override
        public void greet() {
            System.out.println("Good Morning");

        }
    }
    class Child2 extends Parent{
          public void age() {
            System.out.println("23");
        }

        @Override
        public void name() {
            System.out.println("My name is karan Yadav");


        }

        @Override
        public void greet() {
            System.out.println("Hello ,Good Morning");
        }
    }

public class Abstract_Method {
    public static void main(String[] args) {
       // Parent p= new Parent();  >>>>>>Error
        Child c= new Child();


    }
}
