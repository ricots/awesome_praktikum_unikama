package app.seamolec.metra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Tampilan5 extends Activity implements OnClickListener {
	ImageButton btnMobil1;
	public void onCreate(Bundle savedInstanceState) {
//		 TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tampilan5);
		
		btnMobil1 = (ImageButton)findViewById(R.id.imageButton1);
	
		btnMobil1.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.imageButton1:
			Intent i1 = new Intent(this, I1.class);
			startActivity(i1);
			break;
		default:
			break;
		}
	}
}
