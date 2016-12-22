package com.erif.adminpegawai.home;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.erif.adminpegawai.R;
import com.erif.adminpegawai.home.adapter_gaji.AdapterGaji;
import com.erif.adminpegawai.home.adapter_gaji.DataKonten_Gaji;
import com.erif.adminpegawai.home.adapter_karyawan.AdapterKaryawan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static android.support.v7.widget.LinearLayoutManager.VERTICAL;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGaji extends Fragment {

    EditText edCari;
    SearchView searchView;
    RecyclerView recyclerView;
    RequestQueue requestQueue;
    AdapterGaji adaptergaji;
    String url="http://uasmobile.pe.hu/getOnePegawai.php";
    String urlCari="http://uasmobile.pe.hu/cari.php";

    public FragmentGaji() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragment_gaji, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        edCari=(EditText)view.findViewById(R.id.fragmentGaji_edCariGajiKaryawan);
        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerGajiKaryawan);
        requestQueue= Volley.newRequestQueue(getActivity());

        edCari.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (edCari.getText().toString().equals("")){}
                else {
                    cari();
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

    }

    public void cari(){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, urlCari, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                tampil();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                String cari=edCari.getText().toString();
                Map<String, String> map=new ArrayMap<String, String>();
                map.put("cari1", cari);
                return map;
            }
        };
        requestQueue.add(stringRequest);
    }
    public void tampil(){
        JsonObjectRequest request=new JsonObjectRequest(Request.Method.POST, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                List<DataKonten_Gaji> dataKontenGaji = new ArrayList<DataKonten_Gaji>();
                try {
                    JSONArray jsonArray=response.getJSONArray("Karyawan");
                    for (int i=0; i<jsonArray.length(); i++){
                        JSONObject data=jsonArray.getJSONObject(i);
                        DataKonten_Gaji dataKonten_gaji=new DataKonten_Gaji();
                        dataKonten_gaji.profil=data.getString("foto");
                        dataKonten_gaji.nama=data.getString("nama_karyawan");
                        dataKonten_gaji.jabatan=data.getString("id_jabatan");
                        dataKonten_gaji.jenis_kelamin=data.getString("jenis_kelamin");
                        dataKonten_gaji.alamat=data.getString("alamat_karyawan");
                        dataKonten_gaji.lembur=data.getString("lembur");

                        String jabatan=data.getString("id_jabatan");
                        int danaLembur=0;
                        int gajiPokok=0;
                        if (jabatan.equals("jab1")){
                            danaLembur=700000;
                            gajiPokok=7000000;
                        }else if (jabatan.equals("jab2")){
                            danaLembur=400000;
                            gajiPokok=4000000;
                        }else if (jabatan.equals("jab3")){
                            danaLembur=200000;
                            gajiPokok=2000000;
                        }

                        int lembur=Integer.parseInt(data.getString("lembur"));
                        int totalLembur=lembur*danaLembur;
                        int totalGaji=totalLembur+gajiPokok;

                        dataKonten_gaji.gaji=String.valueOf(totalGaji);
                        dataKontenGaji.add(dataKonten_gaji);
                    }
                    adaptergaji= new AdapterGaji(getActivity(), dataKontenGaji);
                    recyclerView.setAdapter(adaptergaji);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                } catch (JSONException e) {
                    Toast.makeText(getActivity(), e.toString(), Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), error.toString(), Toast.LENGTH_LONG).show();
            }
        });
        requestQueue.add(request);
    }

}
