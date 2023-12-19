package consul._19_12_23;

public abstract class Pupil {

    public String firstName;
    public String lastName;
    public int age;

    public Pupil(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "First name = " + firstName + " , last name = " + lastName + " , age = " + age;
    }
}
