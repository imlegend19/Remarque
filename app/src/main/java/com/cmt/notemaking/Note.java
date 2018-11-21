package com.cmt.notemaking;

import android.content.Context;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


public class Note implements Serializable {

    private long mDateTime;
    private String mTitle; //title of the note
    private String mContent; //content of the note

    Note(long DateTime, String Title, String Content) {
        this.mDateTime = DateTime;
        this.mTitle = Title;
        this.mContent = Content;

    }


    long getmDateTime() {
        return mDateTime;
    }

    public void setmDateTime(long mDateTime)
    {
        this.mDateTime=mDateTime;
    }

    String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle)
    {
        this.mTitle=mTitle;
    }


    String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    String getDateTimeFormatted(Context context) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"
                , context.getResources().getConfiguration().locale);
        formatter.setTimeZone(TimeZone.getDefault());
        return formatter.format(new Date(mDateTime));
    }
}
