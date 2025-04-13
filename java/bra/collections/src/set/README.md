# Collections: Set
## Basic Set Operations
#### 1. Set of Guests
Create a class called "GuestSet" that has a set of objects of type "Guest" as attributes. Each guest has attributes such as name and invitation code. Implement the following methods:

  -  `addGuest(String name, int invitationCode)`: Adds a guest to the set.
  -  `removeGuestByInvitationCode(int invitationCode)`: Removes a guest from the set based on the invitation code.
  -  `countGuests()`: Counts the total number of guests in the Set.
  -  `showGuests()`: Displays all the guests in the set.
  
**Saída:**

```
There are 0 guests within the Guest Set before inclusion
There are 3 guests within the Guest Set after inclusion
[Guest [name=Alice, invitationCode=1234], Guest [name=Bob, invitationCode=1235], Guest [name=David, invitationCode=1236]]
There are 2 guests within the Guest Set after removal
[Guest [name=Alice, invitationCode=1234], Guest [name=David, invitationCode=1236]]
```

## Search in Set
#### 1. Contacts Agenda

Create a class called "ContactsAgenda" that has a set of objects of type "Contact" as attributes. Each contact has attributes such as name and phone number. Implement the following methods:

  -  `addContact(String name, int number)`: Adds a contact to the agenda.
  -  `displayContacts()`: Displays all contacts in the agenda.
  -  `searchByName(String name)`: Searches for contacts by name and returns a set with the contacts found.
  -  `updateContactNumber(String name, int newNumber)`: Updates the phone number of a specific contact.

**Saída:**

```  
Initial agenda: []

After adding contacts:
[Maria Fernandes - 55555555, Maria - 987654321, Fernando - 77778888, Jane - 123456789, Ana - 88889999, Carolina - 55555555]

Search by name 'Maria':[Maria Fernandes - 55555555, Maria - 987654321]

Updated contact: Carolina - 44443333

Contacts in the agenda after update:
[Maria Fernandes - 55555555, Maria - 987654321, Fernando - 77778888, Jane - 123456789, Ana - 88889999, Carolina - 44443333]
```