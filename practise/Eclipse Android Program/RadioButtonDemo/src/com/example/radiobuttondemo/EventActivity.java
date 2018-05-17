package com.example.radiobuttondemo;

import android.annotation.SuppressLint;
import android.app.Activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

@SuppressLint("CutPasteId")
public class EventActivity extends Activity {
   RadioGroup rGroup;
   RadioButton r1,r2,r3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event);
		rGroup=(RadioGroup)findViewById(R.id.rgOpinion);
		
		
		rGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				if(checkedId==R.id.ba)
				{
					Toast.makeText(EventActivity.this, "B.A", Toast.LENGTH_SHORT).show();
				}
				
				if(checkedId==R.id.be)
				{
					Toast.makeText(EventActivity.this, "B.E", Toast.LENGTH_SHORT).show();
				}
				
				if(checkedId==R.id.mca)
				{
					Toast.makeText(EventActivity.this, "MCA", Toast.LENGTH_SHORT).show();
				}
				
				if(checkedId==R.id.law)
				{
					Toast.makeText(EventActivity.this, "LAW", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
	}
	/*	 public void onRadioButtonClicked(View v)
		    {
		
		r1=(RadioButton)findViewById(R.id.Radio_Android);
		r2=(RadioButton)findViewById(R.id.Radio_IOS);
		r3=(RadioButton)findViewById(R.id.Radio_Windows_Phone);
	
			
				  boolean  checked = ((RadioButton) v).isChecked();
				  switch(v.getId()){

		            case R.id.Radio_Windows_Phone:
		                if(checked)
		                    r3.setTypeface(null, Typeface.BOLD_ITALIC);
		                    r2.setTypeface(null, Typeface.NORMAL);
		                    r1.setTypeface(null, Typeface.NORMAL);
		                break;

		            case R.id.Radio_IOS:
		                if(checked)
		                    r2.setTypeface(null, Typeface.BOLD_ITALIC);
		                    r1.setTypeface(null, Typeface.NORMAL);
		                    r3.setTypeface(null, Typeface.NORMAL);
		                
		                break;

		            case R.id.Radio_Android:
		                if(checked)
		                    r1.setTypeface(null, Typeface.BOLD_ITALIC);
		                    r2.setTypeface(null, Typeface.NORMAL);
		                    r3.setTypeface(null, Typeface.NORMAL);
		                break;
		        }
			}
		*/
		
		    
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event, menu);
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
