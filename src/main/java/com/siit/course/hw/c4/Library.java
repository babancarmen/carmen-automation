package com.siit.course.hw.c4;

public class Library {

    public static void main(String[] args) {
        Author author = new Author("JRR Tolkien", "jrrtolkien@email.com");
        Book book = new Book("Lord of the Rings", 2005, author, 49.99);
        String msg = "Book " + book.getName() + " ("+ book.getPrice() + " RON), by " + book.getAuthor().getName() + ", published in " +  book.getYear();
        System.out.println(msg);
    }
}
