package com.soa4id.tec.resources;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mPlaceHolderTextView;

    @SuppressLint("StringFormatInvalid")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlaceHolderTextView = findViewById(R.id.activity_main_textView2);
        mPlaceHolderTextView.setText(getString(R.string.label1,"format 1", "format 1"));


    }
}
