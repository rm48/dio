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