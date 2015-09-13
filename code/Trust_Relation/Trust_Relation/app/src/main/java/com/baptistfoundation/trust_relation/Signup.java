/*
package com.baptistfoundation.trust_relation;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.security.cert.CertPathValidatorException;

import javax.xml.validation.Validator;


public class Signup extends AppCompatActivity {
    private int ed0;
private EditText ed1,ed2,ed3,ed4,ed5,ed6,ed8;
    private Button signup1;
    private Spinner ed7;
    private dbfunction dbfunctions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
       dbfunctions= new dbfunction(getApplicationContext());
        dbfunctions.open();

        signup1= (Button)findViewById(R.id.savebutton);
        ed1= (EditText) findViewById(R.id.username);
        ed2= (EditText) findViewById(R.id.lastname);
        ed3= (EditText) findViewById(R.id.adresse);
        ed4= (EditText) findViewById(R.id.mail);
        ed5= (EditText) findViewById(R.id.password);
        ed6= (EditText) findViewById(R.id.password2);
        ed8= (EditText) findViewById(R.id.datenaissance);
        ed7= (Spinner) findViewById(R.id.spinner1);



    }
    public void onClick(View v) {
        //we validate the inputs first and make sure they are not null
        if (Validate ()) {


            //capture input data and store in variables
            String First_name = ed1.getText().toString().trim();
            String Last_name = ed2.getText().toString().trim();
            String Address = ed3.getText().toString().trim();
            String mail = ed4.getText().toString().trim();
            String password = ed5.getText().toString().trim();
            String categorie = ed7.getSelectedItem().toString().trim();
            String date_of_b = ed8.getText().toString().trim();


          if (!dbfunctions.createUser(Integer.parseInt(null),First_name, Last_name, Address, mail, password, categorie, date_of_b)) {
                //data was not successdully saved
            }
        }
        else {
                //successfully  saved county, redirect back to the main activity
                Toast.makeText(getApplicationContext(), "Saved successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
       }

    private boolean Validate() {

         /* if this input field is empty, we request the user to provide a value

//        edCountyName.getText().length() == 0
        if (TextUtils.isEmpty(ed1.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please enter First Name", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(ed4.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please enter the mail address", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(ed5.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please enter Password", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(ed6.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please provide the categorie of the user", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(ed7.getSelectedItem().toString())) {
            Toast.makeText(getApplicationContext(), "Please confirm your password", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (TextUtils.isEmpty(ed8.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please provide your date of birth", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!ed5.equals(ed6)) {
            Toast.makeText(getApplicationContext(),
                    "Password does not match", Toast.LENGTH_LONG).show();
        return false;
        }


        if (ed2.getText().length() == 0) {
                Toast.makeText(getApplicationContext(), "Please provide Last Name", Toast.LENGTH_SHORT).show();
                return false;
            }
            /**
             * if this input field is empty, we request the user to provide a value
             */
/*
            if (ed3.getText().length() == 0) {
                Toast.makeText(getApplicationContext(), "Please give the address", Toast.LENGTH_SHORT).show();
                return false;
            }

       return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_signup, menu);
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

*/