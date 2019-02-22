package com.example.loginprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView fromOtherActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        fromOtherActivity = findViewById(R.id.textView);
        Intent prof = getIntent();
        String username = prof.getStringExtra("Name");
        fromOtherActivity.setText(username);


    }
}
