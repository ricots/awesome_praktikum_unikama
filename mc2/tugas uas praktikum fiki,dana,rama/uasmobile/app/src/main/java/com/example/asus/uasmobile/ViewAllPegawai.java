package com.example.asus.uasmobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewAllPegawai extends AppCompatActivity implements ListView.OnItemClickListener {

    private ListView listView;

    private String JSON_STRING;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pegawai);
        listView = (ListView) findViewById(R.id.listView);
        listView.setOnItemClickListener(this);
        getJSON();
    }


    private void showPegawai(){
        JSONObject jsonObject = null;
        ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String, String>>();
        try {
            jsonObject = new JSONObject(JSON_STRING);
            JSONArray result = jsonObject.getJSONArray(Config.TAG_JSON_ARRAY);

            for(int i = 0; i<result.length(); i++){
                JSONObject jo = result.getJSONObject(i);
                String nip = jo.getString(Config.TAG_NIP);
                String nama = jo.getString(Config.TAG_NAMA);
                String divisi = jo.getString(Config.TAG_DIVISI);
                String jabatan = jo.getString(Config.TAG_JABATAN);
                String no_hp = jo.getString(Config.TAG_NO_HP);
                String email = jo.getString(Config.TAG_EMAIL);

                HashMap<String,String> pegawai = new HashMap<>();
                pegawai.put(Config.TAG_NIP, nip);
                pegawai.put(Config.TAG_NAMA,nama);
                pegawai.put(Config.TAG_DIVISI,divisi);
                pegawai.put(Config.TAG_JABATAN,jabatan);
                pegawai.put(Config.TAG_NO_HP,no_hp);
                pegawai.put(Config.TAG_EMAIL,email);
                list.add(pegawai);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        ListAdapter adapter = new SimpleAdapter(
                ViewAllPegawai.this, list, R.layout.list_item,
                new String[]{Config.TAG_NIP,Config.TAG_NAMA,Config.TAG_DIVISI,Config.TAG_JABATAN,Config.TAG_NO_HP,Config.TAG_EMAIL},
                new int[]{R.id.nip, R.id.nama, R.id.divisi, R.id.jabatan, R.id.no_hp, R.id.email});

        listView.setAdapter(adapter);
    }

    private void getJSON(){
        class GetJSON extends AsyncTask<Void,Void,String>{

            ProgressDialog loading;
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(ViewAllPegawai.this,"Fetching Data","Wait...",false,false);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                JSON_STRING = s;
                showPegawai();
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, ViewPegawai.class);
        HashMap<String,String> map =(HashMap)parent.getItemAtPosition(position);
        String empId = map.get(Config.TAG_NIP).toString();
        intent.putExtra(Config.PEG_NIP,empId);
        startActivity(intent);
    }
}