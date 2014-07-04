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

public class FragmenTab extends Fragment {
	
	private ListView list;
	private ArrayList<HashMap<String, String>> Data = new ArrayList<HashMap<String, String>>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_fragmen_tab, container,
				false);
		
		list=(ListView)rootView.findViewById(R.id.MylistIncident);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("libelle","Brulure de deux");
		map.put("description","Bayema");
		map.put("localisation","Douala-feu rouge béssengue");
		map.put("heure","12/05/2014 12:04:02");
		map.put("imgAss",String.valueOf(R.drawable.assign));
		map.put("imgView",String.valueOf(R.drawable.view));
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
			View rootView = inflater.inflate(R.layout.fragment_fragmen_tab,
					container, false);
			return rootView;
		}
					
	}
	
	public void loadList(){
		  ArrayList<HashMap<String, String>> sort = new ArrayList<HashMap<String, String>>();
		  for (int i = 0; i < 5; i++) {
			  sort.add(Data.get(0));
			  
			  MyListAdapter mSchedule = new MyListAdapter(this.getActivity().getBaseContext(),sort,
						R.layout.listdetailincidents, new String[] { "libelle","description", "localisation","heure","imgAss","imgView"}, new int[] {
							 R.id.TextLibelle,R.id.Textdesc,R.id.TextHeure, R.id.TextLocalisation,R.id.ImgAss,R.id.ImgViewnSolve });
				list.setAdapter(mSchedule);
		}
		  
		
	}

}
