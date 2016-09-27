package com.new10;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends Activity {

	TextView tv1,tv2,tv3;
	Button b;
	String n="",x="",r="";
	int v,p;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);
		tv3=(TextView) findViewById(R.id.textView3);
		b=(Button) findViewById(R.id.button1);
		
		Bundle extra=getIntent().getExtras();
		if(extra!=null)
		{
			x=extra.getString("key");
			n=extra.getString("name");
		}
		
		v=Integer.parseInt(x);
		
		p=(v*100)/10;
		
		r=Integer.toString(p);
		
		b.setText("Play Again");
		tv1.setText("Hey...!! " +n);
		tv2.setText("You have got... "+r +"%  Marks");
		
		if(v<=4)
		{
			tv3.setText("Clear Your Basics");
			Toast.makeText(getApplicationContext(), "Go To NCERTs", Toast.LENGTH_SHORT).show();
		}
		
		else if(v<=8&&v>=5)
		{
			tv3.setText("You can do Better");

			Toast.makeText(getApplicationContext(), "Try Again", Toast.LENGTH_SHORT).show();
		}
		else if(v<=10&&v>=9)
		{
			tv3.setText("Try other Questions");
			

			Toast.makeText(getApplicationContext(), "Solve other Questions", Toast.LENGTH_SHORT).show();
		}
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i= new Intent(getApplicationContext(), Option.class);
				startActivity(i);
				
			}
		});
		
	}
}
