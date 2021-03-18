package com.am.mysqlitedbexpl;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBhpr extends SQLiteOpenHelper {
    String DBNAME ="details.db";
    SQLiteDatabase sqLiteDatabase;
    String TABLE_NAME="students", COLUMN_ONE="Name",COLUMN_TWO="Location";

    public DBhpr(Context context) {
        super(context, "details.db", null,1);
        sqLiteDatabase=getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // create table students (Name text , Location text)
        String tblequr=  "create table "+TABLE_NAME+" ("+COLUMN_ONE+" text ,"+COLUMN_TWO+" text )";
        sqLiteDatabase.execSQL(tblequr);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    public void savedat(String s1, String s2){
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_ONE,s1);
        contentValues.put(COLUMN_TWO,s2);

      long o =  sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
      Log.i("savestatus",o+"");
    }

}
