package homeWork.HW33;

public abstract class Employee implements Comparable<Employee> {

    private int id;
    private String firstName;
    private String lastName;
    private double hour;

    public Employee(int id, String firstName, String lastName, double hour) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHour() {
        return hour;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hour=" + hour +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        int employeeLastName = getLastName().compareTo(employee.getLastName());
        return employeeLastName;
    }
}
