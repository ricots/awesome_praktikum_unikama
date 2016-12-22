package com.punkrock.instakilogram;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


public class UserProfile extends AppCompatActivity implements AdapterView.OnItemClickListener{

    public Button Update;
    public EditText Status;

    public ListView listView;

    public String JSON_STRING;

    public String id_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        Intent intent = getIntent();
        String username = intent.getStringExtra(Formlogin.USER_NAME);




        TextView textView = (TextView) findViewById(R.id.textView3);

        textView.setText("Welcome " + username);

        Update = (Button) findViewById(R.id.btnstatus);
        Status = (EditText) findViewById(R.id.et_status);
        listView=(ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(this);

        getJSON();
    }

    private void showStatus() {
        JSONObject jsonObject = null;
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        try {
            jsonObject = new JSONObject(JSON_STRING);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY);

            for (int i = 0; i < result.length(); i++) {
                JSONObject jo = result.getJSONObject(i);
                String id_status = jo.getString(Config.TAG_ID);
                String status = jo.getString(Config.TAG_STATUS);

                HashMap<String, String> inistatus = new HashMap<>();
               inistatus.put(Config.TAG_ID,id_status);
                inistatus.put(Config.TAG_STATUS, status);
                list.add(inistatus);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ListAdapter adapter = new SimpleAdapter(
                UserProfile.this, list, R.layout.list_item,

                new String[]{Config.TAG_STATUS, Config.TAG_ID},
                new int[]{R.id.status});

        listView.setAdapter(adapter);
    }

    private void getJSON() {
        class GetJSON extends AsyncTask<Void, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(UserProfile.this, "Fetching Data", "Wait...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                JSON_STRING = s;
                showStatus();

            }

            @Override
            protected String doInBackground(Void... params) {
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequest(Config.URL_GET_ALL);
                return s;
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute();
    }

    // Update.setOnClickListener(this);



    private void addStatus() {

        final String status = Status.getText().toString().trim();


        class AddStatus extends AsyncTask<Void, Void, String> {

            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(UserProfile.this, "Adding...", "Wait...", false, false);
            }

          @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(UserProfile.this, s, Toast.LENGTH_LONG).show();
            }

            @Override
            protected String doInBackground(Void... v) {
                HashMap<String, String> params = new HashMap<>();
                params.put(Config.KEY_USER_STATUS, status);


                RequestHandler rh = new RequestHandler();
                String res = rh.sendPostRequest(Config.URL_ADD_STATUS, params);
                return res;
            }
        }

        AddStatus ae = new AddStatus();
        ae.execute();
    }

    private void deleteStatus(){


        class DeleteStatus extends AsyncTask<Void,Void,String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(UserProfile.this, "Updating...", "Wait...", false, false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(UserProfile.this, s, Toast.LENGTH_LONG).show();
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
                        startActivity(new Intent(UserProfile.this,UserProfile.class));
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
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_user_profile, menu);
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



    public void updatestatus(View v) {
        if (v == Update) {
            addStatus();
            Intent a=new Intent(UserProfile.this, UserProfile.class);
            startActivity(a);
        }
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Intent intent = new Intent(UserProfile.this, ViewStatus.class);

       HashMap<String,String> map =(HashMap)parent.getItemAtPosition(position);

        String coli = map.get(Config.TAG_ID).toString();
        intent.putExtra(Config.USER_ID,coli);
        startActivity(intent);

   }

    //public void bisa(View v){
      //  confirmDeleteStatus();
   // }
    }
