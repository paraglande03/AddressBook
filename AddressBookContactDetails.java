public class AddressBookContactDetails {

    private String firstName;
    private String lastName;
    private String Address;
    private String city;
    private String state;
    private int zip;
    private long phone;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
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

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {

        return phone;
    }



    public String toString() {
      return "AddressBookContactDetails{" +
            "firstName='" + firstName + '\'' +      ", lastName='" + lastName + '\'' +
             ", Address='" + Address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone=" + phone +
                '}';
    }
}
