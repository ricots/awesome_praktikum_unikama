package com.example.ayo_dolan;

import java.security.PublicKey;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends Activity {
	
	ArrayAdapter<String>a;
	
	Button btnmalang, btnblitar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);

		
		btnmalang=(Button)findViewById(R.id.btnmalang);
		btnblitar=(Button)findViewById(R.id.btnblitar);
		
		btnmalang.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Intent myintent= new Intent(MainActivity2.this, MainActivity3.class);
	                startActivity(myintent);
	                
	                playBeep("mlg.wav");

				
			}
			
		});
		btnblitar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Intent myintent= new Intent(MainActivity2.this, MainActivity4.class);
	                startActivity(myintent);
	                
	                playBeep("blitr.wav");

				
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity2, menu);
		return true;
		
	}
	public void playBeep(String soundfile) {
    	MediaPlayer m;
    	try {
    		m = new MediaPlayer();
    		// AssetManager mngr = getAssets();
    		if (m.isPlaying()) {
    			m.stop();
    			m.release();
    			m = new MediaPlayer();
    		}
    		AssetFileDescriptor descriptor = getAssets().openFd(soundfile);
    		m.setDataSource(descriptor.getFileDescriptor(),
    				descriptor.getStartOffset(), descriptor.getLength());
    		descriptor.close();

    		m.prepare();
    		m.setVolume(1f, 1f);
    		// m.setLooping(true);
    		m.start();
    	} catch (Exception e) {
    	}
    }
	
}
