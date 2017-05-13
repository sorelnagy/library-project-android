package com.example.nagyp.library.data.util;

import android.os.StrictMode;
import android.util.Log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {


    public Connection databaseConnection;

    public DBConnection(){
            //Init the Databazse Connection ...
            init();
    }


    public void init(){

        try {
            Class.forName("com.mysql.jdbc.Driver");

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            String databaseHost = "jdbc:mysql://10.0.2.2:3306/library";
            String databaseUserName = "root";
            String databasePassword= "";

            this.databaseConnection = DriverManager.getConnection(databaseHost,databaseUserName,databasePassword);

            Log.d("database_connection", "connected");

        }
        catch ( SQLException err ) {
           Log.d("database_connection_err", err.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void closeConnection(){

        try {
            this.databaseConnection.close();
        }  catch ( SQLException err ) {
            Log.d("database_connection_err", err.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.databaseConnection;
    }


}
