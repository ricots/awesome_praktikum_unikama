package app.seamolec.metra;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class B3 extends Activity{
	Linkify no;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.b3);
		
		TextView nomor=(TextView) findViewById(R.id.textView9); 
		no.addLinks(nomor, Linkify.ALL);
	}

}
