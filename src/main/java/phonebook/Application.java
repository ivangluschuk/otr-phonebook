package phonebook;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] arg) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson("Иванов И.И.", new ArrayList<>(Arrays.asList("+8 800 2000 500", "+8 800 200 600")));
        phoneBook.addPerson("Петров П.П.", new ArrayList<>(Arrays.asList("+8 800 2000 700")));
        phoneBook.addPerson("Сидоров С.С.", new ArrayList<>(Arrays.asList("+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000")));
        phoneBook.addPerson("Воронов С.С.", new ArrayList<>());

        TerminalManager terminalProvider = new TerminalManager(phoneBook);
        terminalProvider.start();
    }
}
