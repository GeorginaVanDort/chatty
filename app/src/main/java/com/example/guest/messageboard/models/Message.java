package com.example.guest.messageboard.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Guest on 6/5/17.
 */

public class Message {
    String userName;
    String message;
    String category;
    String dateTime;

    private static final DateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy\nHH:mm:ss");



    public Message(String userName, String message, String category) {
        this.userName = userName;
        this.message = message;
        this.category = category;
        this.dateTime = sdf.format(new Date());
    }

    public String getUserName() {
        return userName;
    }

    public String getMessage() {
        return message;
    }

    public String getCategory() {
        return category;
    }

    public String getDateTime() {
        return dateTime;
    }
}
