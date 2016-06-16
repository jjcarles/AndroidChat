package com.jocajica.android.androidchat.addcontact.events;

/**
 * Created by Falken on 15/06/2016.
 */
public class AddContactEvent {
    boolean error = false;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
