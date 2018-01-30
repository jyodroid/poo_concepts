public class Main {

    private static final int TOTAL_CONTACTS_FIELDS_AVAILABLE = 10;

    public static void main(String[] args) {
        Contact akira = new Contact("Akira", "5th street manchil", "55667788");
        Contact tomoe = new Contact("Tomoe", "9th street manchil", "0099887766");

        ContactManager friends = new ContactManager(TOTAL_CONTACTS_FIELDS_AVAILABLE);
        friends.addContact(akira);
        friends.addContact(tomoe);

        System.out.println(friends.contactCount);
        System.out.printf("Tomoe's address is %s", friends.getContactByName("Tomoe").address);
    }
}
