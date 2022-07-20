package FileIO.Uebung18;

public class Address {
    private String firstName;
    private String lastName;
    private String mobilNumber;
    private String email;

    public Address(String firstName, String lastName, String mobilNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobilNumber = mobilNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobilNumber() {
        return mobilNumber;
    }

    public void setMobilNumber(String mobilNumber) {
        this.mobilNumber = mobilNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
