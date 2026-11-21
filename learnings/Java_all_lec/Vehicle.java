package learnings.abstraction_and_Interface;

public abstract class Vehicle {

    // abstract methode/function it has only signature not the implementation

    public abstract void getVehicleType();
    public abstract void getVehiclePrice();
    public abstract  void getVehicleMileage();
    public abstract void getModel();

    public String getVehicleName(){
        return "Default Car";
    }
}
