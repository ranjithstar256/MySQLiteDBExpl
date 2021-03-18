package com.am.mysqlitedbexpl;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DBhpr dbhpr;

    EditText edname, edloc;
    String sname, sloc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edname= findViewById(R.id.editTextTextPersonName);
        edloc= findViewById(R.id.editTextTextPersonName2);
    }

    public void sav(View view) {
        sname=edname.getText().toString();
        sloc=edloc.getText().toString();

        dbhpr = new DBhpr(MainActivity.this);
        dbhpr.savedat(sname,sloc);



        Toast.makeText(this, "Save success!!", Toast.LENGTH_SHORT).show();
    }
}