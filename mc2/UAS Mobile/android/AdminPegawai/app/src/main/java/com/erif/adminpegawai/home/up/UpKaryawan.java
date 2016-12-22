package com.erif.adminpegawai.home.up;

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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.erif.adminpegawai.R;
import com.erif.adminpegawai.home.add.AddKaryawan;
import com.squareup.picasso.Picasso;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UpKaryawan extends AppCompatActivity {

    EditText edNama, edUsia, edAlamat;
    Spinner spinJabatan;
    RadioButton rdPria, rdWanita;
    ImageView imagePreview;
    Button btnUpload, btnSimpan;
    Bundle isi;
    String id, nama, jabatan, jenis_kelamin, usia, alamat, image;
    String getNama, getjabatan, getKelamin, getusia, getAlamat, getImage,
    keyImage;
    String[] jabatanKaryawan;
    ArrayAdapter<String> adapter;
    Uri filePath;
    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_up_karyawan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initComponent();
        jabatanKaryawan=new String[]{
                "Atasan", "Karyawan", "Office boy"
        };
        adapter=new ArrayAdapter<String>(UpKaryawan.this, android.R.layout.simple_dropdown_item_1line, jabatanKaryawan);
        spinJabatan.setAdapter(adapter);

        id=isi.getString("id");
        nama=isi.getString("nama");
        jabatan=isi.getString("jabatan");
        jenis_kelamin=isi.getString("jenis_kelamin");
        usia=isi.getString("usia");
        alamat=isi.getString("alamat");
        image=isi.getString("image");

        edNama.setText(nama);
        spinJabatan.setSelection(adapter.getPosition(jabatan));
        if (jenis_kelamin.equals("Pria")){
            rdPria.setChecked(true);
        }else {
            rdWanita.setChecked(true);
        }
        edUsia.setText(usia);
        edAlamat.setText(alamat);
        Picasso.with(getApplicationContext()).load(image).into(imagePreview);

        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadPhoto();
            }
        });

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(UpKaryawan.this);
                builder.setMessage("Simpan Data ?");
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        simpan();
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

    private void initComponent() {
        edNama=(EditText)findViewById(R.id.upKaryawan_edNamaKaryawan);
        edUsia=(EditText)findViewById(R.id.upKaryawan_edUsia);
        edAlamat=(EditText)findViewById(R.id.upKaryawan_edAlamat);
        spinJabatan=(Spinner)findViewById(R.id.upKaryawan_Jabatan);
        rdPria=(RadioButton)findViewById(R.id.upKaryawan_RadioPria);
        rdWanita=(RadioButton)findViewById(R.id.upKaryawan_RadioWanita);
        imagePreview=(ImageView)findViewById(R.id.upKaryawan_ImgPreview);
        btnSimpan=(Button)findViewById(R.id.upKaryawan_btnSimpan);
        btnUpload=(Button)findViewById(R.id.upKaryawan_btnUpload);
        isi=getIntent().getExtras();
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
    public void simpan(){
        String url="http://uasmobile.pe.hu/upKaryawan.php";
        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        final ProgressDialog pd=new ProgressDialog(UpKaryawan.this);
        pd.setMessage("Menyimpan Data...");
        pd.show();
        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                dialogtersimpan();
                pd.dismiss();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                pd.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                getNama=edNama.getText().toString();
                if (spinJabatan.getSelectedItem().toString().equals("Atasan")){
                    getjabatan="jab1";
                }else if (spinJabatan.getSelectedItem().toString().equals("Karyawan")){
                    getjabatan="jab2";
                }else if (spinJabatan.getSelectedItem().toString().equals("Office boy")){
                    getjabatan="jab3";
                }
                if (rdPria.isChecked()){
                    getKelamin="Pria";
                }else if(rdWanita.isChecked()){
                    getKelamin="Wanita";
                }
                getusia=edUsia.getText().toString();
                getAlamat=edAlamat.getText().toString();
                if (bitmap==null){
                    getImage=image;
                    keyImage="images";
                }else {
                    getImage=getStringImage(bitmap);
                    keyImage="image";
                }

                Map<String,String> map=new HashMap<String, String>();
                map.put("id_karyawan", id);
                map.put("nama_karyawan", getNama);
                map.put("id_jabatan", getjabatan);
                map.put("jenis_kelamin", getKelamin);
                map.put("usia", getusia);
                map.put("alamat", getAlamat);
                map.put(keyImage, getImage);
                return map;
            }
        };
        requestQueue.add(request);
    }
    private void dialogtersimpan() {
        AlertDialog.Builder builder=new AlertDialog.Builder(UpKaryawan.this);
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
                imagePreview.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public String getStringImage(Bitmap bmp){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bmp.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] imageBytes = baos.toByteArray();
        String encodedImage = Base64.encodeToString(imageBytes, Base64.DEFAULT);
        return encodedImage;
    }

}
