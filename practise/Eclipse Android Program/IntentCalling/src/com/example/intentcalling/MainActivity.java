package com.example.intentcalling;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText editText;
	 Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button=(Button)findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				editText = (EditText) findViewById(R.id.editText1);
			     String value=editText.getText().toString();
				 Intent intent=new Intent(getApplicationContext(),DisplayActivity.class);  
				 intent.putExtra("key", value); //Optional parameters
				 MainActivity.this.startActivity(intent);
	                startActivity(intent);
				
			}
		});
	}

	
}
