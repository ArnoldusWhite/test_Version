package com.example.test;

import com.example.test.R.string;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class Account extends Fragment {
	private FragmentTabHost mtabhost;
	
	//private ListView list;
	//private ArrayList<HashMap<String, String>> Data = new ArrayList<HashMap<String, String>>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_account,
				container, false);
//		list=(ListView)rootView.findViewById(R.id.myListView);
//		
//		HashMap<String, String> map = new HashMap<String, String>();
//		map.put("img",String.valueOf(R.drawable.abc_ic_voice_search));
//		map.put("login","Bayema");
//		map.put("Delete",String.valueOf(R.drawable.abc_ab_share_pack_holo_dark));
//		Data.add(map);
//		
//		loadList();
		
		mtabhost=new FragmentTabHost(getActivity());
	    mtabhost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_account);
	    
	    String ongletTitle1=getString(R.string.OngletProfile);
	    String ongletTltle2=getString(R.string.OngletPassword);
	    
	    mtabhost.addTab(mtabhost.newTabSpec("tab5").setIndicator(ongletTitle1), FragmentTabAccount.class, null);
	    mtabhost.addTab(mtabhost.newTabSpec("tab6").setIndicator(ongletTltle2), FragTabPassword.class, null);
		
	    return mtabhost;
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
	
//	public void loadList(){
//		  ArrayList<HashMap<String, String>> sort = new ArrayList<HashMap<String, String>>();
//		  sort.add(Data.get(0));
//		MyListAdapter mSchedule = new MyListAdapter(this.getActivity().getBaseContext(),sort,
//				R.layout.listdetails, new String[] { "img","login", "Delete"}, new int[] {
//						R.id.img,R.id.TextLogin, R.id.compteDelete });
//		list.setAdapter(mSchedule);
//	}

}
