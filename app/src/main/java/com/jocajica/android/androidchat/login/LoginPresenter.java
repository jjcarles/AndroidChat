package com.jocajica.android.androidchat.login;

/**
 * Created by jcarles on 09/06/2016.
 */
public interface LoginPresenter {
    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String password);
}
