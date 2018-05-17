package com.example.foldersdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MenuActivity extends Activity {
     
	Button button1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		   
        button1 = (Button) findViewById(R.id.button1);  
        button1.setOnClickListener(new OnClickListener() {  
         
         @Override  
         public void onClick(View v) {  
          //Creating the instance of PopupMenu  
          PopupMenu popup = new PopupMenu(MenuActivity.this, button1);  
          //Inflating the Popup using xml file  
          popup.getMenuInflater().inflate(R.menu.menu, popup.getMenu());  
         
          //registering popup with OnMenuItemClickListener  
          popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {  
           public boolean onMenuItemClick(MenuItem item) {  
            Toast.makeText(MenuActivity.this,"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();  
            return true;  
           }  
          });  

          popup.show();//showing popup menu  
         }
         });	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
		
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		  switch (item.getItemId()) {  
          case R.id.item1:  
            Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();  
          return true;     
         case R.id.item2:  
              Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();  
            return true;     
          case R.id.item3:  
              Toast.makeText(getApplicationContext(),"Item 3 Selected",Toast.LENGTH_LONG).show();  
            return true;     
            default:  
              return super.onOptionsItemSelected(item);  
      } 
		/*int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}*/
		//return super.onOptionsItemSelected(item);
	}
}
