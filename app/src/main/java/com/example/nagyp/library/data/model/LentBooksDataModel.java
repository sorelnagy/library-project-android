package com.example.nagyp.library.data.model;

/**
 * Created by nagyp on 5/13/2017.
 */

public class LentBooksDataModel {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getInhouse() {
        return inhouse;
    }

    public void setInhouse(int inhouse) {
        this.inhouse = inhouse;
    }



    private int id;
    private int user_id;
    private int book_id;
    private int days;
    private int inhouse;


    public void BooksDataModel(int id, int user_id, int book_id, int days, int inhouse)
    {
        this.id=id;
        this.user_id = user_id;
        this.book_id = book_id;
        this.days = days;
        this.inhouse = inhouse;

    }

}
