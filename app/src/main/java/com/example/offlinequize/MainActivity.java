package com.example.offlinequize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout html = findViewById(R.id.htmlLayout);
        final LinearLayout android = findViewById(R.id.androidLayout);

        final Button startBtn;
        startBtn = this.<Button>findViewById(R.id.startQuizebtn);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "java";

                java.setBackgroundResource(R.drawable.round_back_white_stroke10);

                php.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        php.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                selectedTopicName = "php";

                php.setBackgroundResource(R.drawable.round_back_white_stroke10);

                java.setBackgroundResource(R.drawable.round_back_white10);
                html.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "html";

                html.setBackgroundResource(R.drawable.round_back_white_stroke10);

                php.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "android";

                android.setBackgroundResource(R.drawable.round_back_white_stroke10);

                php.setBackgroundResource(R.drawable.round_back_white10);
                java.setBackgroundResource(R.drawable.round_back_white10);
                android.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this,"Please select the topic !!",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,QuizeActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}