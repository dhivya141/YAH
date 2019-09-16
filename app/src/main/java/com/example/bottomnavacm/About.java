package com.example.bottomnavacm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {
TextView textView1;
TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView1 = (TextView) findViewById(R.id.head);
        textView2 = (TextView) findViewById(R.id.para);
        setContentView(R.layout.activity_about);
    }
}
