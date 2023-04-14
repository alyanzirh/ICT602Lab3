package com.example.lab3_alyanazirah;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

//1. Extends DataHelper with SQLiteOpenHelper
public class DataHelper extends SQLiteOpenHelper {
    //2. Create Database
    private static final String DATABASE_NAME = "personalbiodata.db";
    //Database Version
    private static final int DATABASE_VERSION = 1;

    //3. Create Constructor for DataHelper
    public DataHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //4. Create Table
    @Override
    public void onCreate(SQLiteDatabase db){
        String sql = "create table biodata (no integer primary key, name text null, dob text null, gender text null, address text null);";
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }

    //5. Create method to upgrade database
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2){

    }
}
