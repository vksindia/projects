package com.example.addition;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button add;
	 EditText num1,num2;
	    TextView result;
	    int res;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		add=(Button)findViewById(R.id.button1);
		num1=(EditText)findViewById(R.id.editText1);
		num2=(EditText)findViewById(R.id.editText2);
		result=(TextView)findViewById(R.id.editText3);
		
		
		
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String no1=num1.getText().toString();
				final int num11=Integer.parseInt(no1);
				
				String no2=num2.getText().toString();
				final int num12=Integer.parseInt(no2);
				res=num11+num12;
				result.setText(Integer.toString(res));
				
			}
		});
	
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
