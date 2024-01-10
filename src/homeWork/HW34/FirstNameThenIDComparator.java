package homeWork.HW34;

import java.util.Comparator;

public class FirstNameThenIDComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        int res = Integer.compare(e1.getId(), e2.getId());
        if (res == 0)
            res = e1.getFirstName().compareTo(e2.getFirstName());
        return res;
    }
}
