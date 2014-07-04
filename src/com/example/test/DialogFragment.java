package com.example.test;


import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class DialogFragment extends android.support.v4.app.DialogFragment {

	private TabHost mtabhost;
	
	public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        
       builder.setView(inflater.inflate(R.layout.fragment_dialog, null));
        
        
       View vue=inflater.inflate(R.layout.fragment_dialog, null);
       
       mtabhost=(TabHost)vue.findViewById(android.R.id.tabhost);
       mtabhost.setup();
	    
   	
       TabSpec tspec1=mtabhost.newTabSpec("Moi");
       mtabhost.setCurrentTab(2);
       tspec1.setIndicator("Create adresse",getResources().getDrawable(android.R.drawable.ic_menu_add));
       tspec1.setContent(R.id.onglet1);
       
       TabSpec tspec2=mtabhost.newTabSpec("Moi");
       tspec2.setIndicator("Create adresse",getResources().getDrawable(android.R.drawable.ic_menu_add));
       tspec2.setContent(R.id.onglet1);
       
       mtabhost.addTab(tspec1);
       mtabhost.addTab(tspec2);
       
       
//	    mtabhost.addTab(mtabhost.newTabSpec("tab4").setIndicator("Assignés"), FragmenTab.class, null);
//	    mtabhost.addTab(mtabhost.newTabSpec("tab4").setIndicator("Résolus"), FragmenTab.class, null);
//	    mtabhost.addTab(mtabhost.newTabSpec("tab4").setIndicator("Non Résolus"), FragmenTab.class, null);
//        
        return builder.create();
        
//        dialog.setContentView(R.layout.maintabmenu);
//        TabHost tabs = (TabHost) dialog.findViewById(R.id.my_tabhost);
//        tabs.setup();
//        tabs.setCurrentTab(0);
//
//        TabSpec tspec11 = tabs.newTabSpec("Tab1");
//        tspec11.setIndicator("NEWTAB");
//
//        tspec11.setContent(R.id.ScrollView01);
//        tabs.addTab(tspec11);
//
//        TabSpec tspec2 = tabs.newTabSpec("Tab2");
//        tspec2.setIndicator("NEWTAB");
//
//        tspec2.setContent(R.id.ScrollView02);
//        tabs.addTab(tspec2);
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
			View rootView = inflater.inflate(R.layout.fragment_dialog,
					container, false);
			return rootView;
		}
	}

	

}
