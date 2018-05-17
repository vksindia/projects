package com.example.andriodcalender;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;

import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

@SuppressLint("NewApi")
public class CalenderActivity extends Activity {
	
	CalendarView cal;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calender);
		
		 cal = (CalendarView) findViewById(R.id.calendarView1);
		 cal.setBackgroundColor(getResources().getColor(R.color.green));
		cal.setSelectedWeekBackgroundColor(getResources().getColor(R.color.pink));

	        
	        cal.setOnDateChangeListener(new OnDateChangeListener() {

				@Override
				public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
					// TODO Auto-generated method stub
					Toast.makeText(getBaseContext(),"Selected Date is\n\n"
							+dayOfMonth+" : "+month+" : "+year , 
							Toast.LENGTH_LONG).show();
				}
	        });
	        }
		

}
