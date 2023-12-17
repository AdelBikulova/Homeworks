package homeWork.HW27.Pizza_shop;

class PizzaMargarita extends Pizza {
    public PizzaMargarita(String ing1, String ing2, String ing3, String name) {
        super(ing1, ing2, ing3, name);
    }
    @Override
    public void prepare() {
        System.out.println("Preparing pizza Margarita");
        super.prepare();

    }
    public void bake() {
        System.out.println("Baking pizza Margarita");
        super.bake();
    }
    public void pack() {
        System.out.println("Packing pizza Margarita");
        super.pack();
    }
}


