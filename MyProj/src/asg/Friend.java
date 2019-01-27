package asg;

import java.util.Collection;
import java.util.ArrayList;


public class Friend {
	private Collection<Friend> friends;
	private String email;

	public Friend(String email) {
		this.email = email;
		this.friends = new ArrayList<Friend>();
	}

	public String getEmail() {
		return email;
	}

	public Collection<Friend> getFriends() {
		return friends;
	}

	public void addFriendship(Friend friend) {
		friends.add(friend);
		friend.getFriends().add(this);
	}

	private static ArrayList<String> checked = new ArrayList<>();
	
	public boolean canBeConnected(Friend friend) {
		if(checked.contains(email)) {
			return false;
		}
		checked.add(email);				
		for (Friend f : getFriends()) {
			if (f.getEmail().equals(friend.getEmail())) {
				return true;
			} else if (f.canBeConnected(friend)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Friend a = new Friend("A");
		Friend b = new Friend("B");
		Friend c = new Friend("C");

		a.addFriendship(b);
		b.addFriendship(c);

		System.out.println(a.canBeConnected(c));
	}
}