package phonebook;

import java.util.ArrayList;
import java.util.Scanner;

final class TerminalManager {

    private final PhoneBook phoneBook;

    TerminalManager(final PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    void start() {
        getName();
    }

    private void getName() {

        System.out.println("\nTo exit the program enter \"exit\"\n");
        System.out.println("Enter the name:");
        System.out.print(">");

        final Scanner scanner = new Scanner(System.in);
        final var name = scanner.nextLine();

        if (name.equals("exit")) System.exit(0);

        if (!phoneBook.ifPersonExist(name)) {
            System.out.println("These is no such person in the phone book");
            getName();
            return;
        }

        final var phones = phoneBook.getPhones(name);

        if (phones.size() != 0) {
            printPhones(name, phones);
        } else {
            System.out.println("There is no phones for " + name + ":\n");
            getName();
        }
    }

    private void printPhones(final String name, final ArrayList<String> phones) {
        System.out.println("\nPhone numbers of " + name + ":\n");

        for (int i = 0; i < phones.size(); i++) {
            System.out.println(i + 1 + ". " + phones.get(i));
        }
    }
}
