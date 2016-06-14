package com.jocajica.android.androidchat.contactlist;

/**
 * Created by Joan Carles Jiménez on 14/06/2016.
 */
public interface ContactListInteractor {
    void subscribe();
    void unsubscribe();
    void destroyListener();
    void removeContact(String email);
}
