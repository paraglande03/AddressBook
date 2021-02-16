import java.util.*;

public class AdressBookOperation implements AddressBookInterface {

    HashMap<Long, AddressBookContactDetails> addressBookContainer = new HashMap<Long, AddressBookContactDetails>();
    Scanner input = new Scanner(System.in);

     HashMap<Long,AddressBookContactDetails > save(long phoneNumber, AddressBookContactDetails newAddressBook){

         addressBookContainer.put(phoneNumber,newAddressBook);
         return addressBookContainer;
     }


  public AddressBookContactDetails newAddressBook(){
      AddressBookContactDetails newAddressBook = new AddressBookContactDetails();
      System.out.println("Enter the First Name");
      String firstName = input.next();
      System.out.println("Enter the Last Name");
      String lastName = input.next();
      System.out.println("Enter The Address");
      String address = input.next();
      System.out.println("Enter the city");
      String city = input.next();
      System.out.println("Enter the state");
      String state = input.next();
      System.out.println("Enter the zip Code");
      int zip = input.nextInt();
      System.out.println("Enter the Phone number");
      long phone = input.nextLong();
      newAddressBook.setFirstName(firstName);
      newAddressBook.setLastName(lastName);
      newAddressBook.setAddress(address);
      newAddressBook.setCity(city);
      newAddressBook.setState(state);
      newAddressBook.setZip(zip);
      newAddressBook.setPhone(phone);


      return newAddressBook;



  }
    public HashMap<Long, AddressBookContactDetails> updateValue(long key, AddressBookContactDetails Addressbook) {
        if (addressBookContainer.containsKey(key)==false){
            System.out.println("Key not Found");

        }else if (addressBookContainer.containsKey(key)==true){
            addressBookContainer.put(key, newAddressBook());
            System.out.println("values updated");

        }
        return addressBookContainer;
    }


    public void deleteAddress(long key) {
        if (addressBookContainer.containsKey(key) == false) {
            System.out.println("Invalid Key !!!!!!!");
        } else {
            addressBookContainer.remove(key);
            System.out.println(key + " Deleted Successfully");

        }

    }


}


