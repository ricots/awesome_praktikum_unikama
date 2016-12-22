package doa.islam;



import android.app.AlertDialog;


import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle; //import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class menu extends ListActivity {
	
	
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
					        

		// Create an array of Strings, that will be put to our ListActivity
		String[] menu = new String[] { "Do'a Bersumber Al Qur'an", "Do'a Bersumber Hadis","Bantuan", "About", "Exit" };
		
		
		// Menset nilai array ke dalam list adapater sehingga data pada array
		// akan dimunculkan dalam list
		this.setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, menu));
				getListView().setBackgroundResource(R.drawable.bg);
		
	}

	@Override
	/**method ini akan mengoveride method onListItemClick yang ada pada class List Activity
	 * method ini akan dipanggil apabilai ada salah satu item dari list menu yang dipilih
	 */
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		// Get the item that was clicked
		// Menangkap nilai text yang dklik
		Object o = this.getListAdapter().getItem(position);
		String pilihan = o.toString();
		// Menampilkan hasil pilihan menu dalam bentuk Toast
		tampilkanPilihan(pilihan);
		
	}

	/**
	 * Tampilkan Activity sesuai dengan menu yang dipilih
	 * 
	 */
	protected void tampilkanPilihan(String pilihan) {
		try {
			// Intent digunakan untuk sebagai pengenal suatu activity
			Intent i = null;
			if (pilihan.equals("Do'a Bersumber Al Qur'an")) {
				i = new Intent(this, menuquran.class);
			} else if (pilihan.equals("Do'a Bersumber Hadis")) {
				i = new Intent(this, menuhadis.class);
			} else if (pilihan.equals("Bantuan")) {
				i = new Intent(this, help.class);
			} else if (pilihan.equals("About")) {
				i = new Intent(this, about.class);
			} else if (pilihan.equals("Exit")) {
				// Intent exit = new Intent(Intent.ACTION_MAIN);
				// startActivity(exit);
				AlertDialog.Builder builder = new AlertDialog.Builder(this);
				builder.setMessage("Anda Yakin Ingin Menutup Aplikasi?")
						.setCancelable(false).setPositiveButton("Ya",
								new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog,
											int id) {
										Intent exit = new Intent(
												Intent.ACTION_MAIN);
										exit.addCategory(Intent.CATEGORY_HOME);
										exit
												.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
										startActivity(exit);
									}
								}).setNegativeButton("Tidak",
								new DialogInterface.OnClickListener() {
									public void onClick(DialogInterface dialog,
											int id) {
										dialog.cancel();
									}
								}).show();
			
			} else {
				Toast.makeText(
						this,
						"Anda Memilih: " + pilihan
								+ " , Actionnya belum dibuat",
						Toast.LENGTH_LONG).show();
			}
			startActivity(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}