package com.example.wearemania;


import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button btnSignIn,btnSignUp;
	LoginActivity loginactivity;
	EditText editTextUserName, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
	     setContentView(R.layout.activity_main);
	     
	     // create a instance of SQLite Database
	     loginactivity=new LoginActivity(this);
	     loginactivity=loginactivity.open();
	     
	     // Get The Refference Of Buttons
	     btnSignIn=(Button)findViewById(R.id.buttonSignIn);
	     btnSignUp=(Button)findViewById(R.id.buttonSignUP);
	     editTextUserName=(EditText)findViewById(R.id.editTextUserNameToLogin);
		 editTextPassword=(EditText)findViewById(R.id.editTextPasswordToLogin);
		 
		 btnSignIn.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// get The User name and Password
					String userName=editTextUserName.getText().toString();
					String password=editTextPassword.getText().toString();
					
					// fetch the Password form database for respective user name
					String storedPassword=loginactivity.getSinlgeEntry(userName);
					
					// check if the Stored password matches with  Password entered by user
					if(password.equals(storedPassword))
					{
						Intent intentSignIn=new Intent(MainActivity.this, MainActivity1.class);
						startActivity(intentSignIn);						
						
					}
					else
					{
						Toast.makeText(MainActivity.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
					}
				}
			});
			
	    // Set OnClick Listener on SignUp button 
	    btnSignUp.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			/// Create Intent for SignUpActivity  and Start The Activity
			Intent intentSignUP=new Intent(MainActivity.this, SignupActivity.class);
			startActivity(intentSignUP);
			}
		});
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
	    // Close The Database
		loginactivity.close();
	}
}
