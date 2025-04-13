package src.set;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
	private Set<Guest> guestSet;
	
	private GuestSet() {
		this.guestSet = new HashSet<>();
	}
	
	public void addGuest(String name, int invitationCode) {
		guestSet.add(new Guest(name, invitationCode));
		
	}
	
	public void removeGuestByInvitationCode(int invitationCode) {
		Guest guestToRemove = null;
		for(Guest g : guestSet) {
			if(g.getInvitationCode() == invitationCode) {
				guestToRemove = g;
				break;
			}
		}
		guestSet.remove(guestToRemove);
	}
	
	public int countGuests() {
		return guestSet.size();
	}
	
	public void showGuests() {
		System.out.println(guestSet);
	}
	
	public static void main(String[] args) {
		GuestSet guestSet = new GuestSet();
		System.out.println("There are " + guestSet.countGuests() + " guests within the Guest Set before inclusion");
		
		guestSet.addGuest("Alice", 1234);
		guestSet.addGuest("Bob", 1235);
		guestSet.addGuest("Charlie", 1235);
		guestSet.addGuest("David", 1236);	
		System.out.println("There are " + guestSet.countGuests() + " guests within the Guest Set after inclusion");
		guestSet.showGuests();		
				
		guestSet.removeGuestByInvitationCode(1235);
		System.out.println("There are " + guestSet.countGuests() + " guests within the Guest Set after removal");
		guestSet.showGuests();
	}
}
