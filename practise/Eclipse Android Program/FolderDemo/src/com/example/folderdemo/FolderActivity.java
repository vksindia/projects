package com.example.folderdemo;

import android.app.Activity;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class FolderActivity extends Activity {
   Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_folder);
		
		button=(Button)findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
	            PopupMenu popup = new PopupMenu(FolderActivity.this, button);  //Creating the instance of PopupMenu  
	            popup.getMenuInflater().inflate(R.menu.folder, popup.getMenu()); 
	            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
	            	 public boolean onMenuItemClick(MenuItem item) {  
	                     Toast.makeText(FolderActivity.this,"You Clicked : " + item.getTitle(),Toast.LENGTH_SHORT).show();  
	                     return true;  
	                    }  
	                  });  
	           
			popup.show();
			}
		});
	}
	
}
