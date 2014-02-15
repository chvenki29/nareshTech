package com.example.nareshapp;
/**
 * Import statements
 */


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


/**
 * @author Santosh Koalnapaka
 */
public class SplashScreen extends Activity {

	private int textProgressBarstatus = 0;
	private Handler progressBarHandler = new Handler();
	TextProgressBar textProgressBar;
	private int fileSize = 0;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		textProgressBar = (TextProgressBar) findViewById(R.id.progressBarWithText);

	    textProgressBar.setText("loading...");

	    

	  //  textProgressBar.setProgress(70);

	    textProgressBar.setTextSize(17);
	    addListenerOnButton();

		Thread t1=new Thread() {
			public void run() {
				try {
					// TODO Auto-generated method stub
					Thread.sleep(4000);
					Intent in=new Intent(getApplicationContext(),MainActivity.class);
					in.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
					startActivity(in);
					finish();
				}
				catch (Exception e) {
				}
			}
		};
		t1.start();

	}



	public void addListenerOnButton() {
		// TODO Auto-generated method stub
	
		textProgressBar.setProgress(0);
		textProgressBar.setMax(100);
		//textProgressBar.show();

		//reset progress bar status
		textProgressBarstatus = 0;

		//reset filesize
		fileSize = 0;

		new Thread(new Runnable() {
		  public void run() {
			while (textProgressBarstatus < 100) {

			  // process some tasks
				textProgressBarstatus = doSomeTasks();

			  // your computer is too fast, sleep 1 second
			  try {
				Thread.sleep(40);
			  } catch (InterruptedException e) {
				e.printStackTrace();
			  }

			  // Update the progress bar
			  progressBarHandler.post(new Runnable() {
				public void run() {
					textProgressBar.setProgress(textProgressBarstatus);
				}
			  });
			}

			
		
		  }
	       }).start();

           }
	 public int doSomeTasks() {
		
		
			while (fileSize <= 1000000) {

				fileSize++;

				if (fileSize == 100000) {
					return 10;
				} 
				else if (fileSize == 150000) {
					return 15;
				} else if (fileSize == 200000) {
					return 20;
				} 
				else if (fileSize == 250000) {
					return 25;
				} else if (fileSize == 300000) {
					return 30;
				}
				else if (fileSize == 350000) {
					return 35;
				} 
			 else if (fileSize == 400000) {
				return 40;
			}
			 else if (fileSize == 450000) {
					return 45;
				} 
		 else if (fileSize == 500000) {
			return 50;
		}else if (fileSize == 550000) {
			return 55;
		}  else if (fileSize == 600000) {
			return 60;
		} else if (fileSize == 650000) {
			return 65;
		} else if (fileSize == 700000) {
			return 70;
		} else if (fileSize == 750000) {
			return 75;
		} else if (fileSize == 800000) {
			return 80;
		}
		else if (fileSize == 850000) {
			return 85;
		} else if (fileSize == 900000) {
			return 90;
		} else if (fileSize == 950000) {
			return 95;}
			else if (fileSize == 1000000) {
			return 100;
		} 
		}
		return 100;

		  }



}
