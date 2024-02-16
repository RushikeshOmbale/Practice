package com.codingpractice.in;

import java.util.Date;

final class ImmutableClass {

    private final int id;
    private final String name;
    private final String address;
    private final Date dob;

    public ImmutableClass(int id, String name, String address, Date dob) {
        this.id = id;
        this.name = name;
        this.address = address;
        // Make a defensive copy of Date to ensure immutability
        this.dob = new Date(dob.getTime());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getDob() {
        // Return a defensive copy of Date to ensure immutability
        return new Date(dob.getTime());
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                '}';
    }

    public static void main(String[] args) {
        // Example of creating an instance of ImmutableClass
        Date dob = new Date(); // current date/time
        ImmutableClass i = new ImmutableClass(1, "John", "123 Main St", dob);

        // Displaying the initial state using toString method
        System.out.println("Initial State:");
        System.out.println(i);

        // Attempt to modify the state (which is not possible for an immutable class)
        // This will create a new object with the desired changes
        ImmutableClass modified = new ImmutableClass(2, "Jane", "456 Second St", dob);

        // Displaying the modified object
        System.out.println("\nModified State (new object is created):");
        System.out.println(modified);

        // Displaying the initial state again to show that the original object remains unchanged
        System.out.println("\nOriginal State (unchanged):");
        System.out.println(i);
    }
}
