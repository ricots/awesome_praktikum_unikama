package fti.unikama;

import fti.unikama.R;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void klikPage1(View v){
		Intent isegitiga = new Intent (this,segitiga.class);
		startActivity (isegitiga);
		
	}
	public void klikPage2(View v){
		Intent isegiEmpat = new Intent (this,segiempat.class);
		startActivity (isegiEmpat);
		
	}
	public void klikPage3(View v){
		Intent iLingkaran = new Intent (this,lingkaran.class);
		startActivity (iLingkaran);
		
	}
	public void klikPage4 (View v){
		Intent ipersegipanjang = new Intent (this,persegipanjang.class);
		startActivity(ipersegipanjang);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
