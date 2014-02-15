package com.example.nareshapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;




public class StudentCommentActivity extends Activity {
	
	final Context context = this;
	RadioGroup rb;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_comment);
		setContentView(R.layout.custom);
		rb = (RadioGroup)findViewById(R.id.radioGroup2);
		
		rb.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int arg1) {
				// TODO Auto-generated method stub
				
				if(arg1==R.id.myrb3 || arg1==R.id.myrb4)
				{
				
				final Dialog dialog = new Dialog(context);
				dialog.setContentView(R.layout.custom);
				dialog.setTitle("Please Enter Reasons");


				Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
				 final EditText ed = (EditText)dialog.findViewById(R.id.editText1);
				// if button is clicked, close the custom dialog
				dialogButton.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						
						Toast.makeText(getApplicationContext(), "Your Comment is:"+ed.getText().toString(), Toast.LENGTH_LONG).show();
						dialog.dismiss();
					}
				});
				
				dialog.show();
				}
				
			}
		});
		
	
	}	

}
