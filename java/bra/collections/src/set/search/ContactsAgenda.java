package src.set.search;

import java.util.HashSet;
import java.util.Set;

public class ContactsAgenda {
	private Set<Contact> contactSet;

	public ContactsAgenda() {
		this.contactSet = new HashSet<>();
	}
	
	public void addContact(String name, int number) {
		contactSet.add(new Contact(name, number));
	}
	
	public void displayContacts()
	{
		System.out.println(contactSet);
	}
	
	public Set<Contact> searchByName(String name) {
		Set<Contact> contactsByName = new HashSet<>();
		for(Contact c : contactSet) {
			if(c.getName().startsWith(name)) {
				contactsByName.add(c);
			}
		}
		return contactsByName;
	}
	
	public Contact updateContactNumber(String name, int newNumber) {
		Contact updatedContact = null;
		for(Contact c : contactSet) {
			if (c.getName().equalsIgnoreCase(name)) {
				c.setNumber(newNumber);
				updatedContact = c;
				break;
			}
		}
		return updatedContact;
	}
	
	public static void main(String[] args) {

	    ContactsAgenda contactsAgenda = new ContactsAgenda();
	    System.out.print("Initial agenda: ");
	    contactsAgenda.displayContacts();

	    contactsAgenda.addContact("Jane", 123456789);
	    contactsAgenda.addContact("Maria", 987654321);
	    contactsAgenda.addContact("Maria Fernandes", 55555555);
	    contactsAgenda.addContact("Ana", 88889999);
	    contactsAgenda.addContact("Fernando", 77778888);
	    contactsAgenda.addContact("Carolina", 55555555);

	    System.out.println("\nAfter adding contacts:");
	    contactsAgenda.displayContacts();
	    
	    System.out.print("\nSearch by name 'Maria':");
	    System.out.println(contactsAgenda.searchByName("Maria"));

	    Contact updatedContact = contactsAgenda.updateContactNumber("Carolina", 44443333);
	    System.out.println("\nUpdated contact: " + updatedContact);

	    System.out.println("\nContacts in the agenda after update:");
	    contactsAgenda.displayContacts();
	  }
		
	
}
