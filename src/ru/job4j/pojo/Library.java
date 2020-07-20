package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book deadzone = new Book("Dead Zone", 320);
        Book greenmile = new Book("Green Mile", 460);
        Book shining = new Book("Shining", 410);
        Book clean = new Book("Clean Code", 0);
        Book[] books = new Book[4];
        books[0] = deadzone;
        books[1] = greenmile;
        books[2] = shining;
        books[3] = clean;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println("The " + b.getTitle() + " book has " + b.getPages() + " pages");
        }
        System.out.println();
        System.out.println("Swapping books 1 and 4");
        System.out.println();
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println("The " + b.getTitle() + " book has " + b.getPages() + " pages");
        }
        System.out.println();
        System.out.println("Print only \"Clean code\"");
        System.out.println();
        for (int i = 0; i < books.length; i++) {
            Book c = books[i];
            if (c.getTitle().equals("Clean Code")) {
                System.out.println("Книга с искомым названием - " + c.getTitle() + ". В ней " + c.getPages() + " страниц");
            }
        }
    }
}
