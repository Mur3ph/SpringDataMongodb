package ie.murph.dto;

import java.util.List;

import ie.murph.domain.User;

public class UserListDto {

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
