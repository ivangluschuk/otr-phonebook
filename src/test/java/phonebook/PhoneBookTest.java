package phonebook;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @Before
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void getPhonesSuccess() {
        phoneBook.addPerson("Иванов И.И.", new ArrayList<>(Arrays.asList("+8 800 555 35 35", "+ 8 800 111 11 11")));
        var result = phoneBook.getPhones("Иванов И.И.");
        var expected = new ArrayList<>(Arrays.asList("+8 800 555 35 35", "+ 8 800 111 11 11"));

        Assert.assertEquals(result, expected);
    }

    @Test
    public void getEmptyPhoneListPersonPhonesSuccess() {
        phoneBook.addPerson("Иванов И.И.", new ArrayList<>());
        var result = phoneBook.getPhones("Иванов И.И.");
        var expected = new ArrayList<>();

        Assert.assertEquals(result, expected);
    }

    @Test(expected = NoSuchElementException.class)
    public void getUnexistedPersonPhonesFail() {
        phoneBook.getPhones("Иванов И.И.");
    }
}
