package com.erif.adminpegawai.home.add;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.erif.adminpegawai.R;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

import static android.R.attr.bitmap;

public class AddKaryawan extends AppCompatActivity {

    EditText edNamaKaryawan, edUsiakaryawan, edAlamatkaryawan;
    Spinner spinJabatanKaryawan;
    RadioButton rdPria, rdWanita;
    ImageView imgPreview;
    Button btnUpload, btnSimpan;
    String namaKaryawan, getjabatan, jabatan, jenisKelamin, usiaKaryawan, alamatkaryawan
            ,url="http://uasmobile.pe.hu/addKaryawan.php";
    String[] dataJabatan;
    ArrayAdapter<String> adapter;
    RequestQueue requestQueue;
    Uri filePath;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_add_karyawan);
        initComponent();
        getSupportActionBar().setTitle("Tambah karyawan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dataJabatan=new String[]{
                "Atasan", "Karyawan", "Office boy"
        };
        adapter=new ArrayAdapter<String>(AddKaryawan.this, android.R.layout.simple_dropdown_item_1line, dataJabatan);
        spinJabatanKaryawan.setAdapter(adapter);

        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadPhoto();
            }
        });

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(AddKaryawan.this);
                builder.setMessage("Simpan Data ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        simpanData();
                    }
                })
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });

    }
    private void dialogtersimpan() {
        AlertDialog.Builder builder=new AlertDialog.Builder(AddKaryawan.this);
        builder.setMessage("Data tersimpan !")
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                finish();
            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }
    public void uploadPhoto(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), 1);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && data != null && data.getData() != null) {
            filePath = data.getData();
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), filePath);
                imgPreview.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void simpanData() {
        final ProgressDialog dialog=new ProgressDialog(AddKaryawan.this);
        dialog.setMessage("Uploading Data....");
        dialog.show();
        requestQueue=Volley.newRequestQueue(getApplicationContext());
        StringRequest stringRequest=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                dialog.dismiss();
                dialogtersimpan();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                namaKaryawan=edNamaKaryawan.getText().toString();
                getjabatan=spinJabatanKaryawan.getSelectedItem().toString();
                if (getjabatan.equals("Atasan")){
                    jabatan="jab1";
                }else if (getjabatan.equals("Karyawan")){
                    jabatan="jab2";
                }else if (getjabatan.equals("Office boy")){
                    jabatan="jab3";
                }
                if (rdPria.isChecked()){
                    jenisKelamin="Pria";
                }else if (rdWanita.isChecked()){
                    jenisKelamin="Wanita";
                }
                usiaKaryawan=edUsiakaryawan.getText().toString();
                alamatkaryawan=edAlamatkaryawan.getText().toString();
                String image=getStringImage(bitmap);

                Map<String,String> map=new HashMap<String, String>();
                map.put("image", image);
                map.put("nama_karyawan", namaKaryawan);
                map.put("id_jabatan", jabatan);
                map.put("jenis_kelamin", jenisKelamin);
                map.put("usia", usiaKaryawan);
                map.put("alamat", alamatkaryawan);
                return map;
            }
        };
        requestQueue.add(stringRequest);
    }
    public String getStringImage(Bitmap bmp){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] imageBytes = baos.toByteArray();
        String encodedImage = Base64.encodeToString(imageBytes, Base64.DEFAULT);
        return encodedImage;
    }
    private void initComponent(){
        edNamaKaryawan=(EditText)findViewById(R.id.addKaryawan_edNamaKaryawan);
        edUsiakaryawan=(EditText)findViewById(R.id.addKaryawan_edUsia);
        edAlamatkaryawan=(EditText)findViewById(R.id.addKaryawan_edAlamat);
        spinJabatanKaryawan=(Spinner)findViewById(R.id.addKaryawan_Jabatan);
        rdPria=(RadioButton)findViewById(R.id.addKaryawan_RadioPria);
        rdWanita=(RadioButton)findViewById(R.id.addKaryawan_RadioWanita);
        imgPreview=(ImageView)findViewById(R.id.addKaryawan_ImgPreview);
        btnUpload=(Button)findViewById(R.id.addKaryawan_btnUpload);
        btnSimpan=(Button)findViewById(R.id.addKaryawan_btnSimpan);
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
}
