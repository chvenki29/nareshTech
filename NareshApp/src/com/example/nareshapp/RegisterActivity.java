package com.example.nareshapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Toast;

public class RegisterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		Toast.makeText(getApplicationContext(), "Welcome to Register", Toast.LENGTH_LONG).show();
		/*Intent i=new Intent("details");
		startActivity(i);*/
	}

	

}
