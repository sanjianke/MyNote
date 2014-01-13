package com.vincent.mynote.view;


import com.vincent.mynote.R;
import com.vincent.mynote.R.layout;
import com.vincent.mynote.R.menu;
import com.vincent.mynote.base.BaseActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
/**
 * 主界面 main
 * @author Vincent
 *
 */
public class MainView extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_main);
		
		 initView();
		 init();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void initView() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void init() {
		// TODO Auto-generated method stub
		
	}

}
