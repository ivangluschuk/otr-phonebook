package phonebook;

import java.util.ArrayList;

public class Application {
    public static void main(String[] arg) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPerson("Иванов И.И.", "+8 800 2000 500", "+8 800 200 600" );
        phoneBook.addPerson("Петров П.П.", "+8 800 2000 700");
        phoneBook.addPerson("Сидоров С.С.", "+8 800 2000 800", "+8 800 2000 900", "+8 800 2000 000");

        TerminalProvider terminalProvider = new TerminalProvider(phoneBook);
        terminalProvider.start();
    }
}
