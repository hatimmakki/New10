package com.new10;


import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Start extends Activity {

	TextView tv1,tv2,tv3,tv4;
	Button b1,b2,b3,b4,b5;
	String n="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);
		tv3=(TextView) findViewById(R.id.textView3);
		tv4=(TextView) findViewById(R.id.textView4);
		
		b1=(Button) findViewById(R.id.button1);
		b2=(Button) findViewById(R.id.button2);
		b3=(Button) findViewById(R.id.button3);
		b4=(Button) findViewById(R.id.button4);
		b5=(Button) findViewById(R.id.button5);
		Bundle extra=getIntent().getExtras();
		if(extra!=null)
		{
			n=extra.getString("name");
		}
		
		 Animation atv1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myanimation);   
		 tv1.startAnimation(atv1);       
		
		 Animation atv2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);   
		 tv2.startAnimation(atv2);       
		
		 Animation atv3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);   
		 tv3.startAnimation(atv3);       
		  
		 Animation atv4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);   
		 tv4.startAnimation(atv4);       
		 
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent i=new Intent(getApplicationContext(), Option.class);
				
				Bundle extra=new Bundle();
				extra.putString("name", n);
				i.putExtras(extra);
				startActivity(i);
				
			}
		});
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder=new AlertDialog.Builder(Start.this);
				builder.setMessage("Are you sure you want to quit the game?")
				.setTitle("Alert?")
				.setCancelable(false)
				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int id) {
						finish();
						System.exit(0);
						
					}
				})
				.setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();
						
					}
				});
				builder.create().show();
				
			}
		});
	}
}
