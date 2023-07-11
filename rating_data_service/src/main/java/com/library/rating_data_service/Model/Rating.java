package com.library.rating_data_service.Model;

public class Rating {

    private int rating;
    private String bookId;

    public Rating() {
    }

    public Rating(int rating, String bookId) {
        this.rating = rating;
        this.bookId = bookId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
