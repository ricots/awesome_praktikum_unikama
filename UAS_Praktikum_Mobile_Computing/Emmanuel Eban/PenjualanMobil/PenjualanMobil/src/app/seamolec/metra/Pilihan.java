package app.seamolec.metra;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class Pilihan extends Activity implements OnClickListener {
	String [] harga={"<300 juta","300-500 juta","500-800 juta","800-1 milyar","1 milyar keatas"}; 	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		final Context c = null;
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pilihan);
		
		ListView lv = (ListView)findViewById(R.id.listView1);
	       lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,harga));
	       lv.setOnItemClickListener(new OnItemClickListener() {
	   		public void onItemClick(AdapterView<?> arg0, View arg1, 
	       			int arg2,long arg3){
//	       			Toast.makeText(getApplicationContext(),	((TextView) arg1).getText(), Toast.LENGTH_SHORT).show();
//	       			Intent mobil = new Intent(getApplicationContext(),Tampilan.class);
//					startActivity(mobil);
	       			if(arg2==0){
	       				Intent mobil = new Intent(getApplicationContext(),Tampilan.class);
						startActivity(mobil);
	       			}else if(arg2==1){
	       				Intent mobil1 = new Intent(getApplicationContext(),Tampilan2.class);
						startActivity(mobil1);
	       			}else if(arg3==2){
	       				Intent mobil1 = new Intent(getApplicationContext(),Tampilan3.class);
						startActivity(mobil1);
	       			}else if(arg3==3){
	       				Intent mobil1 = new Intent(getApplicationContext(),Tampilan4.class);
						startActivity(mobil1);
	       			}else if(arg2==4){
	       				Intent mobil1 = new Intent(getApplicationContext(),Tampilan5.class);
						startActivity(mobil1);
	       					       			}
	   		}
			});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
			}
	}


