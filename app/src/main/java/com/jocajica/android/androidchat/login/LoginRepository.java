package com.jocajica.android.androidchat.login;

/**
 * Created by jcarles on 09/06/2016.
 */
public interface LoginRepository {
    void signUp(String email, String password);
    void signIn(String email, String password);
    void checkSession();
}
