package com.erif.adminpegawai;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class Login extends AppCompatActivity {

    TextInputLayout txInUser, txInPassword;
    String url ,username,password;
    EditText edUsername;
    EditText edPassword;
    Button btnLogin;
    RequestQueue requestQueue;
    SharedPreferences sp;
    SharedPreferences.Editor edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        txInUser=(TextInputLayout) findViewById(R.id.layUsername);
        txInPassword=(TextInputLayout) findViewById(R.id.layPassword);
        edUsername=(EditText)findViewById(R.id.edUsername);
        edPassword=(EditText)findViewById(R.id.edPassword);
        btnLogin=(Button)findViewById(R.id.btbLogin);
        requestQueue= Volley.newRequestQueue(getApplicationContext());
        sp=getSharedPreferences("setting", MODE_PRIVATE);
        edit=sp.edit();
        cekLogin();

        edUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (txInUser.isErrorEnabled()){
                    txInUser.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        edPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (txInPassword.isErrorEnabled()){
                    txInPassword.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edUsername.getText().toString().equals("") && edPassword.getText().toString().equals("")){
                    txInUser.setError("Masukan Username");
                    txInPassword.setError("Masukan Password");
                }else if (edPassword.getText().toString().equals("")){
                    txInPassword.setError("Masukan Password");
                }else if (edUsername.getText().toString().equals("")){
                    txInUser.setError("Masukan Username");
                }else {
                    username=edUsername.getText().toString();
                    password=edPassword.getText().toString();
                    url="http://uasmobile.pe.hu/login.php";
                    login(url,username,password);
                }

            }
        });

    }

    public void login(String url, final String user, final String pass){
        final ProgressDialog dialog=new ProgressDialog(Login.this);
        dialog.setMessage("Loading..");
        dialog.show();
        StringRequest request=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), response.toString(), Toast.LENGTH_SHORT).show();
                if (response.toString().equals("berhasil")){
                    dialog.dismiss();
                    Intent intent=new Intent(Login.this, Home.class);
                    startActivity(intent);
                    edit.putString("login", "true");
                    edit.putString("username", edUsername.getText().toString());
                    edit.commit();
                    finish();
                }else {
                    loginFailed(response.toString());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                dialog.dismiss();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map=new HashMap<String, String>();
                map.put("username", user);
                map.put("password", pass);
                return map;
            }
        };
        requestQueue.add(request);
    }

    public void loginFailed(String text){
        AlertDialog.Builder builder=new AlertDialog.Builder(Login.this);
        builder.setTitle("Warning")
        .setMessage(text)
        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }

    public void cekLogin(){
        String status=sp.getString("login", "");
        if (status.isEmpty()){

        }else if (status.equals("true")){
            startActivity(new Intent(Login.this, Home.class));
            finish();
        }else {

        }
    }

}
