
package com.amela;

public class BookTester {
    void testConstructer(){
        Book b = new Book("9999", "programing", "pro", 50.75);
        
        System.out.println(b.isbn);
        System.out.println(b.title);
        System.out.println(b.type);
        System.out.println(b.price);
    }

    public static void main(String args[]) {
        BookTester tester = new BookTester();
        tester.testConstructer();
    }
}
