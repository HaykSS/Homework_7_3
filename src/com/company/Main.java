package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Russel", "Winderland");

        author1.toPrint();

        Book book1 = new Book("Developing Java Software",79.75, author1.getFirstName());

        System.out.println("title: " + book1.getTitle() + " authored by " + book1.getAuthor() + " price " + book1.getPrice());



    }
}
