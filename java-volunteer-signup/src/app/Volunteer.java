package app;

import java.io.Serializable;

public class Volunteer implements Serializable {
    private static final long serialVersionUID = 1L;
    String firstName;
    String lastName;
    String phoneNumber;
    String email;
    String worship;
    String welcome;
    String production;
    String communityGroups;
    String childrensMinistry;
    String studentMinistry;

    public Volunteer(String firstName, String lastName, String phoneNumber, String email, String worship,
            String welcome, String production, String communityGroups, String childrensMinistry,
            String studentMinistry) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.worship = worship;
        this.welcome = welcome;
        this.production = production;
        this.communityGroups = communityGroups;
        this.childrensMinistry = childrensMinistry;
        this.studentMinistry = studentMinistry;
    }
}