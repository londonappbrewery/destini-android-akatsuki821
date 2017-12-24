package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex;

    private questionPath[] mQuestionPathBank = new questionPath[] {
            new questionPath(R.string.T1_Story, 2, 1, R.string.T1_Ans1, R.string.T1_Ans2),
            new questionPath(R.string.T2_Story, 2, 3, R.string.T2_Ans1, R.string.T2_Ans2),
            new questionPath(R.string.T3_Story, 5, 4, R.string.T3_Ans1, R.string.T3_Ans2),
            new questionPath(R.string.T4_End, -1, -1, -1, -1),
            new questionPath(R.string.T5_End, -1, -1, -1, -1),
            new questionPath(R.string.T6_End, -1, -1, -1, -1)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryIndex = 0;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionUpdate("top");
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                questionUpdate("bottom");
            }
        });

    }
    private void questionUpdate(String button) {
        if (button == "top") {
            mStoryIndex = mQuestionPathBank[mStoryIndex].getTopQuestionIndex();
            mStoryTextView.setText(mQuestionPathBank[mStoryIndex].getQuestionId());
            int topAnsIndex = mQuestionPathBank[mStoryIndex].getAnsOneId();
            int bottomAnsIndex = mQuestionPathBank[mStoryIndex].getAnsTwoId();
            if (topAnsIndex != -1) {
                mButtonTop.setText(topAnsIndex);
            } else {
                mButtonTop.setVisibility(View.GONE);
            }
            if (bottomAnsIndex != -1) {
                mButtonBottom.setText(bottomAnsIndex);
            } else {
                mButtonBottom.setVisibility(View.GONE);
            }
        }
        else if (button == "bottom") {
            mStoryIndex = mQuestionPathBank[mStoryIndex].getBottomQuestionIndex();
            mStoryTextView.setText(mQuestionPathBank[mStoryIndex].getQuestionId());
            int topAnsIndex = mQuestionPathBank[mStoryIndex].getAnsOneId();
            int bottomAnsIndex = mQuestionPathBank[mStoryIndex].getAnsTwoId();
            if (topAnsIndex != -1) {
                mButtonTop.setText(topAnsIndex);
            } else {
                mButtonTop.setVisibility(View.GONE);
            }
            if (bottomAnsIndex != -1) {
                mButtonBottom.setText(bottomAnsIndex);
            } else {
                mButtonBottom.setVisibility(View.GONE);
            }
        }
    }
}
