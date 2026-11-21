package learnings.abstraction_and_Interface;

public class Bike {

    private String bikeName;
    private String bikeModel;
    private int bikePrice;

    public String getBikeModel() {
        return bikeModel;
    }

    public String getBikeName() {
        return bikeName;
    }

    public int getBikePrice() {
        return bikePrice;
    }

    public void setBikeName(String bikeName) {
       boolean valid = isValid(bikeName);
       if(valid){
           this.bikeName = bikeName;
       }

    }

    public void setBikeModel(String bikeModel) {
        if(isValid(bikeModel)){
            this.bikeModel = bikeModel;
        }
    }

    public void setBikePrice(int bikePrice) {
        this.bikePrice = bikePrice;
    }

    private boolean isValid(String value){
        if(value != null){
            return true;
        }else {
            return false;
        }
    }
}
