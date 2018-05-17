package com.example.textviewdemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LayoutParams layout = new LinearLayout.LayoutParams(
				 LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
				 
				 LinearLayout linearLayout = new LinearLayout(this);
				 linearLayout.setOrientation(LinearLayout.VERTICAL);
			
				 TextView textView=new TextView(this);
				 textView.setText("Welcome to Vks....");
				 textView.setTextSize(30);
				 textView.setTextColor(Color.parseColor("#7D3C98"));
				  
				 textView.setLayoutParams(layout);
				 linearLayout.addView(textView);
				 
				 
				 TextView textView1=new TextView(this);
				 textView1.setText("Welcome to Vks....");
				 textView1.setTextSize(50);
				 textView1.setTextColor(Color.parseColor("#6E2C00"));
				 textView1.setLayoutParams(layout);
				 linearLayout.addView(textView1);
				 
				 this.setContentView(linearLayout, new LinearLayout.LayoutParams(
				 LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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