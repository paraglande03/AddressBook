import java.util.Scanner;

public class AddressBookMainClass {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book");
        Scanner Scan= new Scanner(System.in);
        AddressBookContactDetails contactPerson=new AddressBookContactDetails();
        AdressBookOperation adressBookOperation=new AdressBookOperation();

        boolean terminate = false;
        while(terminate!=true){
            System.out.println("1: To add new address");
            System.out.println("2: To edit number");
            System.out.println("3: To delete number");

            int option= Scan.nextInt();
            switch (option){

                case 1:
                    contactPerson=adressBookOperation.newAddressBook();
                    System.out.println(adressBookOperation.save(contactPerson.getPhone(), contactPerson));
                    break;


                case 2:
                    System.out.println("Enter details to update contact ");
                    long key= Scan.nextLong();
                    contactPerson=adressBookOperation.newAddressBook();
                    adressBookOperation.updateValue(key,contactPerson);
                    break;
                case 3:
                    System.out.println("Enter the details to delete");
                    long phoneToDelete = Scan.nextLong();
                    adressBookOperation.deleteAddress(phoneToDelete);
                    break;

                default:
                    System.out.println("please select a valid option");
                    break;
                }
        }
    }

}

