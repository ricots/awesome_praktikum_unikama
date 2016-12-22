package app.seamolec.metra;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class A1 extends Activity{
	Linkify no;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a1);
		
		TextView nomor=(TextView) findViewById(R.id.textView4); 
		no.addLinks(nomor, Linkify.ALL);
	}

}
