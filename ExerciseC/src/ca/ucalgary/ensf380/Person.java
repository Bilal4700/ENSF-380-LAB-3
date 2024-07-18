package ca.ucalgary.ensf380;

public abstract class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    protected Address address;
    private static int lastPersonalNumber;
    private final int nextpersonalNumber;

    public Person(String name) {
        this.name = name;
        this.nextpersonalNumber = ++lastPersonalNumber;
    }

    public abstract boolean hasValidAddress();

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public int getLastPersonalNumber() {
        return lastPersonalNumber;
    }

    public static int getNextPersonalNumber() {
        return lastPersonalNumber + 1;
    }
}
