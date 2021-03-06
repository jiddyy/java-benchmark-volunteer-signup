package app;

import java.util.*;
import java.io.*;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Volunteer volunteer = getVolunteerInfo();
        input.close();
        saveVolunteer(volunteer);
    }

    private static void saveVolunteer(Volunteer volunteer) {
        try {
            FileOutputStream fileStream = new FileOutputStream("volunteers.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(volunteer);
            System.out.println("Thank you. We'll get in touch with you as soon as possible!");
            os.close();
        } catch (IOException ex) {
            System.out.println("Failed to save.");
        }
    }

    public static Volunteer getVolunteerInfo() {
        System.out.println("Thank you for considering to volunteer for the Church. Please fill out this small form.");
        System.out.println("First name: ");
        String firstName = input.nextLine();
        System.out.println("Last name: ");
        String lastName = input.nextLine();
        System.out.println("Phone number: ");
        String phoneNumber = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();

        System.out.println("Now fill out your areas of interest.");
        System.out.println("Would you like to volunteer for the Worship team? ");
        String worship = input.nextLine();
        System.out.println("Would you like to volunteer for the Welcome team? ");
        String welcome = input.nextLine();
        System.out.println("Would you like to volunteer for the Production team? ");
        String production = input.nextLine();
        System.out.println("Would you like to volunteer for the Community Group? ");
        String communityGroups = input.nextLine();
        System.out.println("Would you like to volunteer for Children's Ministry? ");
        String childrensMinistry = input.nextLine();
        System.out.println("Would you like to volunteer for Student Ministry? ");
        String studentMinistry = input.nextLine();
        return new Volunteer(firstName, lastName, phoneNumber, email, worship, welcome, production, communityGroups,
                childrensMinistry, studentMinistry);
    }
}