package Project1;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class ContactService {

	private Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        // Implement logic to add a contact
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        // Implement logic to delete a contact
        contacts.remove(contactId);
    }

    public void updateContact(String contactId, String field, String value) {
        // Implement logic to update contact fields based on the provided field and value
        Contact contact = contacts.get(contactId);

        if (contact != null) {
            switch (field) {
                case "firstName":
                    contact.setFirstName(value);
                    break;
                case "lastName":
                    contact.setLastName(value);
                    break;
                case "phone":
                    contact.setPhone(value);
                    break;
                case "address":
                    contact.setAddress(value);
                    break;
                // Handle other fields if needed
            }
        }
    }

	public Object getContact(String string) {
		// TODO Auto-generated method stub
		return null;
	}

    // Other methods as needed

}