package com.android.t2dbabz.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(submitButtonOnClickListener);
    }

    private void checkQuestionOneAnswers(){
        CheckBox questionOneOlu = (CheckBox) findViewById(R.id.checkboxQuest1AnswerOlu);
        CheckBox questionOneBuhari = (CheckBox) findViewById(R.id.checkboxQuest1AnswerBuhari);
        CheckBox questionOneAtiku = (CheckBox) findViewById(R.id.checkboxQuest1AnswerAtiku);
        boolean isQuestionOneOlu = questionOneOlu.isChecked();
        boolean isQuestionOneBuhari = questionOneBuhari.isChecked();
        boolean isQuestionOneAtiku = questionOneAtiku.isChecked();

        if (isQuestionOneBuhari && !isQuestionOneOlu && !isQuestionOneAtiku){
            correctAnswers += 1;
        }
    }

    private void checkQuestionTwoAnswers(){
        RadioButton radioButtonJun= (RadioButton) findViewById(R.id.radio_Jun12);
        boolean isQuestionTwoChecked = radioButtonJun.isChecked();
        if (isQuestionTwoChecked){
            correctAnswers += 1;
        }
    }

    private String getQuestionThreeUserInput() {
        EditText userInputLastName = (EditText) findViewById(R.id.answerInputUserFirstAndLastName);
        String name = userInputLastName.getText().toString();
        return name;
    }

    private void checkQuestionThreeAnswer(){
        String name = getQuestionThreeUserInput();
        if (name.trim().equalsIgnoreCase("Abuja")){
            correctAnswers += 1;
        }
    }

    private void checkQuestionFourAnswers(){
        RadioButton radioButtonGodwin = (RadioButton) findViewById(R.id.radio_Godwin);
        boolean isQuestionFourChecked = radioButtonGodwin.isChecked();
        if (isQuestionFourChecked){
            correctAnswers += 1;
        }
    }

    private void checkQuestionFiveAnswers(){
        CheckBox questionFiveLeg = (CheckBox) findViewById(R.id.checkboxQuestLeg);
        CheckBox questionFiveJud = (CheckBox) findViewById(R.id.checkboxQuestJud);
        CheckBox questionFiveElect = (CheckBox) findViewById(R.id.checkboxQuestElection);
        CheckBox questionFiveExec = (CheckBox) findViewById(R.id.checkboxQuestExec);
        CheckBox questionFiveMerc = (CheckBox) findViewById(R.id.checkboxQuestMerch);
        CheckBox questionFiveArmy = (CheckBox) findViewById(R.id.checkboxQuestArmy);
        boolean isQuestionFiveLeg = questionFiveLeg.isChecked();
        boolean isQuestionFiveJudChecked = questionFiveJud.isChecked();
        boolean isQuestionFiveExecChecked = questionFiveExec.isChecked();


        if (isQuestionFiveJudChecked && isQuestionFiveLeg && isQuestionFiveExecChecked ){
            correctAnswers += 1;
        }
    }

    private void checkQuestionSixAnswers(){
        RadioButton radioButtonMan= (RadioButton) findViewById(R.id.radio_Man);
        boolean isQuestionSixChecked = radioButtonMan.isChecked();
        if (isQuestionSixChecked){
            correctAnswers += 1;
        }

    }
    private void checkQuestionSevenAnswers(){
        RadioButton radioButtonMbu= (RadioButton) findViewById(R.id.radio_Mbu);
        boolean isQuestionSevenChecked = radioButtonMbu.isChecked();
        if (isQuestionSevenChecked){
            correctAnswers += 1;
        }
    }
    private void checkQuestionEightAnswers(){
        RadioButton radioButtonLai= (RadioButton) findViewById(R.id.radio_Lai);
        boolean isQuestionEightChecked = radioButtonLai.isChecked();
        if (isQuestionEightChecked){
            correctAnswers += 1;
        }
    }

    private void checkQuestionNineAnswers(){
        RadioButton radioButton774= (RadioButton) findViewById(R.id.radio_774);
        boolean isQuestionNineChecked = radioButton774.isChecked();
        if (isQuestionNineChecked){
            correctAnswers += 1;
        }
    }

    private void checkQuestionTenAnswers(){
        RadioButton radioButtonJan73= (RadioButton) findViewById(R.id.radio_Jan73);
        boolean isQuestionTenChecked = radioButtonJan73.isChecked();
        if (isQuestionTenChecked){
            correctAnswers += 1;
        }
    }

    private void checkAllQuestions(){
        checkQuestionOneAnswers();
        checkQuestionTwoAnswers();
        checkQuestionThreeAnswer();
        checkQuestionFourAnswers();
        checkQuestionFiveAnswers();
        checkQuestionSixAnswers();
        checkQuestionSevenAnswers();
        checkQuestionEightAnswers();
        checkQuestionNineAnswers();
        checkQuestionTenAnswers();
    }

    private void resetCounterCorrectAnswers(){
        correctAnswers = 0;
    }

    final View.OnClickListener submitButtonOnClickListener = new View.OnClickListener() {
        public void onClick(final View v){
            checkAllQuestions();
            Toast.makeText(MainActivity.this, "Correct Answers: " + correctAnswers + "/10",
                    Toast.LENGTH_LONG).show();
            resetCounterCorrectAnswers();
        }
    };

}
