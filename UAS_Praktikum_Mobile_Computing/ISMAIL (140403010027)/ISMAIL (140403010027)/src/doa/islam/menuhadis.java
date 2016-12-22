package doa.islam;



import android.app.ListActivity;


import android.content.Intent;
import android.os.Bundle; //import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class menuhadis extends ListActivity {
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		
		

		// Create an array of Strings, that will be put to our ListActivity
		String[] menuhadis = new String[] { "Do'a Akan Makan", "Do'a Sesudah Makan","Do'a Akan Tidur", "Do'a Bangun Tidur", "Do'a Masuk Masjid","Do'a Keluar Masjid","Do'a Masuk Rumah","Do'a Keluar Rumah","Do'a Masuk Toilet", "Do'a Keluar Toilet" };
		// Create an ArrayAdapter, that will actually make the Strings above
		// appear in the ListView
		// Menset nilai array ke dalam list adapater sehingga data pada array
		// akan dimunculkan dalam list
		this.setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, menuhadis));
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
			if (pilihan.equals("Do'a Akan Makan")) {
				i = new Intent(this, d1.class);
			} else if (pilihan.equals("Do'a Sesudah Makan")) {
				i = new Intent(this, d2.class);
			} else if (pilihan.equals("Do'a Akan Tidur")) {
				i = new Intent(this, d3.class);
			} else if (pilihan.equals("Do'a Bangun Tidur")) {
				i = new Intent(this, d4.class);
			} else if (pilihan.equals("Do'a Masuk Masjid")) {
				i = new Intent(this, d5.class);
			} else if (pilihan.equals("Do'a Keluar Masjid")) {
				i = new Intent(this, d6.class);
			} else if (pilihan.equals("Do'a Masuk Rumah")) {
				i = new Intent(this, d7.class);
			} else if (pilihan.equals("Do'a Keluar Rumah")) {
				i = new Intent(this, d8.class);
			} else if (pilihan.equals("Do'a Masuk Toilet")) {
				i = new Intent(this, d9.class);
			} else if (pilihan.equals("Do'a Keluar Toilet")) {
				i = new Intent(this, d10.class);
			
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