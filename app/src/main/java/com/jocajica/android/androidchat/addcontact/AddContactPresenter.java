package com.jocajica.android.androidchat.addcontact;

import com.jocajica.android.androidchat.addcontact.events.AddContactEvent;

/**
 * Created by Falken on 15/06/2016.
 */
public interface AddContactPresenter {
    void onShow();
    void onDestroy();

    void addContact(String email);
    void onEventMainThread(AddContactEvent event);
}
