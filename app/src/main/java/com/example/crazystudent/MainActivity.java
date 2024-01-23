package com.example.crazystudent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button btn = findViewById(R.id.button); // create button
        //create a listener and action
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("my activity app","dodo");
                Toast.makeText(MainActivity.this,"you presset",Toast.LENGTH_LONG).show();
            }
        });
    }
}