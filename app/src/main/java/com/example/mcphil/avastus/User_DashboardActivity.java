package com.example.mcphil.avastus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class User_DashboardActivity extends AppCompatActivity {

    private Button btnProfile;
    private Button btnLibrary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__dashboard);

        btnProfile = (Button) findViewById(R.id.btnProfile);
        btnLibrary = (Button) findViewById(R.id.btnLibrary);

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(User_DashboardActivity.this, ProfileActivity.class));
            }
        });
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(User_DashboardActivity.this, LibraryActivity.class));
            }
        });

    }
}
