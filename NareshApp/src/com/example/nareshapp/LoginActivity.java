package com.example.nareshapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

	
	EditText user1,pwd1;
	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		user1 = (EditText)findViewById(R.id.user1);
		pwd1 = (EditText)findViewById(R.id.pwd1);
	//Toast.makeText(getApplicationContext(), "Welcome To Login", Toast.LENGTH_LONG).show();
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Toast.makeText(getApplicationContext(), "this is ram", 5000);
				try {
					URL u = new URL("localhost/3000");
					URLConnection uc = u.openConnection();
					uc.setRequestProperty("addmin", "admin");
					uc.connect();
					InputStream is = uc.getInputStream();
					
					String read = null;
					StringBuffer buffer = new StringBuffer();
					
					
					BufferedReader reader = new BufferedReader(new InputStreamReader(is));
					while ((read = reader.readLine()) != null) {    
						buffer.append(read);
					} 
					
					
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
	}
	public void saveLogin(View v)
	{
	Intent i=new Intent(LoginActivity.this,DetailsActivity.class);
	startActivity(i);
	}

	/*
	public void saveLogin(View v)
	{
		String vUsername = user1.getText().toString();
		
		String vPwd = pwd1.getText().toString();

		if(vUsername.equalsIgnoreCase(""))
		{
		    Toast.makeText(LoginActivity.this, "Please Enter User name", 
		         Toast.LENGTH_SHORT).show();
		}
		else if (vPwd.equalsIgnoreCase("")) {
			Toast.makeText(LoginActivity.this, "Please Enter Password", 
			         Toast.LENGTH_SHORT).show();
			
		}*/
			
		

		
		
		//Toast.makeText(getApplicationContext(), "Login Clicked",Toast.LENGTH_LONG).show();
	}


