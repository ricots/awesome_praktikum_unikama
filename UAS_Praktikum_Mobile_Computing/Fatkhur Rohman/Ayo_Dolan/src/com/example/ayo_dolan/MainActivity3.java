package com.example.ayo_dolan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends Activity {

	TextView Tv1, Tv2, Tv3;
	ImageView Img1, Img2, Img3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);
		Tv1 = (TextView)findViewById(R.id.tv1);
		Tv2 = (TextView)findViewById(R.id.tv2);
		Tv3 = (TextView)findViewById(R.id.tv3);
		Img1 = (ImageView)findViewById(R.id.img1);
		Img2 = (ImageView)findViewById(R.id.img2);
		Img3 = (ImageView)findViewById(R.id.img3);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity3, menu);
		return true;
	}

}
