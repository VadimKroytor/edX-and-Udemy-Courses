package MobilePhoneClass;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;



    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        boolean doesNotExist = true;

        for (Contact c : myContacts) {
            if (c.getName() == contact.getName()) {
                doesNotExist = false;
                break;
            }
        }
        if (doesNotExist) {
            myContacts.add(contact);

        }
        return doesNotExist;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        boolean doesExist = false;

        for (Contact c : myContacts) {
            if (c.getName() == oldContact.getName() && (findContact(newContact) == -1)) {
                doesExist = true;
                int position = myContacts.indexOf(oldContact);
                myContacts.remove(position);
                myContacts.add(position, newContact);
                break;
            }
        }
        return doesExist;
    }

    public boolean removeContact(Contact contact) {
        boolean doesExist = false;
        for (Contact c : myContacts) {
            if (c.getName() == contact.getName()) {
                myContacts.remove(myContacts.indexOf(contact));
                doesExist = true;

                break;
            }
        }
        return doesExist;
    }

    private int findContact(Contact contact) {
        int retVal = -1;

        for (Contact c : myContacts) {
            if (c.getName() == contact.getName()) {
                retVal = myContacts.indexOf(contact);
                break;
            }
        }
        return retVal;
    }

    private int findContact(String myNumber) {
        int retVal = -1;

        for (Contact c : myContacts) {
            if (myNumber == c.getPhoneNumber()) {
                retVal = myContacts.indexOf(c);
            }
        }
        return retVal;
    }

    public Contact queryContact(String name) {
        Contact retVal = null;
        for (Contact c : myContacts) {
            if (name == c.getName()) {
                retVal = c;
                break;
            }
        }
        return retVal;
    }

    public void printContacts() {
        String s = "Contact List:\n";
        int counter = 1;
        for (Contact c : myContacts) {
            if (counter == myContacts.size()) {
                s += counter++ + ". " + c.getName() + " -> "
                        + c.getPhoneNumber();
            }
            else {
                s += counter++ + ". " + c.getName() + " -> "
                        + c.getPhoneNumber() + "\n";
            }
        }

        System.out.println(s);
    }

}
