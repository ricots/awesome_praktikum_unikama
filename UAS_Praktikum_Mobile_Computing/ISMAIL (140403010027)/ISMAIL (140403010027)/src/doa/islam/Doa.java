package doa.islam;


import android.app.Activity;

import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.content.Intent;

public class Doa extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awal);
        
        View gambar=
    findViewById(R.id.gambar);
        gambar.setOnClickListener(this);
        
       
    }
    public void onClick(View v){
    	switch (v.getId()){
    	case R.id.gambar:
    		Intent menu= new Intent (this, menu.class);
    		startActivity(menu);
    		break;
    	
    		
    		
    	}
    	}
    }
