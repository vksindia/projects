package com.example.checkboxdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
Button check,enable,dynamic;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		check=(Button)findViewById(R.id.button1);
		enable=(Button)findViewById(R.id.button2);
		dynamic=(Button)findViewById(R.id.button3);
		
		check.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent intent=new Intent(getApplicationContext(),CheckBoxActivity.class);
					startActivity(intent);
					
				}
			});
			

		enable.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent intent=new Intent(getApplicationContext(),EnableDisableActivity.class);
					startActivity(intent);
					
				}
			});
			
		dynamic.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),DynamicCheckBoxDemoActivity.class);
				startActivity(intent);
				
			}
		});	
	}

	
}
