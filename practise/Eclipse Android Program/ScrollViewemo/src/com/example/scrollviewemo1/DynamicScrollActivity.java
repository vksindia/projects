package com.example.scrollviewemo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class DynamicScrollActivity extends Activity {
	String OS[] = { "Apple", "Android", "Nokia" };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dynamic_scroll);
		
		RelativeLayout rl=(RelativeLayout)findViewById(R.id.r1);

        ScrollView sv = new ScrollView(this);
        sv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
        LinearLayout ll = new LinearLayout(this);
        ll.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
        ll.setOrientation(1);
        sv.addView(ll);
        
        TextView tv = new TextView(this);
        tv.setText("Enter Your Qualification:");
        tv.setTextSize(20);
        ll.addView(tv);
     
        
        EditText et = new EditText(this);
      //  et.setText(");
        ll.addView(et);

        Button b = new Button(this);
        b.setText("I was added SrollView dynamically. :)");
        ll.addView(b);

        for(int i = 0; i < 5; i++) 
        {
        	    CheckBox cb = new CheckBox(this);
        	    cb.setText("I'm dynamic!");
        	    ll.addView(cb);
        }
        
        TextView tv1 = new TextView(this);
        tv1.setText("Select Best OS:-");
        tv1.setTextSize(20);
        ll.addView(tv1);
       
        
 	   RadioGroup rg = new RadioGroup(this); 
	final RadioButton[] rb = new RadioButton[OS.length];
		  rg.setOrientation(RadioGroup.VERTICAL);
		   for (int i = 0; i < OS.length; i++) 
		   {
			    rb[i] = new RadioButton(this);
			    rg.addView(rb[i]);
			    rb[i].setText(OS[i]);
		   }
		   ll.addView(rg);
        
        rl.addView(sv);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dynamic_scroll, menu);
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
