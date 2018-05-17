package com.example.textfiledemo;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;


import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class ReadWriteActivity extends Activity {

     EditText textmsg;
     Button button,button1;
     TextView textView;
   static final int READ_BLOCK_SIZE = 100;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_read_write);
		button=(Button)findViewById(R.id.button1);
		button1=(Button)findViewById(R.id.button2);
		
		textmsg=(EditText)findViewById(R.id.editText1);
		textView=(TextView)findViewById(R.id.textView3);
		final File file = new File(Environment.getExternalStorageDirectory(),"/textfile.txt");
		Log.e("", file.toString());
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				try {
					@SuppressWarnings("resource")
					FileOutputStream fos=new FileOutputStream(file, true);
					
					fos.write(textmsg.getText().toString().getBytes());
					Toast.makeText(ReadWriteActivity.this, "File Write Successfully...", Toast.LENGTH_SHORT).show();
				
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int length=(int)file.length();
				byte[] bytes=new byte[length];
				try {
					@SuppressWarnings("resource")
					FileInputStream fis=new FileInputStream(file);
					fis.read(bytes);
					
					
					String msg=new String(bytes);
					textView.setText(msg);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	
}
}
				



























/*File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath()+"/android1.txt");
				Log.e("file", file.getName());
				if (!file.exists()) 
				   {
				        try {
					            file.createNewFile();
					            FileOutputStream fo=new FileOutputStream(file);
					            fo.write(12);
					            fo.close();
					            Log.e("file created", file.toString());
				            } 
					        catch (IOException e) 
					        {
						        	Log.e("error", "e1");
						            e.printStackTrace();
					        }
				
			        }
				*/
				
				
		//onCreate()
			
	
			// write text to file
			/*public void WriteBtn(View v) 
			{
			
				try 
				{
					FileOutputStream fileout=openFileOutput("android1.txt", MODE_PRIVATE);
					OutputStreamWriter outputWriter=new OutputStreamWriter(fileout);
					outputWriter.write(textmsg.getText().toString());
					outputWriter.close();
					
					//display file saved message
					Toast.makeText(getBaseContext(), "File saved successfully!",
					Toast.LENGTH_SHORT).show();
					
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}	
			}  //WriteBtn
*/			
			
			
			/*// Read text from file
			public void ReadBtn(View v) 
			{
			
					try 
					{
						FileInputStream fileIn=openFileInput("android1.txt");
						InputStreamReader InputRead= new InputStreamReader(fileIn);
						
						char[] inputBuffer= new char[READ_BLOCK_SIZE];
						String s="";
						int charRead;
						
						if ((charRead=InputRead.read(inputBuffer))>0) 
						{
							// char to string conversion
							String readstring=String.copyValueOf(inputBuffer,0,charRead);
							s +=readstring;					
						}
						InputRead.close();
						Toast.makeText(getBaseContext(), s,Toast.LENGTH_SHORT).show();
					
				  } 
					catch (Exception e) 
					{
						e.printStackTrace();
				    }		
		  }//ReadBtn
		*/
	
   
