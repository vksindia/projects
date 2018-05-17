package com.example.radiobuttondemo;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EnableDisableActivity extends Activity {
	RadioGroup rgGroup;
	RadioButton good,bad;
	Button enable,disable;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_enable_disable);
		rgGroup=(RadioGroup)findViewById(R.id.rgOpinion);
		enable=(Button)findViewById(R.id.button1);
		disable=(Button)findViewById(R.id.button2);
		good=(RadioButton)findViewById(R.id.radiobtngood);
		bad=(RadioButton)findViewById(R.id.radiobtnbad);

		enable.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				good.setEnabled(true);
				bad.setEnabled(true);
				//rgGroup.setEnabled(true);
				Toast.makeText(EnableDisableActivity.this, "Enable", Toast.LENGTH_SHORT).show();

			}
		});

		disable.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub	
				good.setEnabled(false);
				bad.setEnabled(false);
				
				good.setChecked(false);
				bad.setChecked(false);
				Toast.makeText(EnableDisableActivity.this, "Disable", Toast.LENGTH_SHORT).show();

			}
		});


	}

	
}
