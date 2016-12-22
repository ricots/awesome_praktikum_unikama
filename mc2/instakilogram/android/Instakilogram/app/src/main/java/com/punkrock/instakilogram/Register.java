package com.punkrock.instakilogram;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class Register extends AppCompatActivity implements View.OnClickListener{

    //Defining views
    private EditText editTextNama;
    private EditText editTextPassword;
    private EditText editTextAddress;
    private EditText editTextEmail;

    private Button buttonSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_register);

        //Initializing views
        editTextNama = (EditText) findViewById(R.id.et_name);
        editTextPassword = (EditText) findViewById(R.id.et_pass);
        editTextAddress = (EditText) findViewById(R.id.et_address);
        editTextEmail = (EditText) findViewById(R.id.et_email);

        buttonSignup = (Button) findViewById(R.id.btn_signup);

        //Setting listeners to button
        buttonSignup.setOnClickListener(this);
    }


    //Adding an employee
    private void addUser(){

        final String nama = editTextNama.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();
        final String address = editTextAddress.getText().toString().trim();
        final String email = editTextEmail.getText().toString().trim();

        class AddUser extends AsyncTask<Void,Void,String>{

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Register.this,"Adding...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(Register.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(Config.KEY_USER_NAMA,nama);
                params.put(Config.KEY_USER_PASSWORD,password);
                params.put(Config.KEY_USER_ADDRESS,address);
                params.put(Config.KEY_USER_EMAIL,email);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Config.URL_ADD, params);
                return res;
            }
        }

        AddUser ae = new AddUser();
        ae.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonSignup) {
            addUser();
            Intent i = new Intent(Register.this, Formlogin.class);
            startActivity(i);
        }
    }
}