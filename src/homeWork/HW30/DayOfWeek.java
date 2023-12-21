package homeWork.HW30;

public enum DayOfWeek {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static boolean contains(String check) {
        for (DayOfWeek day : values()) {
            if (day.name().equals(check)) {
                return true;
            }
        }
        return false;
    }
}