package com.bignerdranch.week2android.week2firstapp;

/**
 * Created by jmc041 on 3/08/2017.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean mAnswerTrue) {
        mTextResId = textResId;
        mAnswerTrue = mAnswerTrue;
    }
    //GETTER & SETTER FOR TEXT RESID
    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    // GETTER & SETTER FOR ANSWER TRUE
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
