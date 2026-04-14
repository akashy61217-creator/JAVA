package learnings.abstraction_and_Interface;
interface Car{
    int age=20;
     void applyBreak( int decrement);
     void speedUp( int increment);


}
interface CarName {
    void fortuner( String Modelname);
    void Creata(String Modelname);
    void NISAAN(String Modelname);

        }
 class Vehicle1 implements CarName  {
     @Override
     public void fortuner(String name) {
         System.out.println("Hybrid variants:");


     }

     @Override
     public void Creata(String name) {
         System.out.println("Hyundai Creta N Line");

     }

     @Override
     public void NISAAN(String Modelname) {
         System.out.println("Nissan Gravite:");

     }
 }
class fortuner implements Car{
    @Override
    public void applyBreak(int decrement) {
        System.out.println("ApplyingBreak:");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("SpeedUp");
    }
}

public interface Interface_Concept {
    public static void main(String[] args) {
        fortuner car=new fortuner();
        int decrement = 1;
        car.applyBreak(decrement);
        //You can create  properties in interfaces
        //You can not modify the properties in Interfaces as they are final.
        System.out.println(car.age);
        car.applyBreak(20);

    }
}
