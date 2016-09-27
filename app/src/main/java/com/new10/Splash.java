package com.new10;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

public class Splash extends Activity {
	TextView tv1,tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		// Animation atv2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);   
		 //tv2.startAnimation(atv2);
		 
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);

		Thread t=new Thread()
		{
			public void run() 
			{
				try
				{
				sleep(1000);
				finish();
				Intent it=new Intent(getApplicationContext(),MainActivity.class);
				startActivity(it);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
		};
		t.start();

	}
}
