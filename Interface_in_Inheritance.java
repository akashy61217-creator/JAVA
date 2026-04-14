package learnings.abstraction_and_Interface;
interface SampleTest{
    void method1();
    void method2();
}
interface SampleChildTest{
    void method1();
    void method2();
    void method3();

}
class SampleChild2Test implements SampleTest {


    @Override
    public void method1() {
        System.out.println("I am method1:");

    }

    @Override
    public void method2() {

    }

//    @Override
//    public void method3() {
//
//    }
}
public class Interface_in_Inheritance {
    public static void main(String[] args) {

    }
}
