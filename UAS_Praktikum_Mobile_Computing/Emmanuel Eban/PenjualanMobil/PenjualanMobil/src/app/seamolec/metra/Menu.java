package app.seamolec.metra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Menu extends Activity implements OnClickListener {
	Button btnMasuk, btnTentang, btnKeluar;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		btnMasuk = (Button)findViewById(R.id.button1);
		btnTentang = (Button)findViewById(R.id.button2);
		btnKeluar = (Button)findViewById(R.id.button3);
		
		btnMasuk.setOnClickListener(this);
		btnTentang.setOnClickListener(this);
		btnKeluar.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Intent pilihan = new Intent(this, Pilihan.class);
			startActivity(pilihan);
			break;
		case R.id.button2:
			Intent tentang = new Intent(this, Tentang.class);
			startActivity(tentang);
			break;
		case R.id.button3:
			finish();
	break;
		default:
			break;
		}
	}

}
