package com.example.databaseconnecivitydemo;


import java.sql.Connection;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class FoodActivity extends Activity {
	
  Button insert,update,delete,display;
  Connection con=null;
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_food);
		
		insert=(Button)findViewById(R.id.insert);
		update=(Button)findViewById(R.id.update);
		delete=(Button)findViewById(R.id.delete);
		display=(Button)findViewById(R.id.display);
		
		insert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				/*StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
				StrictMode.setThreadPolicy(policy);
				String driver = "net.sourceforge.jtds.jdbc.Driver";
				try {
					Class.forName(driver).newInstance();
					con=DriverManager.getConnection("jdbc:jtds:sqlserver://69.162.84.174/PoonamFoodPlaza", "sa", "VKS&^897GT");
					String sql="insert into Food values(110,'pizza','Italian',250)";
					Statement stmt=con.createStatement();
					
					int i=stmt.executeUpdate(sql);
					
					if(i>0)
					{
						Toast.makeText(FoodActivity.this, "Inserted......", Toast.LENGTH_SHORT).show();
					}
					else
					{
						Toast.makeText(FoodActivity.this, "not Inserted......", Toast.LENGTH_SHORT).show();
					}

				} 
				
			
				catch(Exception e)
				{
					e.printStackTrace();
			
				}
				
				}*/
				
				Intent intent=new Intent(getApplicationContext(),InsertActivity.class);
				startActivity(intent);
				
			}
		});
		
		update.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),UpdateActivity.class);
				startActivity(intent);
				
			}
		});
		
		delete.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),DeleteActivity.class);
				startActivity(intent);
				
			}
		});
		
    display.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(getApplicationContext(),DisplayActivity.class);
				startActivity(intent);
				
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.food, menu);
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
