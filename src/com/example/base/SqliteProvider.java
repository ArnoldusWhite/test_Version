package com.example.base;
import android.content.Context;
import com.android.dataframework.DataFramework;
import com.android.dataframework.Entity;

public class SqliteProvider {
	private Context cxt;
	
	public SqliteProvider(Context contxt) {
		this.cxt=contxt;
		try {
				DataFramework.getInstance().open(cxt, "com.example.base");
			}catch (Exception e) {      
				
			}

	}
	
	public String addSos(Sos s){
		return null;
		
	}
}
