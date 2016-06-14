package com.jocajica.android.androidchat.contactlist;

import com.jocajica.android.androidchat.contactlist.events.ContactListEvent;

/**
 * Created by Joan Carles Jiménez on 14/06/2016.
 */
public interface ContactListPresenter {
    void onPause();
    void onResume();
    void onCreate();
    void onDestroy();

    void signOff();
    void removeContact(String email);
    void onEventMainThread(ContactListEvent event);

    String getCurrentUserEmail();
}
