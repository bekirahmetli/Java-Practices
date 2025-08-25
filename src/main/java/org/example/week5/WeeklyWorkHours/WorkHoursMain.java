package org.example.week5.WeeklyWorkHours;

import java.util.Scanner;

public class WorkHoursMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------Working Hours--------");

        Day[] day = Day.values();// Get all enum values from the Day enum

        // Iterate over each day and print its name and working hours
        for (Day days : day){
            System.out.println(days.name() + "=>" + days.getWorkHours());
        }

        System.out.println("\nWhich day would you like to choose?(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY) : ");
        String enterDay = scanner.nextLine().toUpperCase();// Read user input and convert to uppercase for case-insensitive matching

        // Use switch statement to handle the selected day
        switch (enterDay){
            case "SUNDAY":
                showDayInfo(Day.SUNDAY);
                break;
            case "MONDAY":
                showDayInfo(Day.MONDAY);
                break;
            case "TUESDAY":
                showDayInfo(Day.TUESDAY);
                break;
            case "WEDNESDAY":
                showDayInfo(Day.WEDNESDAY);
                break;
            case "THURSDAY":
                showDayInfo(Day.THURSDAY);
                break;
            case "FRIDAY":
                showDayInfo(Day.FRIDAY);
                break;
            case "SATURDAY":
                showDayInfo(Day.SATURDAY);
                break;
            default:
                System.out.println("Wrong choice");
        }

    }

    // Private method to display information for the selected day
    private static void showDayInfo(Day day){
        System.out.println("Selected day: " + day.name() + " => " + day.getWorkHours());
    }
}
