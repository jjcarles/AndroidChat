package com.jocajica.android.androidchat.contactlist.ui;

import com.jocajica.android.androidchat.entities.User;

/**
 * Created by Joan Carles Jiménez on 14/06/2016.
 */
public interface ContactListView {
    void onContactAdded(User user);
    void onContactChanged(User user);
    void onContactRemoved(User user);
}
