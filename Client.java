package learnings.abstraction_and_Interface;

public class Client {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle() { // Object Creation
            @Override
            public void getVehicleType() {

            }

            @Override
            public void getVehiclePrice() {

            }

            @Override
            public void getVehicleMileage() {

            }

            @Override
            public void getModel() {

            }
        };
        v1.getVehicleType();
    }
}
