package com.jocajica.android.androidchat.addcontact.ui;

/**
 * Created by Falken on 15/06/2016.
 */
public interface AddContactView {
    void showInput();
    void hideInput();
    void showProgress();
    void hideProgress();

    void contactAdded();
    void contactNotAdded();
}
