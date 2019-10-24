package ru.mirea.saidova.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity_intentApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second_intent_app);
//        //TextView txt = (TextView) findViewById(R.id.txt);
        //Bundle arguments = getIntent().getExtras();
        //String name = arguments.getString("date");
        //String name = getIntent().getStringExtra("date");
        //String text = (String) getIntent().getSerializableExtra("date");
        //txt.setText(text);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_intent_app);
        String text = (String) getIntent().getSerializableExtra("key");
        TextView textView = findViewById(R.id.txt);
        textView.setText(text);

    }
}
