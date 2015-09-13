/*
package com.baptistfoundation.trust_relation;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/**
 * Created by Hp on 7/31/2015.
 */
/*
public class dbfunction {

    private Trust_Database trustd;
    private SQLiteDatabase database;

    public dbfunction (Context context){
        trustd= new Trust_Database(context);

    }

    public void open () throws SQLException{

         database=trustd.getWritableDatabase();

    }

    public void close (){

        trustd.close();
    }


    public boolean createUser(int id,String first_name, String last_name, String address,String mail, String password,String categorie,String date_birth) {
        ContentValues values = new ContentValues();
        values.put("First_name", first_name);
        values.put("Last_name", last_name);
        values.put("Address_user", address);
        values.put("mail_address", mail);
        values.put("Password", password);
        values.put("Categorie", categorie);
        values.put("date_of_birth", date_birth);

        long insertedId = 0;
        insertedId = database.insert(trustd.SAMPLE_TABLE_NAME, null,
                values);
        if (insertedId != 0) {
            return true;
        }

        return false;
    }
    public ArrayList<userModel> fetchAllCounties() {
        ArrayList<userModel> users = new ArrayList<userModel>();

        Cursor cursor = database.query(trustd.SAMPLE_TABLE_NAME,
                null, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            userModel model = new userModel(cursor.getInt(1), cursor.getString(2), cursor.getString(3),cursor.getString(4),cursor.getString(5), cursor.getString(6), cursor.getString(7),cursor.getString(8));
            users.add(model);
            cursor.moveToNext();
        }
        // make sure to close the cursor
        cursor.close();
        return users;
    }


}

*/