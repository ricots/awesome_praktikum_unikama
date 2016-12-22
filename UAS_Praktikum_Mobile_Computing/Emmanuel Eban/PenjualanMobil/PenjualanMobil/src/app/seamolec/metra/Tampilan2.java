package app.seamolec.metra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Tampilan2 extends Activity implements OnClickListener{
	ImageButton btnMobil1, btnMobil2, btnMobil3;

	@Override
	public void onCreate(Bundle savedInstanceState) {
//		 TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tampilan2);
		
		btnMobil1 = (ImageButton)findViewById(R.id.imageButton4);
		btnMobil2 = (ImageButton)findViewById(R.id.imageButton5);
		btnMobil3 = (ImageButton)findViewById(R.id.imageButton6);
		
		btnMobil1.setOnClickListener(this);
		btnMobil2.setOnClickListener(this);
		btnMobil3.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.imageButton4:
			Intent a1 = new Intent(this, B1.class);
			startActivity(a1);
			break;
		case R.id.imageButton5:
			Intent a2 = new Intent(this, B2.class);
			startActivity(a2);
			break;
		case R.id.imageButton6:
			Intent a3 = new Intent (this, B3.class);
			startActivity(a3);
			break;
		default:
			break;
		}
	}

}
