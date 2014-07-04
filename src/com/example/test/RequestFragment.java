package com.example.test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class RequestFragment extends Fragment {

	private FragmentTabHost mtabhost;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_request,
				container, false);
		mtabhost=new FragmentTabHost(getActivity());
		String OngletTitle1=getString(R.string.MySOS);
		String OngletTitle2=getString(R.string.SendSOS);
		
		mtabhost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_request);
	    mtabhost.addTab(mtabhost.newTabSpec("tab7").setIndicator(OngletTitle1), FragTabMsos.class, null);
	    mtabhost.addTab(mtabhost.newTabSpec("tab8").setIndicator(OngletTitle2), FragTabSendsos.class, null);
		
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
			View rootView = inflater.inflate(R.layout.fragment_request,
					container, false);
			return rootView;
		}
	}

}
