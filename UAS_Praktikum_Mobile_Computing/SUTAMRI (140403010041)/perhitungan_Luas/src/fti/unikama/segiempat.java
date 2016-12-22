package fti.unikama;

import fti.unikama.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class segiempat extends Activity implements OnClickListener {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.segiempat);
		
		Button btnklik=(Button)findViewById(R.id.button1);
		btnklik.setOnClickListener(this);

}

public void onClick (View v) {
		
		EditText edtPanjang = (EditText) findViewById(R.id.editText1);
		EditText edtLebar = (EditText) findViewById(R.id.editText2);
		TextView tvLuas = (TextView)  findViewById(R.id.textView4);
		double panjang = Double.valueOf(edtPanjang.getText().toString());
		double lebar = Double.valueOf(edtLebar.getText().toString());
		double luas =  panjang * lebar;
		tvLuas.setText("Luas adalah : " +luas);
	}

}