package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    public static Object CLASS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView n = findViewById(R.id.textView2);
        TextView a = findViewById(R.id.textView3);
        TextView j = findViewById(R.id.textView4);
        TextView p = findViewById(R.id.textView5);
        TextView e = findViewById(R.id.textViewEmail);
        Bundle airport = getIntent().getExtras();

        n.setText(airport.getString("info"));
        a.setText(airport.getString("inf"));
        j.setText(airport.getString("in"));
        p.setText(airport.getString("i"));
        e.setText(airport.getString("fo"));
        TextView address = (TextView) findViewById(R.id.textViewEmail);
        ImageButton c = findViewById(R.id.imageButton4);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });


        ImageButton b = findViewById(R.id.imageButtonCall);

    }

    public void onCallButton(View v) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:65060556"));
        startActivity(intent);
    }




}

