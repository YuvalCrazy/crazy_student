package com.example.crazystudent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonAdd, buttonSub, buttonMulti, buttonDiv;
    EditText editTextN1, editTextN2;
    TextView textView;
    int num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.btn_add);
        buttonSub = findViewById(R.id.btn_sub);
        buttonMulti = findViewById(R.id.btn_multi);
        buttonDiv = findViewById(R.id.btn_div);
        editTextN1 = findViewById(R.id.text1);
        editTextN2 = findViewById(R.id.text2);
        textView = findViewById(R.id.ans);


        buttonAdd.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonMulti.setOnClickListener(this);
        buttonSub.setOnClickListener(this);


    }

    public int getIntFromEditText(EditText editText) {
        if (editText.getText().toString().equals("")) {
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        } else
            return Integer.parseInt(editText.getText().toString());


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextN1);
        num2 = getIntFromEditText(editTextN2);
        if (view.getId() == R.id.btn_add) {
            textView.setText("answer = " + (num1 + num2));
        }
        if (R.id.btn_sub == view.getId()) {
            textView.setText("answer = " + (num1 - num2));
        }

        if (R.id.btn_multi == view.getId()) {
            textView.setText("answer = " + (num1 * num2));
        }

        if (R.id.btn_div == view.getId()) {
            textView.setText("answer = " + ((float) num1 / (float) num2));
        }


    }

}