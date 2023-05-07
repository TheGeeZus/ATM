package pr.com;

public class Person {

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isIsEmployee() {
        return this.isEmployee;
    }

    public void setIsEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }

    public Person(String firstName, String lastName, String address, String accountNumber, boolean isEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.accountNumber = accountNumber;
        this.isEmployee = isEmployee;
    }

    public Person(String firstName, String lastName, String address, boolean isEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.isEmployee = isEmployee;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", isEmployee=" + isEmployee + '}';
    }

    public Person() {
    }
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String accountNumber;
    protected boolean isEmployee;
}
