package com.example.CustomAdapterDemoGridView;

import com.example.customadapterdemo1.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {
	Context ctxt;
	int icons[];
	String letters[];
	LayoutInflater inflator;
			
			



	public GridAdapter(Context ctxt, String[] letters, int[] icons) {
		super();
		this.ctxt = ctxt;
		this.icons = icons;
		this.letters = letters;
	}

	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return letters.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return letters[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@SuppressLint({ "ViewHolder", "InflateParams" })
	@Override
	public View getView(int position, View view, ViewGroup parent) {
		// TODO Auto-generated method stub
		View gridView=view;
		if(view==null)
		{
			inflator=(LayoutInflater)ctxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}
		gridView=inflator.inflate(R.layout.custom_layout, null);
		ImageView  icon=(ImageView )gridView.findViewById(R.id.icons);
		TextView  letter=(TextView)gridView.findViewById(R.id.letters);
		
		icon.setImageResource(icons[position]);
		letter.setText(letters[position]);
		return gridView;
	}

}
