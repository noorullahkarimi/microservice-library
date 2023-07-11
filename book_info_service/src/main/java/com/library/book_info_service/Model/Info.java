package com.library.book_info_service.Model;

public class Info {
    private String name ;
    private String bookId;

    public Info() {
    }

    public Info(String name, String bookId) {
        this.name = name;
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
