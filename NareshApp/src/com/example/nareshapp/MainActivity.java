package com.example.nareshapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	
	Button bt1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt1 = (Button)findViewById(R.id.button1);
		
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
	}
public void register(View v)
{
	Intent i1=new Intent(MainActivity.this,RegisterActivity.class);
	startActivity(i1);
	}
	public void login(View v)
	{
	    //bt1.setBackgroundResource(R.drawable.button_focused);
		Intent i2=new Intent(MainActivity.this,LoginActivity.class);
		startActivity(i2);
		
	}

}
