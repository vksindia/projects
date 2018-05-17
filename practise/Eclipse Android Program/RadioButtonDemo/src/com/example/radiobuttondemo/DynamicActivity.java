package com.example.radiobuttondemo;

import android.app.Activity;

import android.os.Bundle;

import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import android.widget.TextView;

public class DynamicActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		//	setContentView(R.layout.activity_dynamic);
		LayoutParams layout=new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
			
			String countryName[] = { "India", "Pakistan", "China", "Nepal",
			   "Bangladesh" };
			
			 
			LinearLayout linearLayout = new LinearLayout(this);
			linearLayout.setOrientation(LinearLayout.VERTICAL);
			 
					  
			 TextView title = new TextView(this);
			   title.setText("Select Your Favourite Country:");
			   title.setLayoutParams(layout);
			   //title.setTextColor(Color.BLUE);
			   linearLayout.addView(title);
			   
			   
					   // create radio button
					   final RadioButton[] rb = new RadioButton[5];
					   RadioGroup rg = new RadioGroup(this);
					//   rg.setOrientation(RadioGroup.VERTICAL);
					   for (int i = 0; i < countryName.length; i++) 
					   {
						    rb[i] = new RadioButton(this);
						    rg.addView(rb[i]);
						    rb[i].setText(countryName[i]);
					   }
			
					   linearLayout.addView(rg);
					   this.setContentView(linearLayout, layout);
			  
		 }

}
