public class ContactManager {

    Contact[] contacts;
    int contactCount;

    public ContactManager(int fieldsAvailable){
        this.contacts = new Contact[fieldsAvailable];
    }

    public void addContact(Contact contact){
        contacts[contactCount] = contact;
        contactCount++;
    }

    public Contact getContactByName(String name) {

        for (int index = 0 ; index < contactCount; index++){
            if (contacts[index].name.equals(name)) return contacts[index];
        }

        return null;
    }
}
