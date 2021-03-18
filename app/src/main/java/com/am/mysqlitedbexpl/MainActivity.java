package com.am.mysqlitedbexpl;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DBhpr dbhpr;

    EditText edname, edloc,edn;
    EditText ename, eloc;
    String sname, sloc,n;
    String dsname, dsloc,dn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edname= findViewById(R.id.editTextTextPersonName);
        edloc= findViewById(R.id.editTextTextPersonName2);
        edn= findViewById(R.id.editTextTextPersonName3);
        ename= findViewById(R.id.editTextTextPersonName4);
        eloc= findViewById(R.id.editTextTextPersonName5);
        textView= findViewById(R.id.textView);
        dbhpr = new DBhpr(MainActivity.this);
    }

    public void sav(View view) {
        sname=edname.getText().toString();
        sloc=edloc.getText().toString();
        dbhpr.savedat(sname,sloc);
        Toast.makeText(this, "Save success!!", Toast.LENGTH_SHORT).show();
    }

    public void ret(View view) {
        n=edn.getText().toString();
        String l = dbhpr.getloc(n);
        textView.setText(l);
    }

    public void upd(View view) {
        dsname=ename.getText().toString();
        dsloc=eloc.getText().toString();
        dbhpr.updat(dsname,dsloc);
    }
}