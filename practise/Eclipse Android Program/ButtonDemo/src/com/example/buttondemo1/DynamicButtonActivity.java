package com.example.buttondemo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

import android.widget.Toast;

public class DynamicButtonActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	LayoutParams layoutP= new LinearLayout.LayoutParams(android.widget.LinearLayout.LayoutParams.MATCH_PARENT,android.widget.LinearLayout.LayoutParams.WRAP_CONTENT);
		
	LinearLayout linearLayout=new LinearLayout(this);
	linearLayout.setOrientation(LinearLayout.VERTICAL);
		
		for(int i=0;i<4;i++)
		{
			Button button=new Button(this);
			
		    button.setId(i);
		    button.setText("Button"+i);
		    button.setLayoutParams(layoutP);
		    button.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Toast.makeText(DynamicButtonActivity.this, "Button "+v.getId()+"  clicked", Toast.LENGTH_SHORT).show();;
					
				}
			});
		    linearLayout.addView(button);
		    
		}
		this.setContentView(linearLayout, layoutP);
        }

	
}
