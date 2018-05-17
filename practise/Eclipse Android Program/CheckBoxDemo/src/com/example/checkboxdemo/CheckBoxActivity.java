package com.example.checkboxdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends Activity {

	CheckBox pizza,coffe,burger,snacks,food;
	Button order;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_box);
		
		pizza=(CheckBox)findViewById(R.id.checkBox1);
		coffe=(CheckBox)findViewById(R.id.checkBox2);
		burger=(CheckBox)findViewById(R.id.checkBox3);
		snacks=(CheckBox)findViewById(R.id.checkBox4);
		food=(CheckBox)findViewById(R.id.checkBox5);
		order=(Button)findViewById(R.id.button1);
		
		order.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
		        int totalamount=0;  
	            StringBuilder result=new StringBuilder();  
	            result.append("Selected Items:");  
	            if(pizza.isChecked()){  
	                result.append("\nPizza 100Rs");  
	                totalamount+=100;  
	            }  
	            if(coffe.isChecked()){  
	                result.append("\nCoffe 50Rs");  
	                totalamount+=50;  
	            }  
	            if(burger.isChecked()){  
	                result.append("\nBurger 120Rs");  
	                totalamount+=120;  
	            }  
	            if(snacks.isChecked()){  
	                result.append("\nSnacks 20Rs");  
	                totalamount+=20;  
	            }  
	            if(food.isChecked()){  
	                result.append("\nIndian food 100Rs");  
	                totalamount+=100;  
	            }  
	            result.append("\nTotal: "+totalamount+"Rs");  
	            


	            Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();  
	        }  
	          
	    }); 
				
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.check_box, menu);
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
