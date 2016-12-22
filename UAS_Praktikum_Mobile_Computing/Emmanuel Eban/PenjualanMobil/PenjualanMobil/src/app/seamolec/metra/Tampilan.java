package app.seamolec.metra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;


public class Tampilan extends Activity implements OnClickListener{
	ImageButton btnMobil1, btnMobil2, btnMobil3;
	@Override
	public void onCreate(Bundle savedInstanceState) {
//		 TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tampilan);
		
		btnMobil1 = (ImageButton)findViewById(R.id.imageButton1);
		btnMobil2 = (ImageButton)findViewById(R.id.imageButton2);
		btnMobil3 = (ImageButton)findViewById(R.id.imageButton3);
		
		btnMobil1.setOnClickListener(this);
		btnMobil2.setOnClickListener(this);
		btnMobil3.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.imageButton1:
			Intent a1 = new Intent(this, A1.class);
			startActivity(a1);
			break;
		case R.id.imageButton2:
			Intent a2 = new Intent(this, A2.class);
			startActivity(a2);
			break;
		case R.id.imageButton3:
			Intent a3 = new Intent (this, A3.class);
			startActivity(a3);
			break;
		default:
			break;
		}
	}

}
