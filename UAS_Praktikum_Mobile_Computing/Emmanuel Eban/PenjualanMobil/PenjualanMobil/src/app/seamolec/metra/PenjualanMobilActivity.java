package app.seamolec.metra;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class PenjualanMobilActivity extends Activity {
    /** Called when the activity is first created. */
	Context ctx = this;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Thread splashThread = new Thread() {
			public void run() {
				try {
					int waited = 0;
					while (waited < 2) {
						sleep(1000);
						waited++;
					}
				} catch (InterruptedException e) {

				} finally {
					finish();
					Intent intent = new Intent(ctx, Menu.class);
					startActivity(intent);
					//stop();
				}
			}
		};
		splashThread.start();
	}

	public void run() {
		int val = 1;
		while (val < 5)
			try {
				val++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			} finally {
				finish();
				Intent intent = new Intent(this, Menu.class);
				startActivity(intent);
			}
	}

    }
