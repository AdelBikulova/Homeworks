package homeWork.HW27.Pizza_shop;

public class PizzaHawaii extends Pizza {

    String ing4 = "ham";
    String ing5 = "pineapples";

    public PizzaHawaii(String ing1, String ing2, String ing3, String ing4, String ing5, String name) {
        super(ing1, ing2, ing3, name);
        this.ing4 = ing4;
        this.ing5 = ing5;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Preparing pizza Hawaii");
    }
    public void bake() {
        System.out.println("Baking pizza Hawaii");
        super.bake();
    }
    public void pack() {
        System.out.println("Packing pizza Hawaii");
        super.pack();
    }
}