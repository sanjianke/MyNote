package com.vincent.mynote.base;

import android.app.Activity;
import android.os.Bundle;
/**
 * Activity的基类
 * @author Vincent
 *
 */
public abstract class BaseActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	/**
	 * 初始化界面
	 */
	protected abstract void initView();
	/**
	 * 初始化数据
	 */
	protected abstract void init();
}
