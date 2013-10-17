package com.lostmiracle.lifetrack;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	int counter, pcounter;
	Button add1, add5, sub1, sub5, padd1, psub1, bReset;
	TextView display, pdisplay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		pcounter = 0;
		counter = 20;
		padd1 = (Button) findViewById(R.id.padd1);
		psub1 = (Button) findViewById(R.id.psub1);
		add1 = (Button) findViewById(R.id.add_one);
		add5 = (Button) findViewById(R.id.add_five);
		sub1 = (Button) findViewById(R.id.minus_one);
		sub5 = (Button) findViewById(R.id.minus_five);
		bReset = (Button) findViewById(R.id.bReset);
		display = (TextView) findViewById(R.id.tvCounter);
		pdisplay = (TextView) findViewById(R.id.tvPoison);

		pdisplay.bringToFront();
		add1.bringToFront();
		add5.bringToFront();
		sub1.bringToFront();
		sub5.bringToFront();
		display.bringToFront();

		bReset.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter = 20;
				pcounter = 0;
				pdisplay.setText("" + 0);
				display.setText("" + 20);
			}
		});
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
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
