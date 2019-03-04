package com.example.ece387counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {
    int count = 0;
    TextView textView = null;
    Button button = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);
        textView.setText(Integer.toString(count));



    }
    public void sendCount(View w){
        count++;
        textView.setText(Integer.toString(count));
    }
}

