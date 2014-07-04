package com.example.test;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.SimpleAdapter;

public class MyListAdapter extends SimpleAdapter{

	private LayoutInflater mInflater;
	
	public MyListAdapter(Context context, List<? extends Map<String, ?>> data,
			int resource, String[] from, int[] to) {
		super(context, data, resource, from, to);
		mInflater=LayoutInflater.from(context);
		
	}
	
	@Override
	public Object getItem (int position)
	{
		return super.getItem (position);
	}

}
