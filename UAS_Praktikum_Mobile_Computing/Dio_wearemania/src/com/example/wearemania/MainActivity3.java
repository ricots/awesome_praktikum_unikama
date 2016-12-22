package com.example.wearemania;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends Activity {
	
	TextView Tv4, Tv5, Tv6;
	ImageView Img4, Img5, Img6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity3);
		Tv4 = (TextView)findViewById(R.id.tv4);
		Tv5 = (TextView)findViewById(R.id.tv5);
		Img4 = (ImageView)findViewById(R.id.img4);
		Img5 = (ImageView)findViewById(R.id.img5);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity3, menu);
		return true;
	}

}
