package fti.unikama;

import fti.unikama.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaran extends Activity implements OnClickListener {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lingkaran);
		
		Button btnklik=(Button)findViewById(R.id.button1);
		btnklik.setOnClickListener(this);

}

public void onClick (View v) {
		
		EditText edtJari = (EditText) findViewById(R.id.editText1);
		TextView tvLuas = (TextView)  findViewById(R.id.textView3);
		double jari = Double.valueOf(edtJari.getText().toString());
		double luas =  3.14 * jari*jari;
		tvLuas.setText("Luas adalah : " +luas);
	}

}

