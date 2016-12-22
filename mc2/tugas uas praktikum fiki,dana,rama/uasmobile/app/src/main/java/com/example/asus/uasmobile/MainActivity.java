package com.example.asus.uasmobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Defining views
    private EditText editTextNip;
    private EditText editTextNama;
    private EditText editTextDivisi;
    private EditText editTextJabatan;
    private EditText editTextNo_Hp;
    private EditText editTextEmail;

    private Button buttonAdd;
    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing views
        editTextNip = (EditText) findViewById(R.id.editTextNip);
        editTextNama = (EditText) findViewById(R.id.editTextNama);
        editTextDivisi = (EditText) findViewById(R.id.editTextDivisi);
        editTextJabatan = (EditText) findViewById(R.id.editTextJabatan);
        editTextNo_Hp = (EditText) findViewById(R.id.editTextNo_Hp);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonView = (Button) findViewById(R.id.buttonView);

        //Setting listeners to button
        buttonAdd.setOnClickListener(this);
        buttonView.setOnClickListener(this);
    }


    //Adding an employee
    private void addPegawai(){

        final String nip = editTextNip.getText().toString().trim();
        final String nama = editTextNama.getText().toString().trim();
        final String divisi = editTextDivisi.getText().toString().trim();
        final String jabatan = editTextJabatan.getText().toString().trim();
        final String no_hp = editTextNo_Hp.getText().toString().trim();
        final String email = editTextEmail.getText().toString().trim();

        class addPegawai extends AsyncTask<Void,Void,String>{

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(MainActivity.this,"Adding...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String,String> params = new HashMap<>();
                params.put(Config.KEY_PEG_NIP,nip);
                params.put(Config.KEY_PEG_NAMA,nama);
                params.put(Config.KEY_PEG_DIVISI,divisi);
                params.put(Config.KEY_PEG_JABATAN,jabatan);
                params.put(Config.KEY_PEG_NO_HP,no_hp);
                params.put(Config.KEY_PEG_EMAIL,email);

                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Config.URL_ADD, params);
                return res;
            }
        }

        addPegawai ae = new addPegawai();
        ae.execute();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonAdd){
            addPegawai();
        }

        if(v == buttonView){
            startActivity(new Intent(this,ViewPegawai.class));
        }
    }
}