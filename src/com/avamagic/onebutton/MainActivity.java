package com.avamagic.onebutton;

import java.text.DateFormat;
import java.util.Date;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void doSomething(View view) {
		TextView resultView = (TextView)this.findViewById(R.id.text_result);
		resultView.setText(DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL).format(new Date()));
	}

}
