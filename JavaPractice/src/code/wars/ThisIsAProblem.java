package code.wars;

public class ThisIsAProblem {
    public String firstName;
    public String lastName;
    public String fullName;

    public ThisIsAProblem(String first, String last) {
	this.firstName = first;
	this.lastName = last;
	this.fullName = firstName + " " + lastName;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFullName() {
	return fullName;
    }

    public void setFullName(String fullName) {
	this.fullName = fullName;
    }
}
