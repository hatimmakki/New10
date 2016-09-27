package com.new10;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.app.Activity;
import android.content.Intent;

public class Option extends Activity {

	TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
	Spinner s1,s2,s3;
	Button b;

	public static final String [] i1={"None","Algebra","Trigonometery","Mesurement","Statistics"};
	public static final String [] i2={"None","Tense","Modals","Preposition"};
	public static final String [] i3={"None","Physics","Chemistry","Biology"};

	String n="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_option);
		
		tv1=(TextView) findViewById(R.id.textView1);
		tv2=(TextView) findViewById(R.id.textView2);
		tv3=(TextView) findViewById(R.id.textView3);
		tv4=(TextView) findViewById(R.id.textView4);
		tv5=(TextView) findViewById(R.id.textView5);
		tv6=(TextView) findViewById(R.id.textView6);
		tv7=(TextView) findViewById(R.id.textView7);
		tv8=(TextView) findViewById(R.id.textView8);
		tv9=(TextView) findViewById(R.id.textView9);
		
		s1=(Spinner) findViewById(R.id.spinner1);
		s2=(Spinner) findViewById(R.id.spinner2);
		s3=(Spinner) findViewById(R.id.spinner3);
		
		b=(Button) findViewById(R.id.button1);
		
		Bundle extra=getIntent().getExtras();
		if(extra!=null)
		{
			
			n=extra.getString("name");
		}
		
		 Animation atv1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);   
		 tv1.startAnimation(atv1);
		 
		
		ArrayAdapter<String> a1=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,i1);
	        
	    a1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
	    s1.setAdapter(a1);
	        
	    s1.setOnItemSelectedListener(new OnItemSelectedListener() {

				@Override
				public void onItemSelected(AdapterView<?> parent, View arg1, int position,
						long id) {
					
					tv7.setText(i1[position]);
				}
				@Override
				public void onNothingSelected(AdapterView<?> parent) {
					
					tv7.setText("");
					
				}
			});

	        
ArrayAdapter<String> a2=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,i2);
	        
	        a2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
	        s2.setAdapter(a2);
	        
	        s2.setOnItemSelectedListener(new OnItemSelectedListener() {

				@Override
				public void onItemSelected(AdapterView<?> parent, View arg1, int position,
						long id) {
					
					tv8.setText(i2[position]);
				}
				@Override
				public void onNothingSelected(AdapterView<?> parent) {
					
					tv8.setText("");
					
				}
			});
	        
ArrayAdapter<String> a3=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,i3);
	        
	        a3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
	        s3.setAdapter(a3);
	        
	        s3.setOnItemSelectedListener(new OnItemSelectedListener() {

				@Override
				public void onItemSelected(AdapterView<?> parent, View arg1, int position,
						long id) {
					
					tv9.setText(i3[position]);
				}
				@Override
				public void onNothingSelected(AdapterView<?> parent) {
					
					tv9.setText("");
					
				}
			});
	        
	        if((tv7.getText()=="Algebra"||tv7.getText()=="Trigonometery"|| tv7.getText()=="Measurement"|| tv7.getText()=="Statistics") && (tv8.getText()=="None"||tv9.getText()=="None"))
	        {
	        	tv6.setText(tv7.getText().toString());
	        }

	        else if((tv8.getText()=="Tense" || tv8.getText()=="Voice" || tv8.getText()=="Preposition") && (tv8.getText()=="None"||tv9.getText()=="None"))
	        {
	        	tv6.setText(tv8.getText().toString());
	        }
	        
	        else if ((tv9.getText()=="Physics"|| tv9.getText()=="Chemistry"|| tv9.getText()=="Biology") && (tv8.getText()=="None"||tv9.getText()=="None")) 
	        {
	        	tv6.setText(tv9.getText().toString());

			}
	        b.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					if(tv7.getText()=="Algebra" && (tv8.getText()=="None" || tv8.getText()=="Tense"|| tv8.getText()=="Modals" || tv8.getText()=="Preposition" || tv9.getText()=="None" || tv9.getText()=="Physics"|| tv9.getText()=="Chemistry"|| tv9.getText()=="Biology"))
					{
						Intent i=new Intent(getApplicationContext(), Ma1.class);
						Bundle extra=new Bundle();
						extra.putString("name", n);
						i.putExtras(extra);
						startActivity(i);
					}
					
					else if(tv7.getText()=="Trigonometery" && (tv8.getText()=="None" || tv8.getText()=="Tense" || tv8.getText()=="Modals" || tv8.getText()=="Preposition" || tv9.getText()=="None" || tv9.getText()=="Physics"|| tv9.getText()=="Chemistry"|| tv9.getText()=="Biology"))
					{
						Intent i=new Intent(getApplicationContext(), Mt1.class);
						String s="";
						Bundle extra=new Bundle();
						extra.putString("name", s);
						i.putExtras(extra);
						startActivity(i);
					}
					
					else if(tv7.getText()=="Measurement" && (tv8.getText()=="None" || tv8.getText()=="Tense" || tv8.getText()=="Modals" || tv8.getText()=="Preposition" || tv9.getText()=="None" ||  tv9.getText()=="Physics"|| tv9.getText()=="Chemistry"|| tv9.getText()=="Biology"))
					{
						Intent i=new Intent(getApplicationContext(), Mm1.class);
						Bundle extra=new Bundle();
						extra.putString("name", n);
						i.putExtras(extra);
						startActivity(i);
					}
					
					else if(tv7.getText()=="Statistics" && (tv8.getText()=="None" || tv8.getText()=="Tense"|| tv8.getText()=="Modals" || tv8.getText()=="Preposition" || tv9.getText()=="None" || tv9.getText()=="Physics"|| tv9.getText()=="Chemistry"|| tv9.getText()=="Biology"))
					{
						Intent i=new Intent(getApplicationContext(), Ms1.class);
						Bundle extra=new Bundle();
						extra.putString("name", n);
						i.putExtras(extra);
						startActivity(i);
					}

					else if(tv8.getText()=="Tense" && (tv7.getText()=="None" || tv7.getText()=="Algebra" || tv7.getText()=="Trigonometery" || tv7.getText()=="Mesurement" || tv7.getText()=="Statistics" || tv9.getText()=="None" || tv9.getText()=="Physics"|| tv9.getText()=="Chemistry"|| tv9.getText()=="Biology"))
					{
						Intent i=new Intent(getApplicationContext(), Et1.class);
						Bundle extra=new Bundle();
						extra.putString("name", n);
						i.putExtras(extra);
						startActivity(i);
					}
					
					
					else if(tv8.getText()=="Modals" && (tv7.getText()=="None" || tv7.getText()=="Algebra" || tv7.getText()=="Trigonometery" || tv7.getText()=="Mesurement" || tv7.getText()=="Statistics" || tv9.getText()=="None" || tv9.getText()=="Physics"|| tv9.getText()=="Chemistry"|| tv9.getText()=="Biology"))
					{
						Intent i=new Intent(getApplicationContext(), Em1.class);
						Bundle extra=new Bundle();
						extra.putString("name", n);
						i.putExtras(extra);
						startActivity(i);
					}
					
					else if(tv8.getText()=="Preposition" && (tv7.getText()=="None" || tv7.getText()=="Algebra" || tv7.getText()=="Trigonometery" || tv7.getText()=="Mesurement" || tv7.getText()=="Statistics" || tv9.getText()=="None" || tv9.getText()=="Physics"|| tv9.getText()=="Chemistry"|| tv9.getText()=="Biology"))
					{
						Intent i=new Intent(getApplicationContext(), Ep1.class);
						Bundle extra=new Bundle();
						extra.putString("name", n);
						i.putExtras(extra);
						startActivity(i);
					}

					else if(tv9.getText()=="Physics" && (tv7.getText()=="None" || tv7.getText()=="Algebra" || tv7.getText()=="Trigonometery" || tv7.getText()=="Mesurement" || tv7.getText()=="Statistics" || tv8.getText()=="None" || tv8.getText()=="Tense"|| tv8.getText()=="Modals" || tv8.getText()=="Preposition"))
					{
						Intent i=new Intent(getApplicationContext(), Sp1.class);
						Bundle extra=new Bundle();
						extra.putString("name", n);
						i.putExtras(extra);
						startActivity(i);
					}
					
					else if(tv9.getText()=="Chemistry" && (tv7.getText()=="None" || tv7.getText()=="Algebra" || tv7.getText()=="Trigonometery" || tv7.getText()=="Mesurement" || tv7.getText()=="Statistics" || tv8.getText()=="None" || tv8.getText()=="Tense"|| tv8.getText()=="Modals" || tv8.getText()=="Preposition"))
					{
						Intent i=new Intent(getApplicationContext(), Sc1.class);
						Bundle extra=new Bundle();
						extra.putString("name", n);
						i.putExtras(extra);
						startActivity(i);
					}
					
					else if(tv9.getText()=="Biology" && (tv7.getText()=="None" || tv7.getText()=="Algebra" || tv7.getText()=="Trigonometery" || tv7.getText()=="Mesurement" || tv7.getText()=="Statistics" || tv8.getText()=="None" || tv8.getText()=="Tense"|| tv8.getText()=="Modals" || tv8.getText()=="Preposition"))
					{
						Intent i=new Intent(getApplicationContext(), Sb1.class);
						Bundle extra=new Bundle();
						extra.putString("name", n);
						i.putExtras(extra);
						startActivity(i);
					}

				}
			});

	        
	}
}