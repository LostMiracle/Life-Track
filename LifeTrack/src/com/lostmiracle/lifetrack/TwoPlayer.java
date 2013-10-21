package com.lostmiracle.lifetrack;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TwoPlayer extends Activity {

	int counter, pcounter, counter2, pcounter2;
	Button add1, add5, sub1, sub5, padd1, psub1, add12, add52, sub12, sub52,
			padd12, psub12;
	TextView display, pdisplay, display2, pdisplay2;

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// here you can handle orientation change
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.twoplayer);
		display2.setRotation(180);
		pdisplay2.setRotation(180);
		sub52.setRotation(180);
		sub12.setRotation(180);
		add52.setRotation(180);
		add12.setRotation(180);
		psub12.setRotation(180);
		padd12.setRotation(180);

		pcounter = 0;
		counter = 20;
		padd1 = (Button) findViewById(R.id.padd1);
		psub1 = (Button) findViewById(R.id.psub1);
		add1 = (Button) findViewById(R.id.add_one);
		add5 = (Button) findViewById(R.id.add_five);
		sub1 = (Button) findViewById(R.id.minus_one);
		sub5 = (Button) findViewById(R.id.minus_five);
		display = (TextView) findViewById(R.id.tvCounter);
		pdisplay = (TextView) findViewById(R.id.tvPoison);

		pcounter2 = 0;
		counter2 = 20;
		padd12 = (Button) findViewById(R.id.padd12);
		psub12 = (Button) findViewById(R.id.psub12);
		add12 = (Button) findViewById(R.id.add_one2);
		add52 = (Button) findViewById(R.id.add_five2);
		sub12 = (Button) findViewById(R.id.minus_one2);
		sub52 = (Button) findViewById(R.id.minus_five2);
		display2 = (TextView) findViewById(R.id.tvCounter2);
		pdisplay2 = (TextView) findViewById(R.id.tvPoison2);

		pdisplay.bringToFront();
		display.bringToFront();
		pdisplay2.bringToFront();
		display2.bringToFront();

		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		add1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				display.setText("" + counter);
			}
		});
		add5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter += 5;
				display.setText("" + counter);
			}
		});
		sub1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				display.setText("" + counter);
			}
		});
		sub5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter -= 5;
				display.setText("" + counter);
			}
		});
		padd1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				pcounter++;
				pdisplay.setText("" + pcounter);
			}
		});
		psub1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				pcounter--;
				pdisplay.setText("" + pcounter);
			}
		});

		// second player

		add12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter2++;
				display2.setText("" + counter2);
			}
		});
		add52.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter2 += 5;
				display2.setText("" + counter2);
			}
		});
		sub12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter2--;
				display2.setText("" + counter2);
			}
		});
		sub52.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter2 -= 5;
				display2.setText("" + counter2);
			}
		});
		padd12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				pcounter2++;
				pdisplay2.setText("" + pcounter2);
			}
		});
		psub12.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				pcounter2--;
				pdisplay2.setText("" + pcounter2);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// check selected menu item
		// R.id.exit is @+id/exit
		if (item.getItemId() == R.id.exit) {
			// close the Activity
			this.finish();
			return true;
		}
		if (item.getItemId() == R.id.twoplayer) {
			// do nothing
			return true;
		}
		if (item.getItemId() == R.id.reset) {
			// reset the Activity
			counter = 20;
			pcounter = 0;
			pdisplay.setText("" + 0);
			display.setText("" + 20);
			counter2 = 20;
			pcounter2 = 0;
			pdisplay2.setText("" + 0);
			display2.setText("" + 20);
			return true;
		}
		if (item.getItemId() == R.id.oneplayer) {
			// 1 player
			Thread timer = new Thread() {
				public void run() {
					try {
						sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						Intent openMainActivity = new Intent(
								"com.lostmiracle.lifetrack.MAINACTIVITY");
						startActivity(openMainActivity);
					}
				}
			};
			timer.start();
			return true;
		}
		// if (item.getItemId() == R.id.mainmenu) {
		// main menu
		// return true;
		// }
		return false;

	}

	// @Override
	// protected void onPause() {
	// TODO Auto-generated method stub
	// super.onPause();
	// introSound.release();
	// finish();
	// }

}
