package learnings.abstraction_and_Interface;

public class Motorola implements Mobile{

    @Override
    public void getMobileBrand() {
        System.out.println("VIVO");
    }

    @Override
    public void getMobilePrice() {
        System.out.println("25000");
    }

    @Override
    public void getMobileName() {
        System.out.println("VIVO Y31 PRO");
    }
}
