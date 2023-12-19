package consul._19_12_23;


class Girl extends Pupil {
    public Girl(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public void work() {
        System.out.println(getFirstName() + " cooks soup.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
