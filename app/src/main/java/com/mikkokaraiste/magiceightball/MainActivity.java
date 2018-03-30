
package com.mikkokaraiste.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Answers mAnswers;
    private Random mRandom;
    private TextView mAnswerTextView;
    private ImageView mAnswerImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAnswers = new Answers();
        mRandom = new Random();
        mAnswerTextView = findViewById(R.id.answerTextView);
        mAnswerImageView = findViewById(R.id.answerImageView);

        mAnswerImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomize();
            }
        });
    }

    private void randomize() {
        int randomizeAnswerArray = mRandom.nextInt(3);
        int randomizePositiveAnswer = mRandom.nextInt(mAnswers.getPositiveAnswers().length);
        int randomizeNegativeAnswer = mRandom.nextInt(mAnswers.getNegativeAnswers().length);
        int randomizeCommittalAnswer = mRandom.nextInt(mAnswers.getNonCommittalAnswers().length);

        if (randomizeAnswerArray == 0) {
            Log.d("Positive: ", "randomize: " + mAnswers.getPositiveAnswer(randomizePositiveAnswer));
            mAnswerTextView.setText(mAnswers.getPositiveAnswer(randomizePositiveAnswer));
        } else if (randomizeAnswerArray == 1) {
            Log.d("Negative: ", "randomize: " + mAnswers.getNegativeAnswer(randomizeNegativeAnswer));
            mAnswerTextView.setText(mAnswers.getNegativeAnswer(randomizeNegativeAnswer));
        } else {
            Log.d("Committal: ", "randomize: " + mAnswers.getNonCommittalAnswer(randomizeCommittalAnswer));
            mAnswerTextView.setText(mAnswers.getNonCommittalAnswer(randomizeCommittalAnswer));
        }

    }
}