package com.example.radiobuttondemo;



import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioActivity extends Activity {

	   RadioGroup rgOpinion;
	    Button submit;
	    RadioButton excellent,good,avg,poor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio);
		rgOpinion = (RadioGroup) findViewById(R.id.rgOpinion);
		excellent=(RadioButton)findViewById(R.id.radiobtnexclnt);
		good=(RadioButton)findViewById(R.id.radiobtngood);
		avg=(RadioButton)findViewById(R.id.radiobtnavg);
		poor=(RadioButton)findViewById(R.id.radiobtnpoor);
        submit = (Button) findViewById(R.id.button1);
		
        submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(excellent.isChecked())
				{
					Toast.makeText(RadioActivity.this, "Excellent", Toast.LENGTH_SHORT).show();
				}
				
				if(good.isChecked())
				{
					Toast.makeText(RadioActivity.this, "Good", Toast.LENGTH_SHORT).show();
				}
				
				if(avg.isChecked())
				{
					Toast.makeText(RadioActivity.this, "Average", Toast.LENGTH_SHORT).show();
				}
				
				if(poor.isChecked())
				{
					Toast.makeText(RadioActivity.this, "Poor", Toast.LENGTH_SHORT).show();
				}
				
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.radio, menu);
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