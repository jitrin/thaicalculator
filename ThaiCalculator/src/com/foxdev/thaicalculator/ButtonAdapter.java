package com.foxdev.thaicalculator;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;

public class ButtonAdapter extends BaseAdapter {

	private Context mContext;

	// Declare button click listener variable
	private OnClickListener mOnButtonClick;

	// Create and populate keypad buttons array with CalculatorButton enum
	// values
	private KeypadButton[] mButtons = { KeypadButton.MC, KeypadButton.MR,
			KeypadButton.MS, KeypadButton.M_ADD, KeypadButton.M_REMOVE,
			KeypadButton.BACKSPACE, KeypadButton.CE, KeypadButton.C,
			KeypadButton.SIGN, KeypadButton.SQRT, KeypadButton.SEVEN,
			KeypadButton.EIGHT, KeypadButton.NINE, KeypadButton.DIV,
			KeypadButton.PERCENT, KeypadButton.FOUR, KeypadButton.FIVE,
			KeypadButton.SIX, KeypadButton.MULTIPLY, KeypadButton.RECIPROC,
			KeypadButton.ONE, KeypadButton.TWO, KeypadButton.THREE,
			KeypadButton.MINUS, KeypadButton.DECIMAL_SEP, KeypadButton.DUMMY,
			KeypadButton.ZERO, KeypadButton.DUMMY, KeypadButton.PLUS,
			KeypadButton.CALCULATE };

	public ButtonAdapter(Context c) {
		mContext = c;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Button btn;
		
		btn = new Button(mContext);
		
		KeypadButton keyPadButton = mButtons[position];
		
		switch(keyPadButton.mCategory)
		{
		case MEMORYBUFFER:
			btn.setBackgroundResource(R.drawable.keypadmembuffer1);
			break;	
		case CLEAR:
			btn.setBackgroundResource(R.drawable.keypadclear1);
			break;	
		case NUMBER:
			btn.setBackgroundResource(R.drawable.keypad1);
			break;
		case OPERATOR:
			
			btn.setBackgroundResource(R.drawable.keypadop1);
			break;
		case OTHER:
			btn.setBackgroundResource(R.drawable.keypadother1);
			break;
		case RESULT:
			btn.setBackgroundResource(R.drawable.keypadresult1);
			break;
		case DUMMY:
			btn.setBackgroundResource(R.drawable.appvertical1);
			break;
		default:
			btn.setBackgroundResource(R.drawable.keypad1);
			break;
		}
		
		return null;
	}
}
