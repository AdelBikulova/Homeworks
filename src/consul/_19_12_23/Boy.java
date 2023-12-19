package consul._19_12_23;

public class Boy extends Pupil {
    public Boy(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void work() {
        System.out.println(getFirstName() + " makes stool.");
    }

    @Override
    public String toString() {
        return super.toString();

    }
}


