package com.example.offlinequize;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizeResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize_results);

        final AppCompatButton startNewBtn =findViewById(R.id.startNewQuizeBtn);
        final TextView correctAnswer = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswers = findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("correct",0);
        final int getIncorrectAnswers =getIntent().getIntExtra("incorrect",0);

        correctAnswer.setText("Correct Answers : "+String.valueOf(getCorrectAnswers));
        incorrectAnswers.setText("Incorrect Answers : "+String.valueOf(getIncorrectAnswers));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(QuizeResults.this,MainActivity.class));
                finish();

            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizeResults.this,MainActivity.class));
        finish();
    }
}