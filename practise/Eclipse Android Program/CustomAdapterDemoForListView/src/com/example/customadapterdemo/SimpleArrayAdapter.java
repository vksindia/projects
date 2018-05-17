package com.example.customadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class SimpleArrayAdapter extends BaseAdapter{
	String names[];
	Context ctxt;
	LayoutInflater myInflater;
	
	

	public SimpleArrayAdapter(String[] names, Context ctxt) {
		super();
		this.names = names;
		this.ctxt = ctxt;
		myInflater=(LayoutInflater)ctxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return names.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return names[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup vGroup) {
		// TODO Auto-generated method stub
		if(view==null)
			view=myInflater.inflate(R.layout.simple_list_item, vGroup,false);
		TextView  textView=(TextView)view.findViewById(R.id.textView);
		textView.setText(names[position]);
		return view;
	}

}
