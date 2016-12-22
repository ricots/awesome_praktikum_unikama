package com.erif.adminpegawai.home;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.erif.adminpegawai.R;
import com.squareup.picasso.Picasso;

public class DetailKaryawan extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;
    TextView txtID, txtJabatan, txtJenisKelamin, txtUsia, txtAlamat;
    ImageView imagePreview;
    String id, nama, getjabatan, jabatan, kelamin, usia, alamat, image;
    Bundle isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail_karyawan);
        initComponent();

        isi=getIntent().getExtras();
        id=isi.getString("id");
        nama=isi.getString("nama");
        getjabatan=isi.getString("jabatan");
        kelamin=isi.getString("kelamin");
        usia=isi.getString("usia");
        alamat=isi.getString("alamat");
        image=isi.getString("image");

        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.collapse_toolbar);
        final Toolbar toolbar=(Toolbar)findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        collapsingToolbarLayout.setTitle(nama);
        txtID.setText("ID Karyawan: "+id);
        if (getjabatan.equals("jab1")){
            jabatan="Atasan";
        }else if (getjabatan.equals("jab2")){
            jabatan="Karyawan";
        }else if (getjabatan.equals("jab3")){
            jabatan="Office boy";
        }
        txtJabatan.setText("Jabatan: "+jabatan);
        txtJenisKelamin.setText("Jenis Kelamin: "+kelamin);
        txtUsia.setText("Usia :"+usia);
        txtAlamat.setText("Alamat: "+alamat);

        imagePreview=(ImageView)findViewById(R.id.bg_header);
        Picasso.with(getApplicationContext()).load(image).into(imagePreview);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case android.R.id.home:
                finish();
                 break;
        }
        return true;
    }

    public void initComponent(){
        txtID=(TextView)findViewById(R.id.detail_txtID);
        txtJabatan=(TextView)findViewById(R.id.detail_txtJabatan);
        txtJenisKelamin=(TextView)findViewById(R.id.detail_txtJenisKelamin);
        txtUsia=(TextView)findViewById(R.id.detail_txtUsia);
        txtAlamat=(TextView)findViewById(R.id.detail_txtAlamat);
    }

}
