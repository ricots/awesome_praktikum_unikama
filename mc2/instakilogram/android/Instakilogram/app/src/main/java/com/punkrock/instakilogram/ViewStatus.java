package com.punkrock.instakilogram;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class ViewStatus extends AppCompatActivity implements View.OnClickListener {


    private EditText editTextStatus;
    private EditText editTextId;

    private Button buttonEdit;
    private Button buttonDelete;

    private String id_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_status);

        Intent intent = getIntent();

        id_status = intent.getStringExtra(Config.USER_ID);



        editTextId = (EditText) findViewById(R.id.editTextId);
        editTextStatus = (EditText) findViewById(R.id.editTextStatus);

        buttonEdit = (Button) findViewById(R.id.buttonEdit);
        buttonDelete = (Button) findViewById(R.id.buttonDelete);

        buttonEdit.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);

        editTextId.setText(id_status);

        getMahasiwa();
    }

    private void getMahasiwa(){
        class GetMahasiswa extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ViewStatus.this,"Fetching...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                showStatus(s);
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequestParam(Config.URL_GET_STATUS,id_status);
                return s;
            }
        }
        GetMahasiswa ge = new GetMahasiswa();
        ge.execute();
    }

    private void showStatus(String json){
        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY);
            JSONObject c = result.getJSONObject(0);
            String status = c.getString(Config.TAG_STATUS);

            editTextStatus.setText(status);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    private void updateStatus(){
        final String status = editTextStatus.getText().toString().trim();

        class UpdateStatus extends AsyncTask<Void,Void,String>{
            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ViewStatus.this,"Updating...","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(ViewStatus.this,s,Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                HashMap<String,String> hashMap = new HashMap<>();
                hashMap.put(Config.KEY_USER_ID, id_status);
                hashMap.put(Config.KEY_USER_STATUS, status);

                RequestHandler rh = new RequestHandler();

                String s = rh.sendPostRequest(Config.URL_UPDATE_STATUS,hashMap);

                return s;
            }
        }

        UpdateStatus ue = new UpdateStatus();
        ue.execute();
    }

    private void deleteStatus(){
        class DeleteStatus extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ViewStatus.this, "Updating...", "Wait...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(ViewStatus.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequestParam(Config.URL_DELETE_STATUS, id_status);
                return s;
            }
        }

        DeleteStatus de = new DeleteStatus();
        de.execute();
    }

    private void confirmDeleteStatus(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure you want to delete this mahasiswa?");

        alertDialogBuilder.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        deleteStatus();
                        startActivity(new Intent(ViewStatus.this,UserProfile.class));
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
        if(v == buttonEdit){
            updateStatus();
           startActivity(new Intent(this,UserProfile.class));

        }

        if(v == buttonDelete){
            confirmDeleteStatus();

        }
    }
}
