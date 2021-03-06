package ie.murph.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {

	    @Id
	    private String id;

	    private String firstname;

	    private String lastname;

	    public User() {}

	    public User(String firstName, String lastName) {

	        this.firstname = firstName;

	        this.lastname = lastName;

	    }

	public String getId() {

	return id;

	}

	public void setId(String id) {

	this.id = id;

	}

	public String getFirstName() {

	return firstname;

	}

	public void setFirstName(String firstName) {

	this.firstname = firstName;

	}

	public String getLastName() {

	return lastname;

	}

	public void setLastName(String lastName) {

	this.lastname = lastName;

	}
	
}
