package com.irinayanushkevich.practice.task5.creational.singleton_project;

public class PhoneBook {

    private static PhoneBook phoneBook;
    private static String phoneBookFile = "\n~ PhoneBook ~\n";

    public static synchronized PhoneBook getPhoneBook() {
        if (phoneBook == null) {
            phoneBook = new PhoneBook();
        }
        return phoneBook;
    }

    private PhoneBook() {
    }

    public void addContact(String contact) {
        phoneBookFile += contact + "\n";
    }

    public void showAllContacts() {
        System.out.println(phoneBookFile);
    }
}
