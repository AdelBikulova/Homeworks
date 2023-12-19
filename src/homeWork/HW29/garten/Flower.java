package homeWork.HW29.garten;
class Flower extends Plant {
    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public void doSpring() {
        height += 22;
        System.out.println(name + " has grown " + height + " cm in spring ");
    }
    @Override
    public void doSummer() {
        System.out.println(name + " doesn't grow in summer");
    }
    @Override
    public void doAutumn() {
        System.out.println(name + " has been cut in autumn");
        height = 0;
    }
    @Override
    public void doWinter() {
        System.out.println(name + " doesn't grow in winter");
    }
}
