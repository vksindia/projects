package com.example.buttondemo1;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class ButtonActivity extends Activity {
Button change,enable,disable,dynamic;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_button);
		change=(Button)findViewById(R.id.button1);
		enable=(Button)findViewById(R.id.button2);
		disable=(Button)findViewById(R.id.button3);

		
      enable.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			change.setEnabled(true);
			
		}
	});
      
      disable.setOnClickListener(new OnClickListener() {
  		
  		@Override
  		public void onClick(View v) {
  			change.setEnabled(false);
  			
  		}
  	});
      
      dynamic=(Button)findViewById(R.id.dynamic);
      dynamic.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),DynamicButtonActivity.class);
				startActivity(intent);
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.button, menu);
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
