package com.engelsimmanuel.nancy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button plusButton;
    Button minusButton;
    TextView scoreText;
    TextView errorText;

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusButton = findViewById(R.id.plus);
        minusButton = findViewById(R.id.minus);
        scoreText = findViewById(R.id.scores);
        errorText = findViewById(R.id.error_text);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // whatever event you want to happen
                // whenever a user clicks this button
                // add 1 to score then display the result in the score text in our XML Code
                // score cannot be more than 100
                // lets add this logic to our code too
                if (score == 100) {
                    errorText.setText("Score cannot be more than 100");
                } else {
                    score = score + 1; // what this means is literally new score = 0+1 = 1
                    // new score will now be 1 here
                    scoreText.setText(String.valueOf(score)); //score
                    if (errorText.getText().toString() != "") {
                        errorText.setText("");
                    }
                }
            }
        });

        // the second we press plus button the old score 1 will become 1

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (score == 0) {
                    //statement(s);
                    errorText.setText("Score cannot be less than 0");
                } else {
                    //statements(s);
                    score = score - 1;
                    scoreText.setText(String.valueOf(score));
                    if (errorText.getText().toString() != "") {
                        errorText.setText("");
                    }
                }
            }
        });

    }
}