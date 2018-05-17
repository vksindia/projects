package com.example.edittext1demo;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EnableDisableActivity extends Activity {

	Button enable;
	Button disable;
	EditText editText;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enable_disable);
		
		enable=(Button)findViewById((R.id.button1));
		disable=(Button)findViewById(R.id.button2);
		editText=(EditText)findViewById(R.id.editText1);
		
		enable.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				editText.setEnabled(true);
				
				Toast.makeText(EnableDisableActivity.this, "Enabled EditText", Toast.LENGTH_SHORT).show();
				
			}
		});
		
		disable.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				editText.setEnabled(false);
				Toast.makeText(EnableDisableActivity.this, "Disabled EditText", Toast.LENGTH_SHORT).show();
				
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
