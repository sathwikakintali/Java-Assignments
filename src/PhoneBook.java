import java.util.*;

public class PhoneBook {
    private TreeMap<String, String> contacts;

    public PhoneBook() {
        contacts = new TreeMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Contact added: " + name + " (" + phoneNumber + ")");
    }

    public void removeContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    public String searchContact(String name) {
        return contacts.getOrDefault(name, "Contact not found");
    }

    public void displayAllContacts() {
        System.out.println("Phone Book Contacts:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Alice", "123-456-7890");
        phoneBook.addContact("Bob", "987-654-3210");
        phoneBook.addContact("Charlie", "555-123-4567");

        phoneBook.displayAllContacts();

        System.out.println("Search for Bob: " + phoneBook.searchContact("Bob"));
        System.out.println("Search for Eve: " + phoneBook.searchContact("Eve"));

        phoneBook.removeContact("Charlie");
        phoneBook.displayAllContacts();
    }
}
