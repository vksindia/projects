package com.example.checkboxdemo;

import java.util.ArrayList;


import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;


public class DynamicCheckBoxDemoActivity extends Activity {
	 LinearLayout linearlayout;
	 CheckBox checkBox;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dynamic_check_box_demo);
		linearlayout = (LinearLayout) findViewById(R.id.ss); 
		
		TextView text=new TextView(this);
		text.setText("Enter Elective Subject for 3 year:");
		text.setTextSize(30);
		linearlayout.addView(text);
		
		ArrayList<String> array=new ArrayList<String>(); 
		array.add("OS");
		array.add("DSP");
		array.add("PDS");
		array.add("HMI");
		array.add("DBMS");

       for(int i=0;i<array.size();i++)
		{
    	   CheckBox checkbox=new CheckBox(this);
    	   checkbox.setId(i);
    	   checkbox.setText(array.get(i));
    	   linearlayout.addView(checkbox);
		}
       
       
	}
}
