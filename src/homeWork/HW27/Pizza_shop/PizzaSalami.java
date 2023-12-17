package homeWork.HW27.Pizza_shop;

public class PizzaSalami extends Pizza {

    String ing4 = "salami";

        public PizzaSalami(String ing1, String ing2, String ing3, String ing4, String name) {
        super(ing1, ing2, ing3, name);
        this.ing4 = ing4 ;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing pizza Salami");
        super.prepare();

    }
    public void bake() {
        System.out.println("Baking pizza Salami");
        super.bake();
    }
    public void pack() {
        System.out.println("Packing pizza Salami");
        super.pack();
    }

}




