package com.example.test;

import java.lang.reflect.Field;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class FragmentScore extends Fragment {
	private FragmentTabHost mtabhost;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {
	    //View rootView = inflater.inflate(R.layout.fragment_fragment_incident, container,
	            //false);
	    mtabhost=new FragmentTabHost(getActivity());
	    mtabhost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_fragment_score);
	    
	    mtabhost.addTab(mtabhost.newTabSpec("tab4").setIndicator("Personnel"), FragmenTab2.class, null);
	    mtabhost.addTab(mtabhost.newTabSpec("tab4").setIndicator("Par Equipes"), FragmenTab2.class, null);
	    mtabhost.addTab(mtabhost.newTabSpec("tab4").setIndicator("National"), FragmenTab2.class, null);
	   
	    
	   
//	   
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
			View rootView = inflater.inflate(R.layout.fragment_fragment_score,
					container, false);
			return rootView;
		}
	}
	
	@Override
	public void onDetach() {
		super.onDetach();

		try {
			Field childFragmentManager = Fragment.class
					.getDeclaredField("mChildFragmentManager");
			childFragmentManager.setAccessible(true);
			childFragmentManager.set(this, null);

		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	// Remove FragmentTabHost 
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		mtabhost = null;
	}

}
