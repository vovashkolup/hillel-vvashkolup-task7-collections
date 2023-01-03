package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {
    private List<Contact> contactList;

    public PhoneBook(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public boolean isEmpty(Contact contact) {
        return contact.getPhone() == null;
    }

    public boolean isValid(Contact contact) {
        String regex = "^[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contact.getPhone());
        boolean isFound = matcher.find();
        if (isFound) {
            System.out.println("Number is valid");
            return true;
        } else {
            System.out.println("Number is invalid");
            return false;
        }
    }

    public boolean isVodafone(Contact contact) {
        String regex = "^[0][9][5]{1}[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contact.getPhone());
        boolean isFound = matcher.find();
        if (isFound) {
            System.out.println("Number is Vodafone");
            return true;
        } else {
            System.out.println("Number is not Vodafone");
            return false;
        }
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
