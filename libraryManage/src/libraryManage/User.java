package libraryManage;

import java.time.LocalDate;

public class User {
    private String name;
    private String email;
    private String memberNumber;
    private LocalDate registrationDate;
    private boolean sanctioned;
    private LocalDate sanctionEndDate;
    
    public User(String name, String email, String memberNumber, LocalDate registrationDate) throws InvalidUserException {
       setName(name);
       setEmail(email);
       setMemberNumber(memberNumber);
       setRegistrationDate(registrationDate);
       setSanctioned(false);
       setSanctionEndDate(null);
    }
    
    public void sanction(int days) {
    	sanctionEndDate=LocalDate.now().plusDays(days);
    }

    public boolean isSanctioned() {
       return sanctioned;
    }
    public void liftSanction() {
       setSanctioned(false);
       setSanctionEndDate(null);
    }
    
    @Override
    public String toString() {
       return "User [name=" + name + ", email=" + email + ", membernumber=" + memberNumber + ", registrationDate="
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

    public void setEmail(String email) throws InvalidUserException {
    	String reg=".+@\\w+\\.[a-z]{2,3}";
       if(email.matches(reg)){
            this.email = email;
        } else {
            throw new InvalidUserException("Email format is wrong");
        }
    }

    public String getMemberNumber() {
       return memberNumber;
    }

    public void setMemberNumber(String memberNumber) throws InvalidUserException {
    	String reg="SOC[0-9]{5}";
    	if (memberNumber.matches(reg)) {
        	this.memberNumber = memberNumber;
    	}else {
    		throw new InvalidUserException("Member number format is incorrect");
    	}
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
