/**
 * 
 */
package com.example.dialog;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.example.test.MainActivity;

import android.R;
import android.R.anim;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

/**
 * @author admin
 *
 */
public class DialogragLang extends DialogFragment{
	static String[] list2;
	static ArrayList<String> list3 = new ArrayList<String>();
	int val;
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		
		
	      // Where we track the selected items
	    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	    list3.add("fr");
	    list3.add("en");
	    list2=getResources().getStringArray(com.example.test.R.array.list_language); 
	    // Set the dialog title
	    builder.setTitle(com.example.test.R.string.action_change_language)
	    // Specify the list array, the items to be selected by default (null for none),
	    // and the listener through which to receive callbacks when items are selected
	    
	    		.setSingleChoiceItems(list2,1,
	    				new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								val=which;
								
							}
						})
	    // Set the action buttons
	           .setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
	               @Override
	               public void onClick(DialogInterface dialog, int which) {
	                   // User clicked OK, so save the mSelectedItems results somewhere
	                   // or return them to the component that opened the dialog
	            	   if(val==0){
	            		   Toast.makeText(getActivity(),""+which,Toast.LENGTH_SHORT).show();
							String languageToLoad  = list3.get(0);
						    Locale locale = new Locale(languageToLoad); 
						    Locale.setDefault(locale);
						    Configuration config = new Configuration();
						    config.locale = locale;
						    
						   getActivity().getBaseContext().getResources().updateConfiguration(config, null);
						   
						    Intent i=new Intent(getActivity(),MainActivity.class);
							i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
							getActivity().finish();
							startActivity(i);
						}else{
							String languageToLoad  = list3.get(1);
						    Locale locale = new Locale(languageToLoad); 
						    Locale.setDefault(locale);
						    Configuration config = new Configuration();
						    config.locale = locale;
						    
						    getActivity().getBaseContext().getResources().updateConfiguration(config, null);
						    
						    Intent i=new Intent(getActivity(),MainActivity.class);
							i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
							getActivity().finish();
							startActivity(i);
						}
	               }
	           });
	    return builder.create();
	}

}
