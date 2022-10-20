package com.irinayanushkevich.practice.task5.singleton_project;

public class SinglePhoneBookRunner {

    public static void main(String[] args) {

        PhoneBook.getPhoneBook().addContact("Ivanov Ivan Ivanovich +3752988888888");
        PhoneBook.getPhoneBook().addContact("Petrov Piotr Petrovich +375297777777");
        PhoneBook.getPhoneBook().addContact("Maksimov Maksim Maksimovich +375296666666");
        PhoneBook.getPhoneBook().showAllContacts();
    }
}
