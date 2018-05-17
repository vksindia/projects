package com.example.databaseconnecivitydemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;


import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InsertActivity extends Activity {
     EditText txt1,txt2,txt3,txt4;
     Button insert;
     Connection con=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_insert);
		txt1=(EditText)findViewById(R.id.editText1);
		txt2=(EditText)findViewById(R.id.editText2);
		txt3=(EditText)findViewById(R.id.editText3);
		txt4=(EditText)findViewById(R.id.editText4);
		insert=(Button)findViewById(R.id.button1);
		
		final int id= Integer.parseInt(txt1.getText().toString());
		final	String name=txt2.getText().toString();
		final String type=txt3.getText().toString();
		final double price=Double.parseDouble(txt4.getText().toString());
		
		insert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
				StrictMode.setThreadPolicy(policy);
				String driver = "net.sourceforge.jtds.jdbc.Driver";
				try {
					Class.forName(driver).newInstance();
					con=DriverManager.getConnection("jdbc:jtds:sqlserver://69.162.84.174/PoonamFoodPlaza", "sa", "VKS&^897GT");
							if(con!=null)
							{
								Toast.makeText(InsertActivity.this, "Inserted......", Toast.LENGTH_SHORT).show();
							}
					String sql="{call Insert_Food(?,?,?,?)}";
					CallableStatement cstmt=con.prepareCall(sql);
					cstmt.setInt(1, id);
					cstmt.setString(2 , name);
					cstmt.setString(3, type);
					cstmt.setDouble(4, price);
					
					int i=cstmt.executeUpdate();
					
					if(i>0)
					{
						Toast.makeText(InsertActivity.this, "Inserted......", Toast.LENGTH_SHORT).show();
					}
					else
					{
						Toast.makeText(InsertActivity.this, "not Inserted......", Toast.LENGTH_SHORT).show();
					}

				} 
					catch (Exception e)
					{
						
						e.printStackTrace();
					}
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.insert, menu);
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
