package com.example.bitbyte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationPage extends Activity {
	
	public final static boolean isValidEmail(CharSequence target) {
	    if (target == null) {
	        return false;
	    } else {
	        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
	    }
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration_page);
		Button b = (Button) findViewById(R.id.SignIn);
		Button n = (Button) findViewById(R.id.NewUser);
		final EditText t1 = (EditText) findViewById(R.id.email_address);
		final EditText t2 = (EditText) findViewById(R.id.Password);
		b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			String a,c;
				a = (t1.getText().toString());
				c = (t2.getText().toString());
				if(a.equals("")){
					Toast.makeText(RegistrationPage.this, "Please enter your email address", Toast.LENGTH_LONG).show();
				}
				else{
					isValidEmail(a);
					/*IF else condition to connect to your backend: IF to backend and else to "Sorry bro"*/
				}
							
			}
			
		});
n.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		// write code to connect to the net page
		 Intent intent = new Intent(RegistrationPage.this, RegistrationScreen.class);
		startActivity(intent);
	}
});
		
	}
}