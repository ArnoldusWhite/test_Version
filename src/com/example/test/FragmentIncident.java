package com.example.test;

import java.lang.reflect.Field;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class FragmentIncident extends Fragment{

	private FragmentTabHost mtabhost;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	        Bundle savedInstanceState) {
	    //View rootView = inflater.inflate(R.layout.fragment_fragment_incident, container,
	            //false);
	    mtabhost=new FragmentTabHost(getActivity());
	    mtabhost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_fragment_incident);
	    
	    String OngletTitle1=getString(R.string.TitleListIncident);
	    String OngletTitle2=getString(R.string.TitleAssignResolu);
	    String OngletTitle3=getString(R.string.TitleAssignNonResolu);
	    
	    mtabhost.addTab(mtabhost.newTabSpec("tab4").setIndicator(OngletTitle1), FragmenTab.class, null);
	    mtabhost.addTab(mtabhost.newTabSpec("tab").setIndicator(OngletTitle2), FragTabIncidentSolve.class, null);
	    mtabhost.addTab(mtabhost.newTabSpec("tab9").setIndicator(OngletTitle3), FragTabnotresolve.class, null);
	   
	    
	   
//	   
	    return mtabhost;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.action_settings:
			
			break;
		case R.id.action_language:
			break;
		default:
			break;
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
					R.layout.fragment_fragment_incident, container, false);
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
