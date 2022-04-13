package common;

import interfaces.IcontactDetails;
import services.ContactDetailsImplementation;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management System");

        IcontactDetails contactDetails = new ContactDetailsImplementation();

        System.out.println("Contact Creation Method Calling.....");
        contactDetails.createContact();

        System.out.println("Contact Added Method Calling.....");
        contactDetails.addContact();

        System.out.println("Contact Edit Method Calling.....");
        contactDetails.editContact();

    }
}
