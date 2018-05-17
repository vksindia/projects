package com.example.expandablelistview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class ExpandActivity extends Activity {

	private ExpandableListView expandableListView;

	private List<String>parentHeaderInformation;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_expand);
		
	 parentHeaderInformation = new ArrayList<String>();
		parentHeaderInformation.add("Cars");
		parentHeaderInformation.add("Houses");
		parentHeaderInformation.add("Mobile Company");
		
		
		HashMap<String, List<String>> allChildItems = returnGroupedChildItems();
		expandableListView = (ExpandableListView)findViewById(R.id.expandableListView);
		ExpandableListViewAdapt expandableListViewAdapter = new ExpandableListViewAdapt(getApplicationContext(), parentHeaderInformation, allChildItems);
		expandableListView.setAdapter(expandableListViewAdapter);

		}

		private HashMap<String, List<String>> returnGroupedChildItems(){

		HashMap<String, List<String>> childContent = new HashMap<String, List<String>>();

		List<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Toyota");
		cars.add("Nissan");

		List<String> houses = new ArrayList<String>();
		houses.add("1RK");
		houses.add("1 BHK");
		houses.add("Bungalow");
	

		List<String> MobileCompany = new ArrayList<String>();
		MobileCompany.add("Samsung");
		MobileCompany.add("MicroMax");
		MobileCompany.add("Vivo");
		MobileCompany.add("Intex");
		MobileCompany.add("iPhone");
		MobileCompany.add("oppo");
		
		childContent.put(parentHeaderInformation.get(0), cars);
		childContent.put(parentHeaderInformation.get(1), houses);
		childContent.put(parentHeaderInformation.get(2), MobileCompany);

		return childContent;

		}
	
}
