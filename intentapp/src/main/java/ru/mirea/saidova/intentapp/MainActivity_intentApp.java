package ru.mirea.saidova.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity_intentApp extends AppCompatActivity {
    TextView textView1;
    String dateString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intent_app);
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        dateString = sdf.format(new Date(dateInMillis));
        textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText(dateString);
        //Button btnActTwo = (Button) findViewById(R.id.btnActTwo);
        //btnActTwo.setOnClickListener(this);
    }

    public void clickForNewAct(View view) {
//        Intent intent = new Intent(MainActivity_intentApp.this, SecondActivity_intentApp.class);
//        //textView1 = (TextView) findViewById(R.id.textView1);
//        intent.putExtra("date", dateString);
//        startActivity(intent);
////        switch (view.getId()) {
//            case R.id.btnActTwo:
//                textView1 = (TextView) findViewById(R.id.textView1);
//                Intent intent = new Intent(this, SecondActivity_intentApp.class);
//                intent.putExtra("date", textView1.getText());
//                startActivity(intent);
//                break;
//            default:
//                break;
//        }
        Intent intent = new Intent(MainActivity_intentApp.this, SecondActivity_intentApp.class);
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        intent.putExtra("key", textView1.getText());
        startActivity(intent);


    }}
