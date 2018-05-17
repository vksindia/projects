package com.example.checkboxdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class EnableDisableActivity extends Activity {

	CheckBox engg,medical,law;
	Button enable,disable;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enable_disable);
		engg=(CheckBox)findViewById(R.id.checkBox1);
		medical=(CheckBox)findViewById(R.id.checkBox2);
		law=(CheckBox)findViewById(R.id.checkBox3);
		
		enable=(Button)findViewById(R.id.button1);
		disable=(Button)findViewById(R.id.button2);
		
		enable.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				engg.setEnabled(true);
				medical.setEnabled(true);
				law.setEnabled(true);	
			}
		});
		
		disable.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				engg.setEnabled(false);
				medical.setEnabled(false);
				law.setEnabled(false);	
				
				engg.setChecked(false);
				medical.setChecked(false);
				law.setChecked(false);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.enable_disable, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
