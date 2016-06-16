package com.jocajica.android.androidchat.addcontact;

import com.jocajica.android.androidchat.addcontact.AddContactPresenter;
import com.jocajica.android.androidchat.addcontact.events.AddContactEvent;
import com.jocajica.android.androidchat.addcontact.ui.AddContactView;

/**
 * Created by jcarles on 16/06/2016.
 */
public class AddContactPresenterImpl implements AddContactPresenter {

    private AddContactView view;

    public AddContactPresenterImpl(AddContactView view) {
        this.view = view;
    }

    @Override
    public void onShow() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void addContact(String email) {

    }

    @Override
    public void onEventMainThread(AddContactEvent event) {

    }
}
