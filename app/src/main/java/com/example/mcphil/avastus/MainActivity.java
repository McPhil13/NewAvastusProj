package com.example.mcphil.avastus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread=new Thread() {
            @Override
            public void run(){
                try {
                    sleep(3*1000);
                    Intent i=new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(i);
                }
                catch (Exception ex)
                {}
            }
        };
        thread.start();


    }
}
