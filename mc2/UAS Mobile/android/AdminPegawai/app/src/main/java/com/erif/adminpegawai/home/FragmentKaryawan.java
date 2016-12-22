package com.erif.adminpegawai.home;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.erif.adminpegawai.R;
import com.erif.adminpegawai.home.adapter_karyawan.AdapterKaryawan;
import com.erif.adminpegawai.home.adapter_karyawan.DataKonten_Karyawan;
import com.erif.adminpegawai.home.add.AddKaryawan;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentKaryawan extends Fragment {

    SwipeRefreshLayout swipe;
    String url="http://uasmobile.pe.hu/getPegawai.php";
    public RecyclerView recyclerView;
    RequestQueue requestQueue;
    AdapterKaryawan adapterKaryawan;
    FloatingActionButton btnAdd;

    public FragmentKaryawan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragment_karyawan, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        swipe=(SwipeRefreshLayout)view.findViewById(R.id.swipe);

        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerKaryawan);
        btnAdd=(FloatingActionButton)view.findViewById(R.id.fab);
        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerKaryawan);
        btnAdd=(FloatingActionButton)view.findViewById(R.id.fab);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AddKaryawan.class));
            }
        });
        tampil();
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipe.setColorScheme(R.color.colorPrimary);
                tampil();
            }
        });

    }

    public void tampil(){
        requestQueue= Volley.newRequestQueue(getActivity());
        JsonObjectRequest request=new JsonObjectRequest(Request.Method.POST, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                List<DataKonten_Karyawan> dataKonten = new ArrayList<DataKonten_Karyawan>();
                try {
                    JSONArray jsonArray=response.getJSONArray("Karyawan");
                    for (int i=0; i<jsonArray.length(); i++){
                        JSONObject data=jsonArray.getJSONObject(i);
                        DataKonten_Karyawan dataKonten_karyawan=new DataKonten_Karyawan();
                        dataKonten_karyawan.id=data.getString("id_karyawan");
                        dataKonten_karyawan.nama=data.getString("nama_karyawan");
                        dataKonten_karyawan.jabatan=data.getString("id_jabatan");
                        dataKonten_karyawan.alamat=data.getString("alamat_karyawan");
                        dataKonten_karyawan.profil=data.getString("foto");
                        dataKonten_karyawan.jenis_kelamin=data.getString("jenis_kelamin");
                        dataKonten_karyawan.usia=data.getString("usia");
                        dataKonten.add(dataKonten_karyawan);
                    }
                    adapterKaryawan=new AdapterKaryawan(getActivity(), dataKonten);
                    recyclerView.setAdapter(adapterKaryawan);
                    recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
                    swipe.setRefreshing(false);
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
