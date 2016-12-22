package app.seamolec.metra;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class I1 extends Activity{
	Linkify no;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.i1);
		
		TextView nomor=(TextView) findViewById(R.id.textView1); 
		no.addLinks(nomor, Linkify.ALL);
	}
}
