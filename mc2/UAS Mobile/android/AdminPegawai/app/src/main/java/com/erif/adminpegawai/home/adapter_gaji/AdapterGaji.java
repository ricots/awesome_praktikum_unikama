package com.erif.adminpegawai.home.adapter_gaji;

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

import com.erif.adminpegawai.R;
import com.erif.adminpegawai.home.DetailKaryawan;
import com.erif.adminpegawai.home.adapter_karyawan.ItemLongClickListener;
import com.squareup.picasso.Picasso;

import java.util.Collections;
import java.util.List;

/**
 * Created by ERIF on 17/12/2016.
 */

public class AdapterGaji extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context c;
    LayoutInflater inflater;
    List<DataKonten_Gaji> dataKonten_gaji= Collections.emptyList();
    DataKonten_Gaji current;

    public AdapterGaji(Context c, List<DataKonten_Gaji> dataKonten_gaji) {
        this.c = c;
        inflater=LayoutInflater.from(c);
        this.dataKonten_gaji = dataKonten_gaji;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.item_gaji,parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final MyHolder myHolder= (MyHolder) holder;
        current=dataKonten_gaji.get(position);
        myHolder.nama.setText(current.nama);
        String jabatan=null;
        if(current.jabatan.equals("jab1")){
            jabatan="Atasan";
        }else if(current.jabatan.equals("jab2")){
            jabatan="Karyawan";
        }else if(current.jabatan.equals("jab3")){
            jabatan="Office boy";
        }
        myHolder.jabatan.setText(jabatan);
        myHolder.jenis_kelamin.setText(current.jenis_kelamin);
        myHolder.alamat.setText(current.alamat);
        myHolder.lembur.setText("Lembur: "+current.lembur+" hari");
        myHolder.gaji.setText("Total: Rp. "+current.gaji);
        Picasso.with(c).load(current.profil).into(myHolder.profil);
        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                current=dataKonten_gaji.get(pos);
                String nama=current.nama;
                String gaji="Total: Rp. "+current.gaji;
                AlertDialog.Builder builder=new AlertDialog.Builder(c);
                builder.setTitle(nama)
                .setMessage(gaji)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
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

    @Override
    public int getItemCount() {
        return dataKonten_gaji.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        ImageView profil;
        TextView nama;
        TextView jabatan;
        TextView jenis_kelamin;
        TextView alamat;
        TextView lembur;
        TextView gaji;
        ItemClickListener itemClickListener;

        public MyHolder(View itemView) {
            super(itemView);
            final Context c=null;
            profil = (ImageView) itemView.findViewById(R.id.itemGaji_Profil);
            nama= (TextView) itemView.findViewById(R.id.itemGaji_txtNama);
            jabatan= (TextView) itemView.findViewById(R.id.itemGaji_txtJabatan);
            jenis_kelamin= (TextView) itemView.findViewById(R.id.itemGaji_txtJenisKelamin);
            alamat= (TextView) itemView.findViewById(R.id.itemGaji_txtAlamat);
            lembur= (TextView) itemView.findViewById(R.id.itemGaji_txtLembur);
            gaji= (TextView) itemView.findViewById(R.id.itemGaji_txtGaji);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemClickListener.onItemClick(getLayoutPosition());
                }
            });

        }

        public void setItemClickListener(ItemClickListener ic) {
            this.itemClickListener = ic;
        }

    }

}
