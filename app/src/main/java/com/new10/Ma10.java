package com.new10;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;

public class Ma10 extends Activity {

	TextView tv1,tv2,tv3;
	Button submit,next;
	RadioGroup rg;
	RadioButton rb1,rb2,rb3,rb4;
	String x ="",y="",n="";
	int a;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ma10);
		
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);
		tv3=(TextView) findViewById(R.id.textView3);
		
		rb1=(RadioButton) findViewById(R.id.radio0);
		rb2=(RadioButton) findViewById(R.id.radio1);
		rb3=(RadioButton) findViewById(R.id.radio2);
		rb4=(RadioButton) findViewById(R.id.radio3);
		
		submit=(Button) findViewById(R.id.button1);
		next=(Button) findViewById(R.id.button2);
		
		rg=(RadioGroup) findViewById(R.id.radioGroup1);
		String s="Q10 - The diagonal of a rectangular field both is 60m more than the shorter side. If the longer side" +
				"is 30m more greater than the shorter side, Find the sides of the field. ";
		tv1.setText(s);
		rb1.setText("120 , 150");
		rb2.setText("120 , 90");
		rb3.setText("80 , 110");
		rb4.setText("60 , 90");
		submit.setText("Submit");
		next.setText("Next");
		Bundle extra=getIntent().getExtras();
		if(extra!=null)
		{
			x=extra.getString("key");
			n=extra.getString("name");
		}
		
		a=Integer.parseInt(x);

		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				if(rb1.isChecked())
				{

					Toast.makeText(getApplicationContext(), "Right Answer", Toast.LENGTH_SHORT).show();
					a++;
					Animation a = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadefast);   
					
					rb1.setTextColor(Color.GREEN);
					rb1.startAnimation(a);
					next.setTextColor(Color.GREEN);
					next.startAnimation(a);					
				}
				if(rb2.isChecked())
				{
					Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();

				}
				if(rb3.isChecked())
				{
					Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
					
				}
				if(rb4.isChecked())
				{
					Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
				
				}

			}
		});
		
		next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent i=new Intent(getApplicationContext(), Result.class);
				Bundle extra=new Bundle();
				y=Integer.toString(a);				
				extra.putString("key", y);
				extra.putString("name", n);
				i.putExtras(extra);
				startActivity(i);
			}
		});
		
	}
}
