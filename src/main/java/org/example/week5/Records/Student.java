package org.example.week5.Records;

// Record class to represent a student with immutable fields: name, lastName, and number
public record Student(String name,String lastName,Integer number) {
    // Default constructor and accessor methods are implicitly provided by the record
    // All fields are final and immutable by default
}
