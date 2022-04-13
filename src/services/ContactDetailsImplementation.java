package services;
// ServiceImpl
import entity.Address;
import entity.Person;
import interfaces.IcontactDetails;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ContactDetailsImplementation implements IcontactDetails {

    Scanner sc = new Scanner(System.in);
    ArrayList<Person> list = new ArrayList<Person>();
    Person person = new Person();
    Address address = new Address();

    public void createContact() {
        Person person = new Person();
        Address address = new Address();

        System.out.println("Enter First Name: ");
        String firstName = sc.next();

        System.out.println("Enter Last Name: ");
        String lastName = sc.next();

        System.out.println("Enter Phone Number: ");
        String phoneNumber = sc.next();

        System.out.println("Enter Email Id: ");
        String emailId = sc.next();

        System.out.println("Enter City: ");
        String city = sc.next();

        System.out.println("Enter State: ");
        String state = sc.next();

        System.out.println("Enter Zip: ");
        long zip = sc.nextInt();

        System.out.println("Contact Created.....");
        person.setAddress(address);

        list.add(person);

        System.out.println("New details are: ");
        System.out.println("FirstName:" + firstName + "\t" + "LastName:" + lastName + "\t"
                + "PhoneNumber:" + phoneNumber + "\t" + "Email Id:" + emailId + "\t"
                + "City:" + city + "\t" + "State:" + state + "\t" + "Zip:" + zip);
    }

    public void addContact() {
        Person person = new Person();
        Address address = new Address();

        System.out.println("Enter Person Details: ");

        System.out.println("Enter First Name: ");
        String firstName = sc.next();
        person.setFirstName(firstName);

        System.out.println("Enter Last Name: ");
        String lastName = sc.next();
        person.setLastName(lastName);


        System.out.println("Enter Phone Number: ");
        long phoneNumber = sc.nextLong();
        person.setPhoneNumber(phoneNumber);

        System.out.println("Enter Email Id: ");
        String emailId = sc.next();
        person.setEmailId(emailId);

        System.out.println("Enter City: ");
        String city = sc.next();
        address.setCity(city);

        System.out.println("Enter State: ");
        String state = sc.next();
        address.setState(state);

        System.out.println("Enter Zip: ");
        long zip = sc.nextInt();
        address.setZip(zip);

        System.out.println("Contact added details are: ");
        person.setAddress(address);

        list.add(person);

        System.out.println("New added contact details are: ");
        System.out.println("FirstName:" + person.getFirstName() + "\t" + "LastName:" + person.getLastName() + "\t"
                + "PhoneNumber:" + person.getPhoneNumber() + "\t" + "Email Id:" + person.getEmailId() + "\t"
                + "City:" + address.getCity() + "\t" + "State:" + address.getState() + "\t" + "Zip:" + address.getZip());
    }

    public void editContact () {
        System.out.println("Enter person name for edit contact: ");
        String firstName = sc.next();

        Iterator<Person> iterator = list.listIterator();

        while (iterator.hasNext()) {
             person = iterator.next();

            if (firstName.equals(person.getFirstName())) {
                 address = person.getAddress();

                System.out.println("Edit the details of person");
                System.out.println("Choose field you want to add:");
                System.out.println(" 1.First Name \t 2.Last Name \t 3.Phone Number \t 4.Email " +
                        " \t 5.State \t 6.City \t 7.Zip \t 8.Default ");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Enter First Name: ");
                        String firstName1 = sc.next();
                        person.setFirstName(firstName1);
                        break;
                    case 2:
                        System.out.println("Enter Last Name: ");
                        String lastName = sc.next();
                        person.setLastName(lastName);
                        break;
                    case 3:
                        System.out.println("Enter Phone Number: ");
                        long phoneNumber = sc.nextLong();
                        person.setPhoneNumber(phoneNumber);
                        break;
                    case 4:
                        System.out.println("Enter Email: ");
                        String emailId = sc.next();
                        person.setEmailId(emailId);
                        break;
                    case 5:
                        System.out.println("Enter State: ");
                        String state = sc.next();
                        address.setState(state);
                        break;
                    case 6:
                        System.out.println("Enter City: ");
                        String city = sc.next();
                        address.setState(city);
                        break;
                    case 7:
                        System.out.println("Enter Zip: ");
                        long zip = sc.nextInt();
                        address.setZip(zip);
                        break;
                    default:
                        System.out.println("Exit");
                }
            }
            else {
                System.out.println("Person not found here");
            }
        }

        System.out.println("FirstName:" + person.getFirstName() + "\t" + "LastName:" + person.getLastName() + "\t"
                + "PhoneNumber:" + person.getPhoneNumber() + "\t" + "Email Id:" + person.getEmailId() + "\t"
                + "City:" + address.getCity() + "\t" + "State:" + address.getState() + "\t" + "Zip:" + address.getZip());
    }

}
