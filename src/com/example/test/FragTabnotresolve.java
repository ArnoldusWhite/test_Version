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

public class FragTabnotresolve extends Fragment {

	private ListView list;
	private ArrayList<HashMap<String, String>> Data = new ArrayList<HashMap<String, String>>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(
				R.layout.fragment_frag_tabnotresolve, container, false);
		
		list=(ListView)rootView.findViewById(R.id.MylistIncidentnotsolve);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("heure","12/05/2013 13:05:34");
		map.put("libelle","Brulure de deux");
		map.put("description","Bayema");
		map.put("localisation","Douala-feu rouge béssengue");
		map.put("imgstatut",String.valueOf(R.drawable.notresolve));
		map.put("imgWrite",String.valueOf(R.drawable.writenotes2));
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
			View rootView = inflater.inflate(
					R.layout.fragment_frag_tabnotresolve, container, false);
			return rootView;
		}
	}
	
	public void loadList(){
		  ArrayList<HashMap<String, String>> sort = new ArrayList<HashMap<String, String>>();
		  for (int i = 0; i < 5; i++) {
			  sort.add(Data.get(0));
			  
			  MyListAdapter mSchedule = new MyListAdapter(this.getActivity().getBaseContext(),sort,
						R.layout.listeincidentnotsolve, new String[] {"libelle","description", "localisation","heure","imgstatut","imgWrite","imgView"}, new int[] {
							 R.id.TextLibellenotSolve,R.id.TextdescnotSolve, R.id.TextLocalisationnotSolve,R.id.HeurenotSolve,R.id.ImgStatusnotSolve,R.id.ImgWritenotSolve,R.id.ImgViewnotSolve });
				list.setAdapter(mSchedule);
		}
		  
		
	}


}
