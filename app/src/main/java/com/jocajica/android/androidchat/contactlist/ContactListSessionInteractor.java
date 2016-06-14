package com.jocajica.android.androidchat.contactlist;

/**
 * Created by Joan Carles Jiménez on 14/06/2016.
 */
public interface ContactListSessionInteractor {
    void signOff();
    String getCurrentUserEmail();
    void changeConnectionStatus(boolean online);
}
