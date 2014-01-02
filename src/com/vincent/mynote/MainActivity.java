package com.vincent.mynote;

import com.vincent.mynote.base.BaseFramentActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends BaseFramentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//aaaaaaaaaaaa
		
		
	}
	
	private void ahah() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
