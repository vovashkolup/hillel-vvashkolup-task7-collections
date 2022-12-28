package phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contactList;

    public PhoneBook(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void add(Contact contact) {
        contactList.add(contact);
    }

    public Contact find(String name) {
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                Contact temp = contact;
                System.out.println("Returning Contact: " + name);
                System.out.println(contact);
                return temp;
            }
        }
        System.out.println("Returning null");
        return null;
    }

    public List<Contact> findAll(String name) {
        ArrayList<Contact> requestList = new ArrayList<>();
        for (Contact contact : contactList) {
            if (contact.getName().equals(name)) {
                requestList.add(contact);
            }
        }

        System.out.println(requestList);
        return requestList;
    }


    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }


}
