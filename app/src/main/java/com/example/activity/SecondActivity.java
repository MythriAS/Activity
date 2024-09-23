package com.example.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            String value=bundle.getString("value");
            TextView textView=findViewById(R.id.txt);
            textView.setText(value);
        }
    }
}
