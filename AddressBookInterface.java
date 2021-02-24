
import java.util.HashMap;
public interface AddressBookInterface {

    AddressBookContactDetails newAddressBook();

     void printAllDetails();

     HashMap<Long, AddressBookContactDetails> updateValue(long key, AddressBookContactDetails AddressBook);

     void deleteAddress(long key);
     void sortByfirstName();
    public void sortByZipCode();

    public void searchByCity(String city, AddressBookContactDetails addressBook);

    public void searchByState(String inputState, AddressBookContactDetails addressBook);



}