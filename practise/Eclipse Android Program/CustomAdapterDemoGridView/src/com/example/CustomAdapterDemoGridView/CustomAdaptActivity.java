package com.example.CustomAdapterDemoGridView;

import com.example.customadapterdemo1.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class CustomAdaptActivity extends Activity {
	GridView gridView ;
	
	String names[]= {"Apples","Banana","Berrirs","Cherries","Grapes","Kiwi","Melon","Orange","Pomegrante"};
	int img[]= {R.drawable.apples,R.drawable.banana,R.drawable.berries,R.drawable.cherries,
			     R.drawable.grapes,R.drawable.kiwi,R.drawable.melon,R.drawable.orange,R.drawable.pomegranate};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_adapt);
		
		gridView=(GridView)findViewById(R.id.gridView1);
		GridAdapter adapt=new GridAdapter(CustomAdaptActivity.this, names, img);
		gridView.setAdapter(adapt);
		gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(CustomAdaptActivity.this,"Clicked Fruit:" +names[position], Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.custom_adapt, menu);
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
