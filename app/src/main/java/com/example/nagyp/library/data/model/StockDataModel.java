package com.example.nagyp.library.data.model;

/**
 * Created by nagyp on 5/13/2017.
 */

public class StockDataModel {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }



    private int id;
    private int book_id;
    private int quantity;


    public void StockDataModel(int id, int book_id, int quantity)
    {
        this.book_id = book_id;
        this.id = id;
        this.quantity = quantity;
        // this.created_at =created_at;
        //this.updated_at = updated_at;

    }

}
