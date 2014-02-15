package com.example.nareshapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class DetailsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);
	}

	
public void studComment(View v)
	{
		Intent i=new Intent(DetailsActivity.this,StudentCommentActivity.class);
		startActivity(i);
	}
}

