package entities;

import java.util.Date;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirthYear;
	private String identityNumber;
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String firstName, String lastName, int dateOfBirthYear, String identityNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthYear = dateOfBirthYear;
		this.identityNumber = identityNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public void setDateOfBith(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
}
