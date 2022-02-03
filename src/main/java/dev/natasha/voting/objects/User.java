package dev.natasha.voting.objects;

public class User {
    public int userID;
    public String role;

    public User() {
        userID = 0;
        role = null;
    }

    public String getRole() {
        return role;
    }

    // this is the class constructor
    public static void main(String[] args) {
        // put code here
    }
}

class Voter extends User {
    public int voterID;
    public boolean verified;
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Voter(int id, boolean verification, String fName, String lName, int inputAge, String inputAddress) {
        voterID = id;
        verified = verification;
        firstName = fName;
        lastName = lName;
        age = inputAge;
        address = inputAddress;

        // update parent class with role
        super.role = "VOTER";
    }

    public Voter() {
        voterID = 0;
        verified = true;
        firstName = "DEFAULT";
        lastName = "VOTER";
        age = 18;
        address = "DEFAULT ADDRESS";

        // update parent class with role
        super.role = "VOTER";
    }

    public int getVoterID() {
        return voterID;
    }
}

class Administrator extends User {
    public int adminID;
    private String firstName;
    private String lastName;


    public Administrator(int id, String fName, String lName) {
        adminID = id;
        firstName = fName;
        lastName = lName;

        // update parent class with role
        super.role = "ADMINISTRATOR";
    }

    public Administrator() {
        adminID = 0;
        firstName = "DEFAULT";
        lastName = "ADMIN";

        // update parent class with role
        super.role = "ADMINISTRATOR";
    }

    public int getAdminID() {
        return adminID;
    }
}

class Auditor extends User {
    public int auditorID;
    private String firstName;
    private String lastName;


    public Auditor(int id, String fName, String lName) {
        auditorID = id;
        firstName = fName;
        lastName = lName;

        // update parent class with role
        super.role = "AUDITOR";
    }

    public Auditor() {
        auditorID = 0;
        firstName = "DEFAULT";
        lastName = "AUDITOR";

        // update parent class with role
        super.role = "AUDITOR";
    }

    public int getAuditorID() {
        return auditorID;
    }
}