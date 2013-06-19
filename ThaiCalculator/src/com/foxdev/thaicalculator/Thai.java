package com.foxdev.thaicalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;

public class Thai extends Activity {
	
	private EditText etResult;
	private Button one;
	private Button two;
	private Button three;
	private Button four;
	private Button five;
	private Button six;
	private Button seven;
	private Button eight;
	private Button nine;
	private Button zero;
	private Button clear;
	private Button delete;
	private Button plus;
	private Button minus;
	private Button multiply;
	private Button divide;
	private Button period;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thai);
		//setContentView(R.layout.main);
		etResult = (EditText)findViewById(R.id.etResult);
		one = (Button)findViewById(R.id.btnOne);
		two = (Button)findViewById(R.id.btnTwo);
		three = (Button)findViewById(R.id.btnThree);
		four = (Button)findViewById(R.id.btnFour);
		five = (Button)findViewById(R.id.btnFive);
		six = (Button)findViewById(R.id.btnSix);
		seven = (Button)findViewById(R.id.btnSeven);
		eight = (Button)findViewById(R.id.btnEight);
		nine = (Button)findViewById(R.id.btnNine);
		zero = (Button)findViewById(R.id.btnZero);
		clear = (Button)findViewById(R.id.btnClear);
		delete = (Button)findViewById(R.id.btnDelete);
		plus = (Button)findViewById(R.id.btnPlus);
		minus = (Button)findViewById(R.id.btnMinus);
		multiply = (Button)findViewById(R.id.btnMultiply);
		divide = (Button)findViewById(R.id.btnDivide);
		period = (Button)findViewById(R.id.btnPeriod);
		
		clear.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.setText("");
				}
				return false;
			}
		});
		
		delete.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					String str = etResult.getText().toString();
					   if(str.length()!=0){
					    str  = str.substring( 0, str.length() - 1 ); 
					    etResult.setText ( str );
					}
				}
				return false;
			}
		});
		
		one.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("1");
				}
				return false;
			}
		});
		
		two.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("2");
				}
				return false;
			}
		});
		
		three.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("3");
				}
				return false;
			}
		});
		
		four.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("4");
				}
				return false;
			}
		});
		
		five.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("5");
				}
				return false;
			}
		});
		
		six.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("6");
				}
				return false;
			}
		});
		
		seven.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("7");
				}
				return false;
			}
		});
		
		eight.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("8");
				}
				return false;
			}
		});
		
		nine.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("9");
				}
				return false;
			}
		});
		
		zero.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("0");
				}
				return false;
			}
		});
		
		period.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append(".");
				}
				return false;
			}
		});
		
		plus.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("+");
				}
				return false;
			}
		});
		
		minus.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("-");
				}
				return false;
			}
		});
		
		multiply.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("*");
				}
				return false;
			}
		});
		
		divide.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View view, MotionEvent event) {
				if (event.getAction() == MotionEvent.ACTION_UP) {
					etResult.append("/");
				}
				return false;
			}
		});
		
	}

	public EditText getEtResult() {
		return etResult;
	}

	public void setEtResult(EditText etResult) {
		this.etResult = etResult;
	}

	public Button getOne() {
		return one;
	}

	public void setOne(Button one) {
		this.one = one;
	}

	public Button getTwo() {
		return two;
	}

	public void setTwo(Button two) {
		this.two = two;
	}

	public Button getThree() {
		return three;
	}

	public void setThree(Button three) {
		this.three = three;
	}

	public Button getFour() {
		return four;
	}

	public void setFour(Button four) {
		this.four = four;
	}

	public Button getFive() {
		return five;
	}

	public void setFive(Button five) {
		this.five = five;
	}

	public Button getSix() {
		return six;
	}

	public void setSix(Button six) {
		this.six = six;
	}

	public Button getSeven() {
		return seven;
	}

	public void setSeven(Button seven) {
		this.seven = seven;
	}

	public Button getEight() {
		return eight;
	}

	public void setEight(Button eight) {
		this.eight = eight;
	}

	public Button getNine() {
		return nine;
	}

	public void setNine(Button nine) {
		this.nine = nine;
	}

	public Button getZero() {
		return zero;
	}

	public void setZero(Button zero) {
		this.zero = zero;
	}
}
