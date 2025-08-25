package org.example.week5;

public class Employee {

    private static String name;
    private static String lastName;


    // Inner class to store contact information
    class ContactInfo{
        private static String phoneNumber;
        private static String eMail;

        // Constructor for ContactInfo to initialize phone number and email
        public ContactInfo(String phoneNumber,String eMail) {
            this.phoneNumber = phoneNumber;
            this.eMail = eMail;
        }

        // Static method to get the phone number
        public static String getphoneNumber() {
            return phoneNumber;
        }

        // Static method to get the email address
        public static String geteMail() {
            return eMail;
        }
    }

    // Constructor for Employee to initialize first name and last name
    public Employee(String name,String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    // Static method to get the first name
    public static String getname() {
        return name;
    }

    // Static method to get the last name
    public static String getlastName() {
        return lastName;
    }

    // Method to display employee and contact information
    public void displayInfo(String phoneNumber,String eMail){
        ContactInfo contactInfo = new ContactInfo(phoneNumber,eMail);
        System.out.println("Name-LastName: " + getname() + " " + getlastName());
        System.out.println("Phone Number : " + contactInfo.getphoneNumber());
        System.out.println("E-Mail : " + contactInfo.geteMail());
    }

    public static void main(String[] args) {

        Employee employee = new Employee("Bekir","Ahmetli");// Create an Employee instance with name "Bekir Ahmetli"
        employee.displayInfo("05555555555","bekirahmetli@gmail.com");// Display the employee's information with provided contact details

    }
}
