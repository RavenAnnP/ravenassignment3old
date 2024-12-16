package com.coderscampus.assignment3;

public class UserService {
 
    public User[] loadUsers() {
        return new User[] {
            new User("test@email.com", "passwordTest!1", "Test User"),
            new User("another@user.com", "asdfasdf", "Another User"),
            new User("john.doe@mydomain.net", "Hdk398jf!", "John Doe"),
            new User("jane.doe@myotherdomain.com", "sunrise-sunset", "Jane Doe")
        };
    }

    public User validateLogin(String email, String password, User[] users) {
        for (User  user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user; 
            }
        }
        return null;
    }

	public User[] loadUsers1() {
		// TODO Auto-generated method stub
		return null;
	}
}