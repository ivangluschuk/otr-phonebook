package phonebook;

import java.util.ArrayList;
import java.util.HashMap;

final class PhoneBook {
    private final HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    void addPerson(final String name, final ArrayList<String> phones) {

        if (phoneBook.containsKey(name)) {
           phoneBook.get(name).addAll(phones);
        } else {
            phoneBook.put(name, new ArrayList<>(phones));
        }
    }

    ArrayList<String> getPhones(final String name) {

        if (phoneBook.get(name) != null) {
            return phoneBook.get(name);
        }

        return new ArrayList<>();
    }

    boolean ifPersonExist(final String name) {
        return phoneBook.containsKey(name);
    }
}
