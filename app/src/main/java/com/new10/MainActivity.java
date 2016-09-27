package com.new10;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity  {
	
	ImageView iv;
	TextView tv;
	Button submit,proceed;
	EditText et;
	 String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        iv=(ImageView) findViewById(R.id.imageView1);
        tv=(TextView) findViewById(R.id.textView1);
        et=(EditText) findViewById(R.id.editText1);
        submit=(Button) findViewById(R.id.button1);
        proceed=(Button) findViewById(R.id.button2);
       
        submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				s=et.getText().toString();
		        if(s.isEmpty())
		        {
		        	et.setError("The item cannot be empty");
		        }
		        else if(s.isEmpty()==false){ 
		        	et.setText(s);
                                       
		        	Toast.makeText(getApplicationContext(), s + ", you can proceed now", Toast.LENGTH_SHORT).show();
		        }
			}
		});
      
        proceed.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				s=et.getText().toString();
		        if(s.isEmpty())
		        {
		        	et.setError("The item cannot be empty");
		        }
		        else if(s.isEmpty()==false){  
		        	
				Toast.makeText(getApplicationContext(), "Welcome  "+s, Toast.LENGTH_SHORT).show();
				Intent i=new Intent(getApplicationContext(), Start.class);
				
				Bundle extra=new Bundle();
				extra.putString("name", s);
				i.putExtras(extra);
				startActivity(i);
		        }
			
		}
    });
     
    }
}
