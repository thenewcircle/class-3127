package com.cerner.yamba;

import com.cerner.yambalib.StatusContract;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.actionStatusUpdate:
			 startActivity( new Intent(this, StatusActivity.class) );
			return true;
		case R.id.actionPreferences:
			startActivity( new Intent( StatusContract.ACTION_PREFS_ACTIVITY) );
			return true;
		case R.id.actionRefresh:
			startService( new Intent( StatusContract.ACTION_REFRESH_DATA) );
			return true;
		default:
			return false;
		}
	}
	
}
