package doa.islam;


import android.app.ListActivity;


import android.content.Intent;

import android.os.Bundle; //import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class menuquran extends ListActivity {
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		        

		// Create an array of Strings, that will be put to our ListActivity
		String[] menuquran = new String[] { "Do'a Agar Diberi Jodoh", "Do'a Supaya Diperlakukan Adil","Do'a Agar Diberi Kemudahan Urusan", "Do'a Sapu jagad", "Do'a Menghadapi Lawan","Do'a Menjauhi Kesesatan","Do'a Diberi Keselamatan","Do'a Agar Terhindar Dari Siksa Neraka","Do'a Agar Diberi Limpahan Rezeki", "Do'a Agar Mendapat Kedudukan Yang Mulia" };
		// Create an ArrayAdapter, that will actually make the Strings above
		// appear in the ListView
		// Menset nilai array ke dalam list adapater sehingga data pada array
		// akan dimunculkan dalam list
		this.setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, menuquran));
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
			if (pilihan.equals("Do'a Agar Diberi Jodoh")) {
				i = new Intent(this, dd1.class);
			} else if (pilihan.equals("Do'a Supaya Diperlakukan Adil")) {
				i = new Intent(this, dd2.class);
			} else if (pilihan.equals("Do'a Agar Diberi Kemudahan Urusan")) {
				i = new Intent(this, dd3.class);
			} else if (pilihan.equals("Do'a Sapu jagad")) {
				i = new Intent(this, dd4.class);
			} else if (pilihan.equals("Do'a Menghadapi Lawan")) {
				i = new Intent(this, dd5.class);
			} else if (pilihan.equals("Do'a Menjauhi Kesesatan")) {
				i = new Intent(this, dd6.class);
			} else if (pilihan.equals("Do'a Diberi Keselamatan")) {
				i = new Intent(this, dd7.class);
			} else if (pilihan.equals("Do'a Agar Terhindar Dari Siksa Neraka")) {
				i = new Intent(this, dd8.class);
			} else if (pilihan.equals("Do'a Agar Diberi Limpahan Rezeki")) {
				i = new Intent(this, dd9.class);
			} else if (pilihan.equals("Do'a Agar Mendapat Kedudukan Yang Mulia")) {
				i = new Intent(this, dd10.class);
			
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