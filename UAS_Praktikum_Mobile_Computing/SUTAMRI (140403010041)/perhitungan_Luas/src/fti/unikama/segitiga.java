package fti.unikama;

import fti.unikama.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segitiga extends Activity implements OnClickListener {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segitiga);
		
		Button btnklik=(Button)findViewById(R.id.button1);
		btnklik.setOnClickListener(this);
	}
	
	
	public void onClick (View v) {
		
		EditText etAlas = (EditText) findViewById(R.id.editText1);
		EditText etTinggi = (EditText) findViewById(R.id.editText2);
		TextView tvLuas = (TextView)  findViewById(R.id.textView4);
		double alas = Double.valueOf(etAlas.getText().toString());
		double tinggi = Double.valueOf(etTinggi.getText().toString());
		double luas = 0.5 * alas *tinggi;
		tvLuas.setText("Luas adalah : " + luas);
	}

}
