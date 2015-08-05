package com.example.craig.androidtests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Craig on 5/08/2015.
 */
public class UserInformation extends Activity {

    TextView display_username;
    //ImageView display_userpicture;
    TextView display_user_email_address;
    TextView bio;
    TextView display_user_bio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_information);
        display_username = (TextView) findViewById(R.id.display_username);
        display_user_email_address = (TextView) findViewById(R.id.display_email_address);
        bio = (TextView) findViewById(R.id.bio);
        display_user_bio = (TextView) findViewById(R.id.display_user_bio);

        Intent user_information = getIntent();
        display_username.setText(user_information.getStringExtra("user_username"));
        display_user_email_address.setText(user_information.getStringExtra("user_email_address"));
        bio.setText("User Bio");
    }
}
