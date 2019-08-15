package phonebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

final class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    void addPerson(final String name, final String... phones) {

        if (phoneBook.containsKey(name)) {
           phoneBook.get(name).addAll(Arrays.asList(phones));
        } else {
            phoneBook.put(name, new ArrayList<>(Arrays.asList(phones)));
        }
    }

    String[] getPhones(final String name) {

        if (phoneBook.get(name) != null) {
            return phoneBook.get(name).toArray(new String[0]);
        }

        return new String[0];
    }

    boolean ifPersonExist(final String name) {
        return phoneBook.containsKey(name);
    }
}
