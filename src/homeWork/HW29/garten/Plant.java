package homeWork.HW29.garten;

public abstract class Plant {

    protected String name;
    protected int height;
    protected int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public abstract void doSpring();

    public abstract void doSummer();

    public abstract void doAutumn();

    public abstract void doWinter();

}
