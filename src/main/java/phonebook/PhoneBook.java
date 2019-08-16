package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;

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

        if (phoneBook.containsKey(name)) {
            if (phoneBook.get(name) != null) {
                return phoneBook.get(name);
            } else {
                return new ArrayList<>();
            }
        }

        throw new NoSuchElementException();
    }
}
