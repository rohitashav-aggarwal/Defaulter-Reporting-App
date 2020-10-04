package com.example.DefaulterReporting;

import java.util.Date;
import java.util.UUID;

// Model class
public class Crime {

    // unique id
    private UUID mId;

    // description of the crime
    private String mTitle;

    // date of the crime
    private Date mDate;

    // is the case solved or not
    private boolean mSolved;

    // constructor that initializes the id and date field
    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
