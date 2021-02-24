

public class AddressBookContactDetails {

    private String firstName;
    private String lastName;
    private String Address;
    private String city;
    private String state;
    private int zip;
    private long phone;

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFisrtname(){
        return firstName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "AddressBook{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", Address='"
                + Address + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' + ", zip=" + zip + ", phone="
                + phone + '}';
    }
}