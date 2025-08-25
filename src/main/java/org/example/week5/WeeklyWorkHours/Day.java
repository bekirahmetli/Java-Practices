package org.example.week5.WeeklyWorkHours;

// Enum class to represent days of the week with associated working hours
public enum Day {
    SUNDAY("09:00 - 12:00"),
    MONDAY("11:00 - 17:00"),
    TUESDAY("13:00 - 19:00"),
    WEDNESDAY("08:00 - 14:00"),
    THURSDAY("14:00 - 20:00"),
    FRIDAY("12:00 - 18:00"),
    SATURDAY("10:00 - 16:00");

    private final String workHours;// Field to store the working hours for each day

    // Constructor to initialize the working hours for each enum constant
    Day(String workHours) {
        this.workHours = workHours;
    }

    // Method to retrieve the working hours for the current day
    public String getWorkHours() {
        return workHours;
    }
}
