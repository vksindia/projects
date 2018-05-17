package com.example.edittext1demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ValidationActivity extends Activity {

	EditText email;
	EditText Password;
	Button login;
	Pattern pattern;
    Matcher matcher;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_validation);
		email=(EditText)findViewById(R.id.editText1);
		Password=(EditText)findViewById(R.id.editText2);
		login=(Button)findViewById(R.id.button1);
		login.setOnClickListener(new OnClickListener() {
			
/*	        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$";
*/
		
			@SuppressWarnings("unused")
			String passwrd=Password.getText().toString();
			
			
			@Override
			public void onClick(View v) {
				String name=email.getText().toString();
				
				
				if (!isValidEmail(name)) 
				{
					email.setError("Invalid Email");
				}

				
				else if(!validPassword(Password.getText().toString())) {
					Password.setError("Please enter valid Password");
				}
				
				else
				{
					Toast.makeText(ValidationActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
				}

			}
				
			
		});
	}

	// validating email id
		private boolean isValidEmail(String email) {
			String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

			Pattern pattern = Pattern.compile(EMAIL_PATTERN);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();
		}

		
		// validating password with retype password
		private boolean validPassword(String passwrd) {
			
		/*	String Password_PATTERN= " ^.*(?=.{4,10})(?=.*\\d)(?=.*[a-zA-Z]).*$";     Password should contain only
																										At least 8 chars
																										Contains at least one digit
																										Contains at least one lower alpha char and one upper alpha char
																										Contains at least one char within a set of special chars (@#%$^ etc.)
																										Does not contain space, tab, 

			Pattern pattern = Pattern.compile(Password_PATTERN);
			Matcher matcher = pattern.matcher(pass);
			return matcher.matches();*/
			
			 
			    final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";
			    pattern = Pattern.compile(PASSWORD_PATTERN);
			    matcher = pattern.matcher(passwrd);

			    return matcher.matches();
		
		}
			
}
