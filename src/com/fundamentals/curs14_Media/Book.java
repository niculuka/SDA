package com.fundamentals.curs14_Media;

public class Book extends Media{
    String authorName;
    int pagesNumber;

    public Book(String authorName, String name, int pagesNumber) {
        super(name);

        this.authorName = authorName;
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                "Bookname: " + getName() +
                "Ranking: " + getRanking() +
                ", pagesNumber=" + pagesNumber +
                '}';
    }
}
