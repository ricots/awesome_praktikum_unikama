package com.erif.adminpegawai.home.adapter_karyawan;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.erif.adminpegawai.R;
import com.erif.adminpegawai.home.DetailKaryawan;
import com.erif.adminpegawai.home.FragmentKaryawan;
import com.erif.adminpegawai.home.up.UpKaryawan;
import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ERIF on 17/12/2016.
 */

public class AdapterKaryawan extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context c;
    LayoutInflater inflater;
    List<DataKonten_Karyawan> dataKonten_karyawen= Collections.emptyList();
    DataKonten_Karyawan current;

    public AdapterKaryawan(Context c, List<DataKonten_Karyawan> dataKonten_karyawen) {
        this.c = c;
        inflater=LayoutInflater.from(c);
        this.dataKonten_karyawen = dataKonten_karyawen;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.item_karyawan,parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final MyHolder myHolder= (MyHolder) holder;
        current=dataKonten_karyawen.get(position);
        String jabatan=null;
        if(current.jabatan.equals("jab1")){
            jabatan="Atasan";
        }else if(current.jabatan.equals("jab2")){
            jabatan="Karyawan";
        }else if(current.jabatan.equals("jab3")){
            jabatan="Office boy";
        }

        myHolder.id.setText(current.id);
        myHolder.nama.setText(current.nama);
        myHolder.jabatan.setText("Jabatan: "+jabatan);
        myHolder.alamat.setText("Alamat: "+current.alamat);
        myHolder.jenis_kelamin.setText(current.jenis_kelamin);
        myHolder.usia.setText(current.usia);
        Picasso.with(c).load(current.profil).into(myHolder.profil);
        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                current=dataKonten_karyawen.get(pos);
                Intent intent=new Intent(c, DetailKaryawan.class);
                intent.putExtra("id", current.id);
                intent.putExtra("nama", current.nama);
                intent.putExtra("jabatan", current.jabatan);
                intent.putExtra("alamat", current.alamat);
                intent.putExtra("kelamin", current.jenis_kelamin);
                intent.putExtra("usia", current.usia);
                intent.putExtra("image", current.profil);
                c.startActivity(intent);
            }
        });

        myHolder.setItemLongClickListener(new ItemLongClickListener() {
            @Override
            public void onItemLongClick(final int pos) {
                current=dataKonten_karyawen.get(pos);
                final String id=current.id;
                final String nama=current.nama;
                final String jabatan=current.jabatan;
                final String jenis_kelamin=current.jenis_kelamin;
                final String usia=current.usia;
                final String alamat=current.alamat;
                final String image=current.profil;

                final String[] menu={
                        "Hapus","Edit"
                };

                AlertDialog.Builder builder=new AlertDialog.Builder(c);
                builder.setTitle(nama)
                        .setItems(menu, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int posisi) {
                                String pilih=menu[posisi];
                                if (pilih.equals("Hapus")){
                                    AlertDialog.Builder builder=new AlertDialog.Builder(c);
                                    builder.setMessage("Hapus "+nama+" ?")
                                            .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    hapus(id);
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
                                }else if (pilih.equals("Edit")){
                                    Intent intent=new Intent(c, UpKaryawan.class);
                                    intent.putExtra("id", id);
                                    intent.putExtra("nama", nama);
                                    intent.putExtra("jabatan", jabatan);
                                    intent.putExtra("jenis_kelamin", jenis_kelamin);
                                    intent.putExtra("usia", usia);
                                    intent.putExtra("alamat", alamat);
                                    intent.putExtra("image", image);
                                    c.startActivity(intent);
                                }
                            }
                        });
                AlertDialog dialog=builder.create();
                dialog.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataKonten_karyawen.size();
    }
    public class MyHolder extends RecyclerView.ViewHolder {

        TextView id;
        TextView nama;
        TextView jabatan;
        TextView alamat;
        TextView jenis_kelamin;
        TextView usia;
        ImageView profil;
        ItemClickListener itemClickListener;
        ItemLongClickListener itemLongClickListener;

        public MyHolder(View itemView) {
            super(itemView);
            Context c=null;
            id= (TextView) itemView.findViewById(R.id.itemKaryawan_txtID);
            nama= (TextView) itemView.findViewById(R.id.itemKaryawan_txtNama);
            jabatan= (TextView) itemView.findViewById(R.id.itemKaryawan_txtJabatan);
            alamat= (TextView) itemView.findViewById(R.id.itemKaryawan_txtAlamat);
            jenis_kelamin= (TextView) itemView.findViewById(R.id.itemKaryawan_txtJenisKelamin);
            usia= (TextView) itemView.findViewById(R.id.itemKaryawan_txtUsia);
            profil = (ImageView) itemView.findViewById(R.id.itemKaryawan_Profil);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemClickListener.onItemClick(getLayoutPosition());
                }
            });

            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    itemLongClickListener.onItemLongClick(getLayoutPosition());
                    return true;
                }
            });

        }

        public void setItemClickListener(ItemClickListener ic) {
            this.itemClickListener = ic;
        }
        public void setItemLongClickListener(ItemLongClickListener ilc) {
            this.itemLongClickListener= ilc;
        }
    }
    public void hapus(final String id){
        RequestQueue requestQueue= Volley.newRequestQueue(c);
        String url="http://uasmobile.pe.hu/delKaryawan.php";
        final ProgressDialog pd = new ProgressDialog(c);
        pd.setMessage("Sedang Menghapus...");
        pd.show();
        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                pd.dismiss();
                dialog("Data "+response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                pd.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<String, String>();
                map.put("id", id);
                return map;
            }
        };
        requestQueue.add(request);
    }
    public void dialog(String text){
        AlertDialog.Builder builder=new AlertDialog.Builder(c);
        builder.setMessage(text)
        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }

}
