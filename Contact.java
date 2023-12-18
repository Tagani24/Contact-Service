package Project1;


public class Contact {
   
    @SuppressWarnings("unused")
	private String lastName;
    @SuppressWarnings("unused")
	private String phone;
    @SuppressWarnings("unused")
	private String address;
	private String contactId;

    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        this.contactId = contactId;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Getters and setters for each field

    // Example of getter for contactId
    public String getContactId() {
        return contactId;
    }

	public void setFirstName(String value) {
		// TODO Auto-generated method stub
		
	}

	public void setLastName(String value) {
		// TODO Auto-generated method stub
		
	}

	public void setPhone(String value) {
		// TODO Auto-generated method stub
		
	}

	public void setAddress(String value) {
		// TODO Auto-generated method stub
		
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

    // Other getters and setters...

}