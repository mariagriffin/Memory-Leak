//AddressBook.java
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
 
    private Map <User, Address> leakingMap = new HashMap <User, Address>();
 
    /**
     * Keeps adding user and their address infinitely.
     */
    public void addAddresses() {
 
        for (int counter = 0; ; ++counter) {
 
            User user = new User("Elvis","Presley");
            Address address = new Address("SanFrancisco","CA","USA");
            leakingMap.put(user, address);
            System.out.println("added:" + user);
        }
    }
 
    public static void main(String args[]) {
 
        new AddressBook().addAddresses();
    }
}
 
