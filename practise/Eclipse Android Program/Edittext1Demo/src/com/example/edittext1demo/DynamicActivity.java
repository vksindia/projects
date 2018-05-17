package com.example.edittext1demo;

import android.app.Activity;
import android.os.Bundle;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class DynamicActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_dynamic);
		LayoutParams lParamsMW = new LinearLayout.LayoutParams(
				 LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
				 
				 LinearLayout linearLayout = new LinearLayout(this);
				 linearLayout.setOrientation(LinearLayout.VERTICAL);
				 
				 EditText edtView = new EditText(this);
				 edtView.setHint("Please enter your name");
				edtView.setLayoutParams(lParamsMW);
				// edtView.setLayoutParams(new LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));

				// edtView.setPadding(2, 2, 2, 2);
				 //lParamsMW.setMargins(50, 300, 30, 100);
				 
				 linearLayout.addView(edtView);
				 
				 this.setContentView(linearLayout, new LinearLayout.LayoutParams(
				 LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
	}

}
