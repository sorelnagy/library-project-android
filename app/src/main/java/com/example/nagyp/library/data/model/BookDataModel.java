package com.example.nagyp.library.data.model;

/**
 * Created by nagyp on 5/13/2017.
 */

public class BookDataModel {

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRegister_code() {
        return register_code;
    }

    public void setRegister_code(String register_code) {
        this.register_code = register_code;
    }

    public int getAccess_level() {
        return access_level;
    }

    public void setAccess_level(int access_level) {
        this.access_level = access_level;
    }



    private int book_id;
    private String name;
    private String author;
    private String register_code;
    private int access_level;


    public void BookDataModel(int book_id, String name, String author, String register_code, int access_level)
    {
        this.book_id = book_id;
        this.name = name;
        this.author = author;
        this.register_code = register_code;
        this.access_level = access_level;
       // this.created_at =created_at;
        //this.updated_at = updated_at;

    }

}
