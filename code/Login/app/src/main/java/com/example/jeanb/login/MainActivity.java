package com.example.jeanb.login;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    TextView tv;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      tv=(TextView)findViewById(R.id.textView1);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        // create data base

        db=openOrCreateDatabase("Mydb",MODE_PRIVATE, null);
        db.execSQL("create table if not exists mytable(name varchar, sur_name varchar)");


    }
public void insert(View v){
    String name=et1.getText().toString();
    String sur_name=et2.getText().toString();
    et1.setText("");
    et2.setText("");
    db.execSQL("inert into mytable values('"+name+"','"+sur_name+"')");
    //display
    Toast.makeText(this, "values inserted successfully.", Toast.LENGTH_LONG).show();
}
    //This method will call when we click on display button
    public void display(View v)
    {
        //use cursor to keep all data
        //cursor can keep data of any data type
        Cursor c=db.rawQuery("select * from mytable", null);
        tv.setText("");
        //move cursor to first position
        c.moveToFirst();
        //fetch all data one by one
        do
        {
            //we can use c.getString(0) here
            //or we can get data using column index
            String name=c.getString(c.getColumnIndex("name"));
            String surname=c.getString(1);
            //display on text view
            tv.append("Name:"+name+" and SurName:"+surname+"\n");
            //move next position until end of the data
        }while(c.moveToNext());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
