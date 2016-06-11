package com.jocajica.android.androidchat.entities;

import java.util.Map;

/**
 * Created by Joan Carles Jiménez on 11/06/2016.
 */
public class User {
    public final static boolean ONLINE = true;
    public final static boolean OFFLINE = false;

    String email;
    boolean online;
    Map<String, Boolean> contacts;

    public User() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public Map<String, Boolean> getContacts() {
        return contacts;
    }

    public void setContacts(Map<String, Boolean> contacts) {
        this.contacts = contacts;
    }
}
