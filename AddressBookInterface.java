import java.util.HashMap;

public interface AddressBookInterface {
    public AddressBookContactDetails newAddressBook();



    public <AddressBook> HashMap<Long, AddressBookContactDetails> updateValue(long key ,AddressBookContactDetails AddressBook);

    public void deleteAddress(long key);


}

