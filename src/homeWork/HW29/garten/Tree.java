package homeWork.HW29.garten;

class Tree extends Plant {
    public Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public void doSpring() {
        height += 110;
        System.out.println(name + " has grown " + height + " in spring");
    }
    @Override
    public void doSummer() {
        height += 110;
        System.out.println(name + " has grown " + height + " in summer");
    }

    @Override
    public void doAutumn() {
        System.out.println(name + " doesn't grow in autumn");
    }

    @Override
    public void doWinter() {
        System.out.println(name + " doesn't grow in winter");

    }
}
