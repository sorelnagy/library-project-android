package com.example.nagyp.library.data.gateway;

import com.example.nagyp.library.data.model.UserDataModel;
import com.example.nagyp.library.data.util.DBConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

class UserDataGateway
{

    private DBConnection databaseConnection;


    public UserDataGateway(){
        this.databaseConnection = new DBConnection();
     }

    //Add a user
    public Boolean add(UserDataModel user)
    {

        try {

            //The query ...
            String query = "INSERT INTO users (username, password, display_name, access_level) VALUES(?,?,?,?)";

            //The statement Connection (java)
            PreparedStatement preparedStatement = databaseConnection.getConnection().prepareStatement(query);

            //Set the values ...
            preparedStatement.setString (1, user.getUsername());
            preparedStatement.setString (2, user.getPassword());
            preparedStatement.setString (3, user.getDisplay_name());
            preparedStatement.setInt   (4, user.getAccess_level());

            //Execute the query
            preparedStatement.execute();

            //If inserted ...
            return true;

        }catch (Exception e) {
            return false;
        }

    }

    //Get the user by user_id
    public UserDataModel read(int userId)
    {

        String query = "SELECT * FROM users WHERE user_id = ?  LIMIT 1";
        UserDataModel userToRead = null;

        try {

            PreparedStatement preparedStatement = databaseConnection.getConnection().prepareStatement(query);
            ResultSet resultSet = null;

            preparedStatement.setInt (1, userId);

            resultSet=preparedStatement.executeQuery(query);

            while (resultSet.next())
            {
                userToRead = new UserDataModel(resultSet.getInt("user_id"),resultSet.getString("username"),resultSet.getString("password"),resultSet.getString("display_name"),resultSet.getInt("access_level"));

            }

            preparedStatement.close();
            return userToRead;

        }catch (Exception e) {

            return userToRead;
        }


    }

    //Get the user by username
    public UserDataModel read(String username)
    {

        String query = "SELECT * FROM users WHERE username = ?  LIMIT 1";
        UserDataModel userToRead = null;

        try {

            PreparedStatement preparedStatement = databaseConnection.getConnection().prepareStatement(query);
            ResultSet resultSet = null;

            preparedStatement.setString (1, username);

            resultSet=preparedStatement.executeQuery(query);

            while (resultSet.next())
            {
                userToRead = new UserDataModel(resultSet.getInt("user_id"),resultSet.getString("username"),resultSet.getString("password"),resultSet.getString("display_name"),resultSet.getInt("access_level"));

            }

            preparedStatement.close();
            return userToRead;

        }catch (Exception e) {

            return userToRead;
        }

    }

    //Lists all the users
    public List<UserDataModel> readAll()
    {

        String query = "SELECT * FROM users";

        List<UserDataModel> usersList = new ArrayList<>();

        try {

            PreparedStatement preparedStatement = databaseConnection.getConnection().prepareStatement(query);
            ResultSet resultSet = null;
            resultSet=preparedStatement.executeQuery(query);

            while (resultSet.next())
            {
                usersList.add(new UserDataModel(resultSet.getInt("user_id"),resultSet.getString("username"),resultSet.getString("password"),resultSet.getString("display_name"),resultSet.getInt("access_level")));

            }
            preparedStatement.close();
            return usersList;

        }catch (Exception e) {

            return usersList;
        }

    }

    //Update a user
    public Boolean update(UserDataModel user)
    {

        /*
        TODO: update method
         */
        boolean ma_ta = true;

        return ma_ta;

    }

    //Delete a user
    public Boolean delete(int userId)
    {


        /*
        TODO: delete method
         */

        boolean ma_ta = true;

        return ma_ta;

    }


}

