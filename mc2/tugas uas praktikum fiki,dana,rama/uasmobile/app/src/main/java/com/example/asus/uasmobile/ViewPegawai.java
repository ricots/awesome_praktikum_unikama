package com.example.asus.uasmobile;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class ViewPegawai extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextNip;
    private EditText editTextNama;
    private EditText editTextDivisi;
    private EditText editTextJabatan;
    private EditText editTextNo_Hp;
    private EditText editTextEmail;

    private Button buttonUpdate;
    private Button buttonDelete;

    private String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pegawai);

        Intent intent = getIntent();

        id = intent.getStringExtra(Config.PEG_NIP);

        editTextNip = (EditText) findViewById(R.id.editTextNip);
        editTextNama = (EditText) findViewById(R.id.editTextNama);
        editTextDivisi = (EditText) findViewById(R.id.editTextDivisi);
        editTextJabatan = (EditText) findViewById(R.id.editTextJabatan);
        editTextNo_Hp = (EditText) findViewById(R.id.editTextNo_Hp);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);

        buttonUpdate = (Button) findViewById(R.id.buttonUpdate);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);

        buttonUpdate.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);

        editTextNip.setText(editTextNip);

        getPegawai();
    }

    private void getEmployee(){
        class GetPegawai extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ViewPegawai.this,"Fetching...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showPegawai(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequestParam(Config.URL_GET_PEG,nip);
                return s;
            }
        }
        GetPegawai ge = new GetPegawai();
        ge.execute();
    }

    private void showPegawai(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY);
            JSONObject c = result.getJSONObject(0);
            String nip = c.getString(Config.TAG_NIP);
            String nama = c.getString(Config.TAG_NAMA);
            String divisi = c.getString(Config.TAG_DIVISI);
            String jabatan = c.getString(Config.TAG_JABATAN);
            String no_hp = c.getString(Config.TAG_NO_HP);
            String email = c.getString(Config.TAG_EMAIL);

            editTextNip.setText(nip);
            editTextNama.setText(nama);
            editTextDivisi.setText(divisi);
            editTextJabatan.setText(jabatan);
            editTextNo_Hp.setText(no_hp);
            editTextEmail.setText(email);


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    private void updateEmployee(){
        final String nip = editTextNip.getText().toString().trim();
        final String nama = editTextNama.getText().toString().trim();
        final String divisi = editTextDivisi.getText().toString().trim();
        final String jabatan = editTextJabatan.getText().toString().trim();
        final String no_hp = editTextNo_Hp.getText().toString().trim();
        final String email = editTextEmail.getText().toString().trim();

        class UpdatePegawai extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ViewPegawai.this,"Updating...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(ViewPegawai.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                HashMap<String,String> hashMap = new HashMap<>();
                hashMap.put(Config.KEY_PEG_NIP,nip);
                hashMap.put(Config.KEY_PEG_NAMA,nama);
                hashMap.put(Config.KEY_PEG_DIVISI,divisi);
                hashMap.put(Config.KEY_PEG_JABATAN,jabatan);
                hashMap.put(Config.KEY_PEG_NO_HP,no_hp);
                hashMap.put(Config.KEY_PEG_EMAIL,email);

                RequestHandler rh = new RequestHandler();

                String s = rh.sendPostRequest(Config.URL_UPDATE_PEG,hashMap);

                return s;
            }
        }

        UpdatePegawai ue = new UpdatePegawai();
        ue.execute();
    }

    private void deletePegawai(){
        class DeletePegawai extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ViewPegawai.this, "Updating...", "Wait...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(ViewPegawai.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequestParam(Config.URL_DELETE_PEG, id);
                return s;
            }
        }

        DeletePegawai de = new DeletePegawai();
        de.execute();
    }

    private void confirmDeletePegawai(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure you want to delete this pegawai?");

        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        deletePegawai();
                        startActivity(new Intent(ViewPegawai.this,ViewAllPegawai.class));
                    }
                });

        alertDialogBuilder.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    @Override
    public void onClick(View v) {
        if(v == buttonUpdate){
            UpdatePegawai();
        }

        if(v == buttonDelete){
            confirmDeletePegawai();
        }
    }
}
