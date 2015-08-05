package com.example.craig.androidtests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Craig on 5/08/2015.
 */
public class LoginScreen extends Activity{
    EditText email_address;
    EditText username;
    EditText password;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        email_address = (EditText)findViewById(R.id.email_address);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        signup = (Button)findViewById(R.id.sign_up);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_email_address = email_address.getText().toString();
                String user_username = username.getText().toString();
                String user_password = password.getText().toString();
                Intent user_information = new Intent(LoginScreen.this,UserInformation.class);
                user_information.putExtra("user_email_address",user_email_address);
                user_information.putExtra("user_username",user_username);
                user_information.putExtra("user_password",user_password);
                startActivity(user_information);
            }
        });
    }

}
