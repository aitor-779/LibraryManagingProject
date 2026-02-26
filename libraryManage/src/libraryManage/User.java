package libraryManage;

import java.time.LocalDate;

public class User {
	private String name;
	private String email;
	private int membernumber;
	private LocalDate registrationDate;
	private boolean sanctioned;
	private LocalDate sanctionEndDate;
	
	public User(String name, String email, int membernumber, LocalDate registrationDate, boolean sanctioned, LocalDate sanctionEndDate) {
		this.name=name;
		this.email=email;
		this.membernumber=membernumber;
		this.registrationDate=registrationDate;
		this.sanctioned=sanctioned;
		this.sanctionEndDate=sanctionEndDate;
	}

	
	
	public boolean isSanctioned() {
		return sanctioned;
		
	}
	public void liftSanction() {
		sanctioned=false;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", membernumber=" + membernumber + ", registrationDate="
				+ registrationDate + ", sanctioned=" + sanctioned + ", sanctionEndDate=" + sanctionEndDate + "]";
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMembernumber() {
		return membernumber;
	}

	public void setMembernumber(int membernumber) {
		this.membernumber = membernumber;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public void setSanctioned(boolean sanctioned) {
		this.sanctioned = sanctioned;
	}

	public LocalDate getSanctionEndDate() {
		return sanctionEndDate;
	}

	public void setSanctionEndDate(LocalDate sanctionEndDate) {
		this.sanctionEndDate = sanctionEndDate;
	}
	
}
