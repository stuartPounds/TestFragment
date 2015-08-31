package com.example.testfragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements OnClickListener {
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	
	private android.support.v4.app.Fragment contentFragment;
	private FragmentManager fragmentManager;
	private FragmentTransaction transaction;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.button2);
		btn3=(Button)findViewById(R.id.button3);
		btn4=(Button)findViewById(R.id.button4);
	
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		
		fragmentManager = getSupportFragmentManager();
		transaction = fragmentManager.beginTransaction();
		contentFragment = new MFragment2();
        transaction.replace(R.id.fragmentpager, contentFragment);
        transaction.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		transaction = fragmentManager.beginTransaction();
		// TODO Auto-generated method stub
		if(v.getId()==R.id.button1){
			contentFragment = new MFragment1();
	        transaction.replace(R.id.fragmentpager, contentFragment);
		}
		if(v.getId()==R.id.button2){
			contentFragment = new MFragment2();
	        transaction.replace(R.id.fragmentpager, contentFragment);
		}
		if(v.getId()==R.id.button3){
			contentFragment = new MFragment3();
	        transaction.replace(R.id.fragmentpager, contentFragment);
		}
		if(v.getId()==R.id.button4){
			contentFragment = new MFragment4();
	        transaction.replace(R.id.fragmentpager, contentFragment);
		}
		transaction.commit();
	}

}
