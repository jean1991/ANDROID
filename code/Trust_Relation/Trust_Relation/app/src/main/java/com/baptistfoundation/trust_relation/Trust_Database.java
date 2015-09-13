/*package com.baptistfoundation.trust_relation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Hp on 7/31/2015.
 *//*
public class Trust_Database extends SQLiteOpenHelper{
    private static final String MYDATABASE="Trust";
    private static final int VERSION=1;
    final String SAMPLE_TABLE_NAME="Users";
    protected Context context;

    public Trust_Database(final Context connection){
        super(connection, MYDATABASE, null, VERSION);
        this.context=connection;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS"+ SAMPLE_TABLE_NAME+"(Id_user integer  primary key autoincrement,First_Name Varchar,Lat_name Varcahr, Address_user Varchar,mail_address varchar," +
                "Password Varchar,Categorie Varchar, date_of_birth;)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + SAMPLE_TABLE_NAME);
        onCreate(db);
    }
}
*/