package com.example.test;
import java.util.ArrayList;
import java.util.HashMap;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragTabMsos extends Fragment {
	
	private ListView list;
	private ArrayList<HashMap<String, String>> Data = new ArrayList<HashMap<String, String>>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_frag_tab_msos,
				container, false);
		list=(ListView)rootView.findViewById(R.id.MylistSOS);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("img",String.valueOf(R.drawable.sos));
		map.put("Objet","Brulure de deux");
		map.put("contenu","Bayema");
		map.put("Date","12/03/2014 12:20:34");
		Data.add(map);
		
		loadList();
		
		return rootView;
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_frag_tab_msos,
					container, false);
			return rootView;
		}
	}
	
	public void loadList(){
		  ArrayList<HashMap<String, String>> sort = new ArrayList<HashMap<String, String>>();
		  for (int i = 0; i < 5; i++) {
			  sort.add(Data.get(0));
			  
			  MyListAdapter mSchedule = new MyListAdapter(this.getActivity().getBaseContext(),sort,
						R.layout.listdetailsos, new String[] {"img","Objet","contenu", "Date"}, new int[] {
								R.id.imgSOS, R.id.Textobjet,R.id.TextContenu, R.id.TextDate });
				list.setAdapter(mSchedule);
		}
		  
		
	}


}
