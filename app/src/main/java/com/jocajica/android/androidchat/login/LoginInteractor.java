package com.jocajica.android.androidchat.login;

/**
 * Created by jcarles on 09/06/2016.
 */
public interface LoginInteractor {
    void checkSession();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
