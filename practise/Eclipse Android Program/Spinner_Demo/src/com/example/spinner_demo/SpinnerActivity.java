package com.example.spinner_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends Activity{
	 String animalList[] = {"Lion", "Tiger", "Monkey", "Elephant", "Dog", "Cat", "Camel"};
	 Spinner spinner;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spinner);
		
		 spinner  = (Spinner) findViewById(R.id.spinner1);
		 
			@SuppressWarnings({ "unchecked", "rawtypes" })
			ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, animalList);
			spinner.setAdapter(arrayAdapter);
			spinner.setOnItemSelectedListener(new OnItemSelectedListener() {
				
				
				@Override
				public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
					int pos=spinner.getSelectedItemPosition();
					Toast.makeText(getBaseContext(), "Your Favourite Animal is:"+animalList[pos], Toast.LENGTH_SHORT).show();
					
				}
				
				@Override
				public void onNothingSelected(AdapterView<?> parent) {
					// TODO Auto-generated method stub
					
				}
				
			});

	}
	
}
