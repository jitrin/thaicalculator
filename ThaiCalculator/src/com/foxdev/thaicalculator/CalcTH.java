package com.foxdev.thaicalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.GridView;

public class CalcTH extends Activity {
	
	GridView gridKeypad;
	ButtonAdapter buttonAdapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.thai_view);
		
		gridKeypad = (GridView) findViewById(R.id.gridKeypad);
		
		buttonAdapter = new ButtonAdapter(this);
		
		gridKeypad.setAdapter(buttonAdapter);
		
		gridKeypad.setOnTouchListener(new OnTouchListener() {

			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				return false;
			}
		});
	}
}
