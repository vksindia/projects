package com.example.adapterdemo;

//import com.example.stringdemo.R;

import android.app.Activity;
import android.os.Bundle;


import android.widget.ArrayAdapter;
import android.widget.ListView;


public class AdapterActivity extends Activity {
	   ListView simpleList;
	   String animals[] = {"Lion","Tiger","Monkey","Elephant","Dog","Cat","Camel"};
	  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adapter);
		simpleList = (ListView) findViewById(R.id.simpleListView);
		
		

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, animals);
        simpleList.setAdapter(arrayAdapter);
		
	}

	

}
