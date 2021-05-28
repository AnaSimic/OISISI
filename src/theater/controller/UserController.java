package theater.controller;

import theater.GlobalState;
import theater.model.User;

public class UserController {

	private GlobalState state = GlobalState.getInstance();

	public boolean register(User u) {
		// check if we already have that username
		for (User existing : state.getUsers()) {
			if (existing.getUsername().equals((u.getUsername()))) {
				return false;// return false if we have
			}
		}
		// else register them and return true
		state.getUsers().add(u);
		return true;
	}

	
}
