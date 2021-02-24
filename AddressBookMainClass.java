
import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMainClass {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scan = new Scanner(System.in);
        AddressBookContactDetails contactPerson;
     AddressBookOperations addressBookOperation = new AddressBookOperations();
//        AddressBookInterface addressBookOperation = new AddressBookInterface() {
//            @Override
//            public AddressBookContactDetails newAddressBook() {
//                return null;
//            }
//
//            @Override
//            public void printAllDetails() {
//
//            }
//
//            @Override
//            public HashMap<Long, AddressBookContactDetails> updateValue(long key, AddressBookContactDetails AddressBook) {
//                return null;
//            }
//
//            @Override
//            public void deleteAddress(long key) {
//
//            }
//        };

        boolean terminate = false;
        while (terminate != true) {
            System.out.println("1: To add new Contact person");
            System.out.println("2: To Print all information");
            System.out.println("3: To Update the existing information");
            System.out.println("4: To Delete the contact");



            int option = scan.nextInt();
            switch (option) {
                case 1:
                    contactPerson = addressBookOperation.newAddressBook();
                   System.out.println(addressBookOperation.save(contactPerson.getPhone(), contactPerson));
                    break;
                case 2:
                    addressBookOperation.printAllDetails();
                    break;
                case 3:
                    System.out.println("enter the Phone Number to update");
                    long key = scan.nextLong();
                    contactPerson = addressBookOperation.newAddressBook();
                    addressBookOperation.updateValue(key, contactPerson);
                    break;
                case 4:
                    System.out.println("Enter the Phone Number to the contact");
                    long phoneToDelete = scan.nextLong();
                    addressBookOperation.deleteAddress(phoneToDelete);
                    break;
                case 5:
                    addressBookOperation.sortByfirstName();
                    break;

                default:
                    System.out.println("Please select valid option");
                    break;
            }

        }

    }
}
